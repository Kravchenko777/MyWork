package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class Test349 {

    @Test
    void test(){

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        for(Integer integer:nums1){
            hashSet1.add(integer);
        }
        for(Integer integer:nums2){
            hashSet2.add(integer);
        }
        ArrayList<Integer> im = new ArrayList<>();
        for(Integer integer:hashSet1){
            if(hashSet2.contains(integer))im.add(integer) ;

        }
        int[] mmm = new int[im.size()];
        for(int i=0;i<im.size();i++){
            mmm[i] = im.get(i);
        }
        return mmm;
    }
}
