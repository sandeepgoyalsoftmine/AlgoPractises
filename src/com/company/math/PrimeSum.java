package com.company.math;

import java.util.ArrayList;

public class PrimeSum {
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=2;i<A/2;i++) {
            if(isPrime(i) && isPrime(A-i)) {
                result.add(i);
                result.add(A-i);
            }
        }
        return result;
    }

    public boolean isPrime(int A) {
        int upperLimit = (int)(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (i < A && A % i == 0) return false;
        }
        return true;
    }
}
