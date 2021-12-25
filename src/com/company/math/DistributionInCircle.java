package com.company.math;

import java.util.Arrays;

public class DistributionInCircle {
    public static void main(String[] args) {
        System.out.println("args = " +   new DistributionInCircle().solve(16673,7444,30872));
    }
    public int solve(int A, int B, int C) {
        C = C-1;
        C= C%B;
        A= A%B;
        return C+A;
    }
}
