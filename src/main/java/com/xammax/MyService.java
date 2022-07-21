package com.xammax;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MyService {

    @PostConstruct
    void init(){
        System.out.println("test MyService");
    }

    public void makeWork(){
        System.out.println("get work");
    }
}
