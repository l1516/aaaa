package com.example.firefly;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;

@SpringBootApplication
public class FireflyApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(FireflyApplication.class, args);
        } catch (BeanCreationException e) {
            String startMysql = "net start MySQL80";
            try {
                Runtime.getRuntime().exec(startMysql);
                SpringApplication.run(FireflyApplication.class, args);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }

    }
}
