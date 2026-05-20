package com.wyn;

import com.wyn.model.User;

import java.util.Arrays;

public class ClassMain {

    static void main() {
        Class<User> userClass = User.class;

        System.out.println(userClass.getSuperclass());
        System.out.println(Arrays.toString(userClass.getInterfaces()));
        System.out.println(Arrays.toString(userClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(userClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(userClass.getDeclaredFields()));
        System.out.println(userClass.getModifiers());
        System.out.println(userClass.getPackage());
        System.out.println(userClass.getName());
        System.out.println(userClass.getSimpleName());
    }
}
