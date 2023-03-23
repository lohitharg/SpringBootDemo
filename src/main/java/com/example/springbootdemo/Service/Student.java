package com.example.springbootdemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    Professors professors;
@Autowired
    public Student(Professors professors){
    this.professors=professors;
}

}
