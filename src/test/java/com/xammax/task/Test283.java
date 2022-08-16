package com.xammax.task;

import org.junit.jupiter.api.Test;

public class Test283 {

    @Test
    void test(){
        int[] mat = result(new int[]{0,0,9,4,9});

        for(int i:mat){
            System.out.println(i);
        }
    }

    private int[] result(int[] nums){
        for(int i =0;i<nums.length;i++){
           if(nums[i]==0 && i!=nums.length-1){
               for(int j =i+1;j<nums.length;j++){
                   if(nums[j]!=0) {
                       nums[i] = nums[j];
                       nums[j] = 0;
                       break;
                   }
               }
           }
        }
        return nums;
    }
}
