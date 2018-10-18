package com.example.firefly.pojo;


public class User extends CommonPoJo {

    private String age;
    private String password;

    public User() {

    }

    public User(String name, String password) {
        this.setName(name);
        this.setPassword(password);
    }

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
