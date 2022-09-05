package com.xammax;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test506 {

    @Test
    void test(){
        int[] test = new int[]{10,3,8,9,4};
        System.out.println(findRelativeRanks(test));
    }

    public String[] findRelativeRanks(int[] score) {
        LinkedHashMap<Integer,String> positionValue = new LinkedHashMap<>();
        for(int i=0;i<score.length;i++){
            positionValue.put(score[i],"");
        }

        Arrays.sort(score);
        int i=1;
        for(int j= score.length-1;j>=0;j--){
            if(i==1) positionValue.put(score[j],"Gold Medal");
            else if(i==2) positionValue.put(score[j],"Silver Medal");
            else if(i==3) positionValue.put(score[j],"Bronze Medal");
            else {
                positionValue.put(score[j],String.valueOf(i));
            }
            i++;
        }

        return positionValue.values().toArray(new String[0]);
    }
}
