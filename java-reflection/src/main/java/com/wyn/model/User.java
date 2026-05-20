package com.wyn.model;

import com.wyn.annotation.NotBlank;

public class User {

    @NotBlank
    private String username;

    @NotBlank
    private String email;

    public User(String username, String email){
        this.username = username;
        this.email = email;
    }

    public void setUsername(String firstname, String middleName){
        this.username = firstname + middleName;
    }

    public String getUsername(){
        return this.username;
    }
}
