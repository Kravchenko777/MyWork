package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Test58 {

    @Test
    void test(){
        System.out.println(lengthOfLastWord("12312 123123 534 2342  2334234  555"));
    }

    public int lengthOfLastWord(String s) {
        if(s.trim().equals("")) return -1;
        String str = s.replace(" ",";");
        String[] strings = str.split(";");
        ArrayList<String> stringArrayList = new ArrayList<>();
        for(String s1: strings){
            if(!s1.equals(";"))stringArrayList.add(s1);
        }

        return stringArrayList.get(stringArrayList.size()-1).length();
    }

}
