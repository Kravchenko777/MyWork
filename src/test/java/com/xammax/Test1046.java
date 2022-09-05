package com.xammax;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Test1046 {

    @Test
    void test(){
        int[] stones = new int[]{2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }

    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) return stones[0];
        Arrays.sort(stones);
        if(stones[stones.length-2]==0) return stones[stones.length-1];
        stones[stones.length-1]=stones[stones.length-1]-stones[stones.length-2];
        stones[stones.length-2]=0;
        return lastStoneWeight(stones);
    }
}
