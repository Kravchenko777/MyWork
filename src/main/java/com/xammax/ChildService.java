package com.xammax;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ChildService {

    private final MyService myService;

    public ChildService(MyService myService) {
        this.myService = myService;
    }

    @PostConstruct
    void init(){
        System.out.println("test ChildService");
        myService.makeWork();
    }
}
