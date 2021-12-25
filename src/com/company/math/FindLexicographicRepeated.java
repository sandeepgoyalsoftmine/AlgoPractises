package com.company.math;

import java.util.HashMap;

public class FindLexicographicRepeated {

    public static void main(String[] args) {
        FindLexicographicRepeated findLexicographic = new FindLexicographicRepeated();
        System.out.println("args = " + findLexicographic.findRank("sadasdsasassasas"));
    }

    public int findRank(String A) {
        int cal = 1;
        String A1 = A;
        HashMap<Integer, Integer> fac = new HashMap<>();
        HashMap<Character, Integer> countSimilar;

        for (int k = 0; k < A.length(); k++) {
            countSimilar = new HashMap<>();
            A1 = A.substring(k);
            int findSmallestCount = findSmallInRight(A1, countSimilar);
            int factorial = factorial(A.length() - (k + 1));
            System.out.println("findSmallestCount = " + findSmallestCount);
            System.out.println("factorial = " + factorial);


            int divisor = 1;
            for(Character character:countSimilar.keySet()) {
                int factorials;
                if(countSimilar.get(character)<2) {
                    continue;
                }
                if (fac.containsKey(countSimilar)) {
                    factorials = fac.get(countSimilar.get(character));
                } else {
                    factorials = factorial(countSimilar.get(character));
                    fac.put(countSimilar.get(character), factorials);
                }
                divisor *= factorials;
                divisor %= 1000003;
            }
            System.out.println("divisor = " + divisor);
            cal += ((findSmallestCount * factorial)  % 1000003 )/ divisor;
            System.out.println("count = " + cal);
            cal %= 1000003;

        }
        return cal % 1000003;
    }


    public int factorial(int num) {
        int multiply = 1;
        for (int i = 1; i <= num; i++) {
            multiply *= i;
            multiply %= 1000003;
        }
        return multiply;
    }

    public int findSmallInRight(String A, HashMap<Character, Integer> countSimilar) {
        int intialChar = A.charAt(0);
            countSimilar.put(A.charAt(0),1);

        int count = 0;
        for (int i = 1; i < A.length(); i++) {
            if(countSimilar.containsKey(A.charAt(i))) {
                Integer integer = countSimilar.get(A.charAt(i)) ;
                integer = integer+1;
                countSimilar.put(A.charAt(i),integer);
            }else {
                countSimilar.put(A.charAt(i),1);
            }
            if ((A.charAt(i)) < intialChar) {
                count++;
            }

        }
        return count;
    }

}
