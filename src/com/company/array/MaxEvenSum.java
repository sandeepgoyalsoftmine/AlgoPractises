package com.company.array;

import java.util.List;

public class MaxEvenSum {
    public static void main(String[] args) {
        System.out.println(new MaxEvenSum().solve(List.of(new Integer[]{2,3,4})));
    }

    public int solve(final List<Integer> A) {
        int sum =0;
        int minOdd = Integer.MAX_VALUE;
        for(int i =0;i<A.size();i++) {
            if(A.get(i) > 0) {
                sum +=A.get(i);
            }
            if((1&A.get(i)) != 0) {
                if(minOdd > A.get(i)) {
                    minOdd = A.get(i);
                }
            }
        }
        if( (1 & sum) !=0) {
            sum -=minOdd;
        }
        return sum;
    }
}
