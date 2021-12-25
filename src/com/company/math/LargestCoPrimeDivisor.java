package com.company.math;

import java.math.BigInteger;
import java.util.Arrays;

public class LargestCoPrimeDivisor {
    public static void main(String[] args) {
        System.out.println("args = " + new LargestCoPrimeDivisor().cpFact(88,2));
    }

    public int cpFact(int A, int B) {
        BigInteger s = new BigInteger(String.valueOf(B));
        BigInteger u = new BigInteger(String.valueOf(A));
        while(s.gcd(u).compareTo(BigInteger.ONE)!=0&&u.intValue()>0){
            u = u.divide(s.gcd(u));
        }
        return u.intValue();
    }
    public boolean isPrime(int A) {
        int upperLimit = (int)(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (i < A && A % i == 0) return false;
        }
        return true;
    }
    public int gcd(int A, int B) {
        int small = Math.min(A, B);
        int max = Math.max(A, B);
        if (small == 0) {
            return max;
        }
        for (int i = small; i >= 1; i--) {
            if (small % i == 0 && max % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
