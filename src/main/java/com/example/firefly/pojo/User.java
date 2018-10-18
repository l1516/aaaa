package com.example.firefly.pojo;


public class User extends CommonPoJo {

    public User() {

    }

    public User(String name) {
        this.setName(name);
    }

    private String age;
    private String password;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
