package com.company.bit;

public class Number_Of_1_bits {

    public static void main(String[] args) {
        System.out.println(new Number_Of_1_bits().numSetBits(11));
    }
    public int numSetBits(int A) {
        int count = 0;
        while(A!=0) {
            if((1&A)!=0) {
                count++;
            }
            A= A>>1;
        }
        return count;
    }
}
