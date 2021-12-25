package com.company.array;

import java.util.ArrayList;

public class    LeadersINArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> result = new ArrayList<>();
        int max = A.get(n-1);
        for(int i=n-1; i>=0; i--) {
            max = Math.max(A.get(i),max) ;
            if(max == A.get(i)) {
                result.add(max);
            }
        }
        return result;
    }
}
