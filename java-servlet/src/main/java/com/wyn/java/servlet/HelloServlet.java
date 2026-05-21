package com.wyn.java.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author : wayan.sudarma
 * @created : 21/05/2026, Thursday
 **/

public class HelloServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    String pathInfo = req.getPathInfo();

    if (pathInfo == null || pathInfo.equals("/")) {
      resp.setContentType("text/plain");
      resp.getWriter().write("response from GET /hello");
      return;
    }

    if (pathInfo.equals("/data")) {
      resp.setContentType("application/json");
      resp.getWriter().write("{\"message\": \"This is Data From GET /hello/data\"}");
      return;
    }

    resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Page Not Found");
  }
}
