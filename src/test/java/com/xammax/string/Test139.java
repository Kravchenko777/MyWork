package com.xammax.string;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Test139 {

    @Test
    void test(){

    }

    public boolean wordBreak(String s, List<String> wordDict) {
        for(String str:wordDict){
            String old = s;
            s = s.replace(str,"");
            if(old.equals(s)) return false;
        }

        return true;
    }
}
