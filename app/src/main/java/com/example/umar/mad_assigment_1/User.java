package com.example.umar.mad_assigment_1;

/**
 * Created by umar on 23/12/2017.
 */

public class User {
    private String name;
    private int call;
    private String phone;
    private Boolean gender;

    public User(int call,String name, String phone) {
        this.name = name;
        this.call=call;
        this.phone = phone;
    }


    public int getCall() {
        return call;
    }
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Boolean getGender() {
        return gender;
    }
}
