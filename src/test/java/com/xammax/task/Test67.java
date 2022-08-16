package com.xammax.task;

import org.junit.jupiter.api.Test;

public class Test67 {

    @Test
    void test(){
        System.out.println("aacdef".charAt(1) - 'a');
        System.out.println("abcdef".charAt(2) - 'a');
        System.out.println("abcdef".charAt(3) - 'a');
        System.out.println("abcdef".charAt(1) - 'a');
    }

    private static void printString(int columnNumber)
    {
        // To store result (Excel column name)
        StringBuilder columnName = new StringBuilder();

        while (columnNumber > 0) {
            // Find remainder
            int rem = columnNumber % 26;

            // If remainder is 0, then a
            // 'Z' must be there in output
            if (rem == 0) {
                columnName.append("Z");
                columnNumber = (columnNumber / 26) - 1;
            }
            else // If remainder is non-zero
            {
                columnName.append((char)((rem - 1) + 'A'));
                columnNumber = columnNumber / 26;
            }
        }

        // Reverse the string and print result
        System.out.println(columnName.reverse());
    }


}
