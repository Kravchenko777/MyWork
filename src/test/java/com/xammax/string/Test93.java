package com.xammax.string;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Test93 {


    @Test
    void test(){
        restoreIpAddresses("123123");
        System.out.println("123");
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> resukt = new ArrayList<>();
        if(s.length()<4 || s.length()>12) return resukt;

        for(int i=1;i<4;i++){
            for(int j=i+1;j<i+4 && j<s.length();j++){
                for(int k=j+1;k<s.length();k++){
                    String str1 = s.substring(0,i);
                    String str2 = s.substring(i,j);
                    String str3 = s.substring(j,k);
                    String str4 = s.substring(k,s.length());
                    if(check(str1)&&check(str2)&&check(str3)&&check(str4)){
                        resukt.add(str1+"."+str2+"."+str3+"."+str4);
                    }
                }
            }
        }

        return resukt;
    }

    public boolean check(String s){
        if(s.length()==0) return false;
       if(s.length()>1 && s.substring(0,1).equals("0")) return false;
        if(Integer.valueOf(s)<=255) return true;
        return false;
    }
}
