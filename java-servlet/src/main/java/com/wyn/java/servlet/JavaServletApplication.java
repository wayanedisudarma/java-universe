package com.wyn.java.servlet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

/**
 * @author : wayan.sudarma
 * @created : 21/05/2026, Thursday
 **/

public class JavaServletApplication {

  public static void main(String[] args) throws LifecycleException {

    Tomcat tomcat = new Tomcat();

    tomcat.setPort(8080);
    tomcat.getConnector();
    String docBase = new File(".").getAbsolutePath();
    Context context = tomcat.addContext("", docBase);

    String servletName = "helloServlet";
    Tomcat.addServlet(context, servletName, new HelloServlet());

    context.addServletMappingDecoded("/hello/*", servletName);

    System.out.println("Start Embedded Tomcat at port 8080...");
    tomcat.start();

    tomcat.getServer().await();

  }
}
