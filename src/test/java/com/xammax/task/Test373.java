package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Test373 {

    @Test
    void test(){
        kSmallestPairs(new int[]{1,7,11}, new int[]{2,4,6},3);
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> listList = new ArrayList<>();

        PriorityQueue<List<Integer>> priorityQueue = new PriorityQueue<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0)+o1.get(1) - o2.get(0)-o2.get(1);
            }
        });

        for(int i=0;i<k||i<nums1.length;i++){
            for (int j=0;j<k||j<nums2.length;j++){
                priorityQueue.add(List.of(nums1[i],nums2[j]));
            }
        }

        for(int i=0;i<k;i++){
            List<Integer> u = (priorityQueue.poll());
            if(u==null) break;
            listList.add(u);
        }

        return listList;

    }

}
