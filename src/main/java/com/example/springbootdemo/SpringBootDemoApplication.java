package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
try {
    SpringApplication.run(SpringBootDemoApplication.class, args);
} catch (Exception e) {
    e.printStackTrace();
}
    }

}
