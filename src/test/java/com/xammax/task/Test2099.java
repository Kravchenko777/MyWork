package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test2099 {

    @Test
    void test(){
        maxSubsequence(new int[]{2,1,3,3}, 2);
    }
    public int[] maxSubsequence(int[] nums, int k) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();

        for(int i=0;i<nums.length;i++){
            treeMap.put(nums[i],i);
        }

        int[] result = new int[nums.length];

        TreeSet<Integer> treeSet = (TreeSet<Integer>) treeMap.keySet();

        return result;
    }


}
