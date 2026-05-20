package com.wyn;

import com.wyn.model.User;
import com.wyn.validator.NotBlankValidator;

public class ValidatorMain {
    static void main() throws IllegalAccessException {
        User user = new User("saya", "");
        NotBlankValidator.validate(user);
    }
}
