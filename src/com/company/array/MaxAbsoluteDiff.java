package com.company.array;

import java.util.ArrayList;

public class MaxAbsoluteDiff {
    public static void main(String[] args) {
        MaxAbsoluteDiff maxAbsoluteDiff = new MaxAbsoluteDiff();
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(2);
        ar.add(2);
        System.out.println("args = " + maxAbsoluteDiff.maxArr(ar));


    }
    public int maxArr(ArrayList<Integer> A) {
        int max2 = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0;i<A.size();i++) {
            max1 = Math.max(max1,A.get(i)+i);
            min1 = Math.min(min1,A.get(i)+i);
            max2 = Math.max(max2,A.get(i)-i);
            min2 = Math.min(min2,A.get(i)-i);
        }

        return Math.max(max1-min1,max2-min2);
    }
}
