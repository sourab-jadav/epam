package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        int maxVal=Integer.MIN_VALUE;
        for (int i : values) {
            if (i>maxVal) {
                maxVal=i;
            }
        }
        return maxVal;
    }
}
