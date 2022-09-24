package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Test215 {


    @Test
    void test(){
        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
