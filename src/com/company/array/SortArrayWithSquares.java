package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayWithSquares {
    public static void main(String[] args) {
        SortArrayWithSquares sortArrayWithSquares = new SortArrayWithSquares();
        Integer array[] = { -993, -969, -948, -809, -730, -713, -645, -617, -488, -364, -233, -223, -91, -59, -55, 97, 107, 150, 161, 290, 337, 350, 430, 457, 573, 574, 655, 724, 753, 829, 966, 986 };
        System.out.println("args = " + sortArrayWithSquares.solve(Arrays.asList(array)));

    }
    public ArrayList<Integer> solve(List<Integer> A) {
        int i =0;
        while(i<A.size() && A.get(i)<=0){
            i++;
        }
        ArrayList<Integer> result = new ArrayList<>();
        int j =i-1;
        while(j>=0 && i<A.size()) {
            if(Math.abs(A.get(j)) < A.get(i)) {
                result.add(A.get(j) * A.get(j));
                j--;
            }else {
                result.add(A.get(i) * A.get(i));
                i++;
            }
        }
        if(j>=0) {
            while (j>=0) {
                result.add(A.get(j) * A.get(j));
                j--;
            }
        }else {
            while(i<A.size()) {
                result.add(A.get(i) * A.get(i));
                i++;
            }
        }
        return result;
    }

}
