package com.company.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindLexicographic {
    public static void main(String[] args) {
        FindLexicographic findLexicographic = new FindLexicographic();
        System.out.println("args = " + findLexicographic.findRank("SADASDSASASSASAS"));
    }

    public int findRank(String A) {
        int cal = 1;
        String A1 = A;
        int[] countSimilar = new int[26];
        HashMap<Integer,Integer> fac = new HashMap<>();

        for (int k = 0; k < A.length(); k++) {
            A1 = A.substring(k);
            int findSmallestCount = findSmallInRight(A1,countSimilar);
            int factorial = factorial(A.length() - (k+1));
            cal += findSmallestCount * (factorial);
            int divisor =1;
            for(int i =0;i<countSimilar.length;i++) {
                int factorials = 1;
                if(fac.containsKey(i)) {
                    factorials = fac.get(i);
                }else {
                    factorials = factorial(i);
                    fac.put(i,divisor);
                }
                divisor *= factorials;
            }
            cal /=divisor;
            cal%= 1000003;

        }
        return cal% 1000003;
    }


    public int factorial(int num) {
        int multiply = 1;
        for (int i = 1; i <= num; i++) {
            multiply *= i;
            multiply%=1000003;
        }
        return multiply;
    }

    public int findSmallInRight(String A, int[] countSimilar) {
        int intialChar = A.charAt(0);
        countSimilar[intialChar-'A'+1]++;
        int count = 0;
        for (int i = 1; i < A.length(); i++) {
            if ((A.charAt(i)) < intialChar) {
                count++;

            }
            countSimilar[A.charAt(i)-'A']++;
        }
        return count;
    }
}
