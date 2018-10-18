package com.example.firefly.pojo;



public class Location extends CommonPoJo {

    private String city;

    public Location() {

    }

    public Location(String city, String name) {
        this.setName(name);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
