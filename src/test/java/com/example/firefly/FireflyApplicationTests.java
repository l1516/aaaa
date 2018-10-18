package com.example.firefly;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest
public class FireflyApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testClassPath() {
        String path = this.getClass().getClassLoader().getResource("").toString();
        Object a = 2;
        Integer b = (Integer) a;
        Integer c = 3;
        Object d = c;
        System.err.println(path);
    }

}
