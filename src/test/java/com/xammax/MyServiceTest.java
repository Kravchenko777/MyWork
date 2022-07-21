package com.xammax;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
public class MyServiceTest {

    @Autowired
    private MyService myService;


    @Test
    void test(){
        myService.makeWork();
    }
}
