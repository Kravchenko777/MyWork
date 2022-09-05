package com.xammax.string;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test17 {

    @Test
    void test(){
        letterCombinations("2234");
        System.out.println("12313");
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length()==0) return result;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("2", "abc");
        hashMap.put("3", "def");
        hashMap.put("4", "ghi");
        hashMap.put("5", "jkl");
        hashMap.put("6", "mno");
        hashMap.put("7", "pqrs");
        hashMap.put("8", "tuv");
        hashMap.put("9", "wxyz");


        result.add("");
        return result(result,digits,hashMap);

    }

    public static List<String> result(List<String> res, String subdigits, HashMap<String, String> hashMap){
        List<String> result = new ArrayList<>();
        if(subdigits.length()==1) {
                for(String symbol:hashMap.get(subdigits).split("")){
                    for(String str:res){
                    result.add(str+symbol);
                }
            }
                return result;
        }


            for(String symbol:hashMap.get(subdigits.substring(0,1)).split("")){
                for(String str:res){
                    result.add(str+symbol);
            }
        }

        return result(result,subdigits.substring(1,subdigits.length()), hashMap);
    }
}
