package com.wyn;

import com.wyn.model.User;

import java.lang.reflect.Method;
import java.util.Arrays;

public class InspectMethodMain {
    static void main() {
        Method[] methods = User.class.getDeclaredMethods();

        for(Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(Arrays.toString(method.getParameterTypes()));
            System.out.println(Arrays.toString(method.getExceptionTypes()));
            System.out.println(method.getModifiers());
            System.out.println(method.getDeclaringClass());
            System.out.println(method.getDeclaringClass().getName());
            System.out.println(method.getDeclaringClass().getSimpleName());
            System.out.println(method.getDeclaringClass().getCanonicalName());
            System.out.println(method.getDeclaringClass().getPackage());
            System.out.println(method.getDeclaringClass().getPackage().getName());
        }
    }
}
