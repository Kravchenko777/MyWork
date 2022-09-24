package com.xammax.task;

public class Test231 {

    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n%2==1) return false;
        n = n/2;
        return isPowerOfTwo(n);
    }
}
