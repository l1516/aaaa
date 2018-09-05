package com.example.firefly.shipeiqi;

import com.example.firefly.service.shipeiqi.DestinationClassImpl;
import com.example.firefly.service.shipeiqi.SourceClass;
import com.example.firefly.service.shipeiqi.SourceClassImpl;
import com.example.firefly.service.shipeiqi.SourceClassImpl2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestShiPeiQi {

    private SourceClass sourceClass;
    @Test
    public void test() {
        sourceClass = new SourceClassImpl();
        String str = sourceClass.mp4();
        System.out.println(str);

        sourceClass = new SourceClassImpl2(new DestinationClassImpl());
        String b = sourceClass.mp4();
        System.out.println(b);
    }


}
