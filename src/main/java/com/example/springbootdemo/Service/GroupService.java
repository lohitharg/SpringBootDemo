package com.example.springbootdemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    @Autowired
    @Qualifier("professors")
    Group group;
}
