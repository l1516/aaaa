package com.example.firefly.service.zhuangshiqi;

public class SubClass1 extends InterfaceImpl2 {

    public SubClass1(SuperClass superClass) {
        super(superClass);
    }

    public String getName(String name) {
        super.getName(name);
        System.out.println("我是子类1");
        return name;
    }
}
