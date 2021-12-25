package com.company.math;

public class GreatestCommonDivisor {
    public int gcd(int A, int B) {
        int small = Math.min(A,B);
        int max = Math.max(A,B);
        if(small == 0 ){
            return max;
        }
        for(int i = small;i>=1;i--) {
            if(small%i==0 && max %i==0) {
                return i;
            }
        }
        return 1;
    }

}
