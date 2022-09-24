package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class Test2357 {

    @Test
    void test(){

    }

    public int minimumOperations(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(Integer i:nums){
            if(i!=0)hashSet.add(i);
        }
        return hashSet.size();
    }
}


