package com.xammax.task;

import org.junit.jupiter.api.Test;

public class Test22 {

    @Test
    void test(){
        System.out.println(strStr("aaaa", "a"));
    }

    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) return -1;
        return haystack.indexOf(needle);


    }
}
