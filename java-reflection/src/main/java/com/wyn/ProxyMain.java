package com.wyn;

import com.wyn.annotation.ApiClient;
import com.wyn.annotation.Get;
import com.wyn.annotation.Post;
import com.wyn.model.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyMain {

    static void main() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) {
                Class<?> clazz = method.getDeclaringClass();
                if(clazz.isAnnotationPresent(ApiClient.class)){
                    ApiClient apiClient = clazz.getAnnotation(ApiClient.class);
                    IO.println(apiClient.name());
                } else {
                    IO.println(method.getDeclaringClass().getSimpleName());
                }

                if(method.getName().equals("posting")){
                    IO.print( "posting ");
                    IO.println(getAnnotationName(method));
                } else {
                    IO.print("other method ");
                    IO.println(getAnnotationName(method));
                }

                return null;
            }
        };

        Order order = (Order) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Order.class}, invocationHandler);
        order.posting();
        order.getOrder();
        order.cancel();
    }

    private static String getAnnotationName(Method method){
        if(method.isAnnotationPresent(Post.class)){
            return "Annotated By Post";
        } else if (method.isAnnotationPresent(Get.class)){
            return "Annotated By Get";
        } else {
            return "Method Not Annotated";
        }
    }
}
