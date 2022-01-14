package com.company.bit;

import java.util.List;

/**
 * Single Number II
 * Problem Description
 * <p>
 * Given an array of integers, every element appears thrice except for one which occurs once.
 * <p>
 * Find that element which does not appear thrice.
 * <p>
 * NOTE: Your algorithm should have a linear runtime complexity.
 * <p>
 * Could you implement it without using extra memory?
 * <p>
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 2 <= A <= 5*106
 * <p>
 * 0 <= A <= INTMAX
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument of input contains an integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a single integer.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
 * Input 2:
 * <p>
 * A = [0, 0, 0, 1]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 4
 * Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * 4 occurs exactly once in Input 1.
 * 1 occurs exactly once in Input 2.
 */

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber(List.of(new Integer[]{1, 2, 4, 3, 3, 2, 2, 3, 1, 1})));
    }

    public int singleNumber(final List<Integer> A) {
        int number = 0;
        for (int i = 0; i < 32; i++) {
            int bitcount = 0;
            for (int j = 0; j < A.size(); j++) {
                if (((1 << i) & (A.get(j))) != 0) {
                    bitcount++;
                }
                if (bitcount == 3) {
                    bitcount = 0;
                }
            }
            if (bitcount > 0) {
                number += Math.pow(2, i);
            }
        }
        return number;
    }
}
