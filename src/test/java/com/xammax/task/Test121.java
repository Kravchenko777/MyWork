package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

import static java.util.Arrays.stream;

public class Test121 {

    @Test
    void test(){
        int prices[] = { 7, 9, 5, 6, 1 };
        int max_profit = maxProfit(prices, prices.length);
        System.out.println(max_profit);
    }

    static int maxProfit(int prices[], int n)
    {
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < n; i++) {

            // Checking for lower buy value
            if (buy > prices[i])
                buy = prices[i];

                // Checking for higher profit
            else if (prices[i] - buy > max_profit)
                max_profit = prices[i] - buy;
        }
        return max_profit;
    }
}
