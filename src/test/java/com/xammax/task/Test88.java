package com.xammax.task;

import org.junit.jupiter.api.Test;

public class Test88 {

    @Test
    void test(){
        int [] res = res(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        System.out.println(res);
    }

    private int[] res(int[] nums1, int m, int[] nums2, int n){
        if(m==0) return nums2;
        if(n==0) return nums1;

        int[] result = new int[m+n];

        int p=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums1[i]<=nums2[j]){
                    result[p++] = nums1[i];
                    break;
                } else if(nums2[j]!=0) {
                    result[p++] = nums2[j];
                    nums2[j]=0;
                   // break;
                }
            }
        }

        return result;
    }
}
