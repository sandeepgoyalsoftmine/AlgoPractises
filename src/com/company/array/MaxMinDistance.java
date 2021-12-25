package com.company.array;

import java.util.ArrayList;

public class MaxMinDistance {
    public int solve(ArrayList<Integer> A) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<A.size();i++) {
            if(A.get(i) > max) {
                max = A.get(i);
            }else if(A.get(i) < min) {
                min = A.get(i);
            }
        }
        return max+min;

    }
}
