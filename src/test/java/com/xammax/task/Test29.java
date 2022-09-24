package com.xammax.task;

import org.junit.jupiter.api.Test;

public class Test29 {

    @Test
    void test(){
        System.out.println(divide(10,3));
    }

    public static long divide(long dividend,
                              long divisor) {

// Calculate sign of divisor
// i.e., sign will be negative
// only if either one of them
// is negative otherwise it
// will be positive
        long sign = ((dividend < 0) ^
                (divisor < 0)) ? -1 : 1;

// remove sign of operands
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

// Initialize the quotient
        long quotient = 0, temp = 0;

// test down from the highest
// bit and accumulate the
// tentative value for
// valid bit
// 1<<31 behaves incorrectly and gives Integer
// Min Value which should not be the case, instead
        // 1L<<31 works correctly.
        for (int i = 31; i >= 0; --i) {

            if (temp + (divisor << i) <= dividend) {
                temp += divisor << i;
                quotient |= 1L << i;
            }
        }

//if the sign value computed earlier is -1 then negate the value of quotient
        if (sign == -1)
            quotient = -quotient;
        return quotient;
    }
}
