package com.example.firefly;

import com.example.firefly.pojo.User;
import com.example.firefly.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.StringReader;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSerializable {

    @Autowired
    private UserService userService;

    @Test
    public void testSerializable() throws IOException {

        List<User> users = userService.findAll();
        ObjectOutputStream
            objectOutputStream =
            new ObjectOutputStream(new FileOutputStream(new File("D:/InterfaceImpl1.txt")));
        objectOutputStream.writeObject(users);
        objectOutputStream.close();
        StringReader a = new StringReader("InterfaceImpl1");

    }

}
