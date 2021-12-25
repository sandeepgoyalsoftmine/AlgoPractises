package com.company.math;

import com.company.array.FactorialString;

import java.util.Arrays;

public class FactorialTrailingZero {
    public static void main(String[] args) {
        FactorialTrailingZero factorialTrailingZero = new FactorialTrailingZero();
        System.out.println("args = " + factorialTrailingZero.trailingZeroes(9247));
    }
    public int trailingZeroes(int A) {
        // Initialize result
        int count = 0;

        // Keep dividing n by powers
        // of 5 and update count
        for (int i = 5; A / i >= 1; i *= 5)
            count += A / i;

        return count;
    }
}
