package com.wyn;

import com.wyn.model.User;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethodMain {

    static void main() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User("wayan", "email");
        Method method = User.class.getMethod("setUsername", String.class, String.class);
        method.invoke(user, "saya", " wayan");
        IO.println(user.getUsername());
    }
}
