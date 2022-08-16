package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Test242 {

    @Test
    void test(){

    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);

        for(int i=0;i<chars.length;i++){
            if(chars[i]!=chart[i])return false;
        }

        return true;
    }
}
