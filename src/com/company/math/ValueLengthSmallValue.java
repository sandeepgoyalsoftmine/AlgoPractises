package com.company.math;

import java.util.ArrayList;
import java.util.Arrays;

public class ValueLengthSmallValue {
    public static void main(String[] args) {
        ValueLengthSmallValue valueLengthSmallValue =new ValueLengthSmallValue();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(0);
        A.add(1);
        //2, 3, 5, 6, 7, 9
        A.add(2);
//        A.add(3);
        A.add(5);
//        A.add(6);
//        A.add(7);
//        A.add(9);
        System.out.println("args = " + valueLengthSmallValue.solve(A,2,21));
    }
    public int solve(ArrayList<Integer> A, int B, int C) {
        int cSize = (int) Math.log10(C) + 1;
        int n = A.size();
        if (cSize < B || n == 0) return 0;
        boolean hasZero = A.get(0) == 0;
        if (cSize > B) return (B > 1 && hasZero ? n - 1 : n) * (int) Math.pow(n, B - 1);
        // B == cSize
        int pow10 = (int) Math.pow(10, B - 1), count = 0;
        for(int i = B; i > 0; i--) {
            int target = C / pow10, j;
            C %= pow10;
            pow10 /= 10;
            for(j = 0; j < n; j++) {
                if (A.get(j) >= target) break;
            }
            count += (B > 1 && i == B && hasZero ? j - 1 : j) * (int) Math.pow(n, i - 1);
            if (j == n || A.get(j) > target) break;
        }
        return count;
    }
}
