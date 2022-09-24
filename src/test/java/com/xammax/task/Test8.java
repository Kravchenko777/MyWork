package com.xammax.task;

import org.junit.jupiter.api.Test;

public class Test8 {

    @Test
    void test(){

        System.out.println(myAtoi("4193"));
    }


    public int myAtoi(String s) {
        int result = 0;
        s = s.trim();
        boolean minus = s.contains("-");

        for(int i =0;i<s.length();i++){
            if(s.charAt(i)>('0'-1) && s.charAt(i)<('9'+1)){
                result = result*10 + (s.charAt(i) - '0');
            }
        }

        if(minus) return -1*result;
        else return result;

    }
}
