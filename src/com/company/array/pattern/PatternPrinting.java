package com.company.array.pattern;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
* Example: For A = 3 pattern looks like:
        *
        * 1 0 0
        *
        * 1 2 0
        *
        * 1 2 3

// */
public class PatternPrinting {
    public int[][] solution(int number) {
        int result[][] = new int[number][number];
        int start = 1;
        for(int i = 0;i<number;i++) {
            start = 1;
            for(int j = 0;j<=i;j++) {
                result[i][j] = start++;
            }
        }

        return result;

    }
    public static void main(String[] args) {
        int number = 3;
        int result[][] =new PatternPrinting().solution(number);
        for(int i = 0;i<number ;i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

}
