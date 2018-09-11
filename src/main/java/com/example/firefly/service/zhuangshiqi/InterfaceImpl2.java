package com.example.firefly.service.zhuangshiqi;

public class InterfaceImpl2 implements SuperClass {

    private SuperClass superClass;

    public InterfaceImpl2(SuperClass superClass) {
        this.superClass = superClass;
    }

    @Override
    public String getName(String name) {
        superClass.getName(name);
        System.out.println("我是接口实现2");
        return name;
    }
}
