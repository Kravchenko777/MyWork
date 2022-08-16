package com.xammax.task;

import org.junit.jupiter.api.Test;

public class Test344 {

    @Test
    void test(){
        char[] s = new char[]{'h','e','l','l','o'};

        resutl(s);
    }

    private void resutl(char[] s){
        int cotrol = s.length/2;
        for(int i=0;i<s.length;i++){
            s[i] = (char) (s[i] + s[s.length-i - 1]);
            s[s.length-i-1] = (char) (s[i] - s[s.length-i - 1]);
            s[i] = (char) ( s[i] - s[s.length-i-1]);
            if(i>=cotrol-1) break;
       }

        System.out.println();

    }
}
