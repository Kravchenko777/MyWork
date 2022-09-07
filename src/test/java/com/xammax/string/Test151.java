package com.xammax.string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Test151 {

    @Test
    void test(){
        System.out.println(reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        String result = "";
        List<String> stringList = Arrays.asList(s.split(" "));
        for(int i = stringList.size()-1;i>=0;i--){
            if(!stringList.get(i).equals(""))result = result +" "+ stringList.get(i);
        }
        return result.trim();
    }
}
