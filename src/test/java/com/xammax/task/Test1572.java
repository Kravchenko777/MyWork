package com.xammax.task;

import org.junit.jupiter.api.Test;

public class Test1572 {

    @Test
    void test(){
        int[][] mat = new int[1][1];
        mat[0][0] = 10;
        System.out.println(result(mat));
    }

    @Test
    void test2(){
        int[][] mat = new int[2][2];
        mat[0][0] = 10;
        mat[0][1] = 4;
        mat[1][0] = 8;
        mat[1][1] = 3;
        System.out.println(result(mat));
    }

    @Test
    void test3(){
        int[][] mat = new int[3][3];
        mat[0][0] = 10;
        mat[0][1] = 4;
        mat[0][2] = 4;
        mat[1][0] = 8;
        mat[1][1] = 3;
        mat[1][2] = 2;
        mat[2][0] = 7;
        mat[2][1] = 5;
        mat[2][2] = 11;
        System.out.println(result(mat));
    }

    @Test
    void test4(){
        int [][] mat = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3},{1,2,3,4}};
        System.out.println(result(mat));
    }



    private int result(int[][] mat){
        int matlength = mat.length;
        if(matlength==1) return mat[0][0];
        if(matlength%2==0){
            return summ(mat,matlength);
        } else {
            return summ(mat,matlength) - mat[matlength/2][matlength/2];
        }
    }

    private int summ(int[][] mat, int matlength){
        int result = 0;
        for(int i=0;i<matlength;i++){
            result = result + mat[i][i];
        }
        for(int j=0;j<matlength;j++){
            result = result + mat[j][matlength-1-j];
        }
        return result;

    }
}
