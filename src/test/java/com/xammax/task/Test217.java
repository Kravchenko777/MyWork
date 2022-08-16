package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

public class Test217
{

    @Test
    void test(){
        int[] ints = new int[]{1,2,2,1,1};
        System.out.println(result(ints));
    }

    private boolean result(int[] nums){
        HashSet<Integer> res = new HashSet<>();
        for(Integer integer:nums){
            if(res.contains(integer))return false;
            else res.add(integer);
        }

        return true;
    }

}
