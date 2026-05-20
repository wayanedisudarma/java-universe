package com.wyn.validator;

import com.wyn.annotation.NotBlank;

import java.lang.reflect.Field;

public class NotBlankValidator {

    public static void validate(Object object) throws IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();

        for(Field field : fields) {
            field.setAccessible(true);
            if(field.getAnnotation(NotBlank.class) != null) {
                String value = (String) field.get(object);
                if(value == null || value.isEmpty()) {
                    throw new RuntimeException(field.getName() + " must not blank");
                }
            }
        }
    }
}
