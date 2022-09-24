package com.xammax.task;

import org.junit.jupiter.api.Test;

public class Test137 {

    @Test
    void test(){
       // singleNumber(new int[]{2,2,3,2});

        int i =0;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
    }

    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++){
            res = res^nums[i];
        }
        return res;
    }
}
