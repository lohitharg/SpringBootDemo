package com.example.springbootdemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class Professors implements Group{

    Student student;
    @Autowired
    @Lazy
    public Professors(Student student){
        this.student=student;
}}
