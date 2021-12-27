package com.company.bit;

/**
 *
 *Reverse Bits
 * Problem Description
 *
 * Reverse the bits of an 32 bit unsigned integer A.
 *
 *
 *
 * Problem Constraints
 * 0 <= A <= 232
 *
 *
 *
 * Input Format
 * First and only argument of input contains an integer A.
 *
 *
 *
 * Output Format
 * Return a single unsigned integer denoting the decimal value of reversed bits.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  0
 * Input 2:
 *
 *  3
 *
 *
 * Example Output
 * Output 1:
 *
 *  0
 * Output 2:
 *
 *  3221225472
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *         00000000000000000000000000000000
 * =>      00000000000000000000000000000000
 * Explanation 2:
 *
 *         00000000000000000000000000000011
 * =>      11000000000000000000000000000000
 */
public class Reverse_bits {
    public long reverse2(long A) {
        long ans = 0;
        for(int i =1;i<=32 ;i++) {
            ans = ans<<1;
            long end_no= (A&(long)1);
            ans = ans | end_no;
            A = A>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Reverse_bits().reverse2(3

        ));
    }

}