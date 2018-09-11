package com.example.firefly;

import com.example.firefly.service.shipeiqi.DestinationClassImpl;
import com.example.firefly.service.shipeiqi.SourceClass;
import com.example.firefly.service.shipeiqi.SourceClassImpl;
import com.example.firefly.service.shipeiqi.SourceClassImpl2;
import com.example.firefly.service.zhuangshiqi.InterfaceImpl1;
import com.example.firefly.service.zhuangshiqi.InterfaceImpl2;
import com.example.firefly.service.zhuangshiqi.SubClass1;
import com.example.firefly.service.zhuangshiqi.SuperClass;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;


public class TestStrategy {

    private SourceClass sourceClass;

    /**
     * 测试适配器策略 2个接口的兼容
     */
    @Test
    public void testShiPeiQi() {
        sourceClass = new SourceClassImpl();
        String str = sourceClass.mp4();
        System.out.println(str);

        sourceClass = new SourceClassImpl2(new DestinationClassImpl());
        String b = sourceClass.mp4();
        System.out.println(b);
    }

    /**
     * 测试装饰器模式 子类之间的方法复用
     */
    @Test
    public void testZhuangShiQi() {
        SuperClass impl2 = new SubClass1(new InterfaceImpl1());
        System.out.println(impl2.getName("哈哈"));
    }

}
