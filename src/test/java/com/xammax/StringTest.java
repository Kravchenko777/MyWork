package com.xammax;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class StringTest {

    @Test
    void test12(){
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"I");
        hashMap.put(5,"V");
        hashMap.put(10,"X");
        hashMap.put(50,"L");
        hashMap.put(100,"C");
        hashMap.put(500,"D");
        hashMap.put(1000,"M");

    }

    public String result(HashMap<Integer,String> hashMap, int num){
        String result = "";
        int test1000 = num/1000;
        if(test1000>0){

        }

        return "";
    }
}
