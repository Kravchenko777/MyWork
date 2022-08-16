package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Test383 {

    @Test
    void test(){
        result("aa","ab");
    }

    private boolean result(String ransomNote, String magazine){
        if(ransomNote.length()>magazine.length()) return false;
        for(char r: ransomNote.toCharArray()){
            if(!magazine.contains(String.valueOf(r))) return false;
            magazine= magazine.replaceFirst(String.valueOf(r),"");
        }

        return true;

    }
}
