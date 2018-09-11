package com.example.firefly.service.zhuangshiqi;

public class InterfaceImpl1 implements SuperClass {

    @Override
    public String getName(String name) {
        System.out.println("我是接口实现1");
        return name;
    }
}
