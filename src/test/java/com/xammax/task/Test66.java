package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class Test66 {

    @Test
    void test(){
        int[] mmm = new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(plusOne(mmm));
    }

    private int[] plusOne(int[] digits){


        for(int i = digits.length-1; i>-1;i--){
            if(digits[i]==9) digits[i]=0;
            else {
                digits[i] = digits[i] + 1;
                break;
            }
            if(i==0){
                int[] res = new int[digits.length+1];
                res[0]=1;
                for(int j=1;j<res.length;j++){
                    res[j]=0;
                }
                return res;
            }
        }

        return digits;

    };


}
