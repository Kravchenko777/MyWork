package com.xammax;

import org.junit.jupiter.api.Test;

public class TestTest {

    @Test
    void test(){
        System.out.println(Thread.currentThread().getStackTrace());
        test2();
        System.out.println("1111111111");
        System.out.println(Thread.currentThread().getStackTrace());

        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()){
            System.out.println(stackTraceElement.getClassName());
        }
    }

    private void test1(){

    }
      private void test2(){
        test1();
      }
}
