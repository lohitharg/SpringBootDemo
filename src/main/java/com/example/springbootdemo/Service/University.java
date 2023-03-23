package com.example.springbootdemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class University implements Group{

   @Autowired
    Student student;
}
