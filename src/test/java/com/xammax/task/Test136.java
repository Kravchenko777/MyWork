package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class Test136 {

    @Test
    void test(){
        int[] ints = new int[]{1,2,2,1,1};
        System.out.println(result(ints));
    }

    private int result(int[] nums){
        int res=0;
        for(int i=0;i<nums.length;i++){
            res = res ^ nums[i];
        }
        return res;
    }
}
