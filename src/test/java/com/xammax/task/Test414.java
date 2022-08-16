package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class Test414 {

    @Test
    void test(){

        int[] ints = new int[]{1,2,2,5,3,5};
        System.out.println(result(ints));
    }

    private int result(int[] nums){
        TreeSet<Integer> integers = new TreeSet<>();
        for(Integer integer: nums){
            integers.add(integer);
        }
        if(integers.size()==1) return integers.first();
        if(integers.size()==2) return integers.last();
        Iterator<Integer> iterator = integers.descendingIterator();
        int i=1;
        while (iterator.hasNext()){
            int mm = iterator.next();
            if(i==3) return mm;
            i++;
        }
        return 0;
    }
}
