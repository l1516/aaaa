package com.example.firefly;

import com.example.firefly.service.LocationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDb {

    @Autowired
    private LocationService locationService;

//    @Autowired
//    private JpaRepository jpaRepository;

    @Test
    public void testSave() {
//        locationService.save(new Location("河南", "巩义"));

    }

    @Test
    public void testCommonSave() {
//        jpaRepository.save(new Location("北京", "石景山"));
//        jpaRepository.save(new User("张三"));
    }

}
