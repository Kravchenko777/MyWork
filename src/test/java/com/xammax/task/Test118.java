package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Test118 {

    @Test
    void test(){

    }

    private List<List<Integer>> generate(int numRows){
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> res1 = new ArrayList<>(){};
        res1.add(1);
        result.add(res1);
        if(numRows==1) return result;
        List<Integer> res2 = new ArrayList<>(){};
        res2.add(1);
        res2.add(1);
        result.add(res2);
        if(numRows==2) return result;
        for(int i=3;i==numRows;i++){
            List<Integer> res = new ArrayList<>(){};
            for(int j=0;j<i;j++){

            }
            result.add(res);
        }
        return result;
    }


}
