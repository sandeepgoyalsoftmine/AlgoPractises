package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerfectPeakArray {
    public static void main(String[] args) {
        PerfectPeakArray perfectPeakArray = new PerfectPeakArray();
        Integer array[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        System.out.println("args = " + perfectPeakArray.perfectPeak(Arrays.asList(array)));
    }
    public int perfectPeak(List<Integer> A) {
        int n = A.size();
        int max[] = new int[n];
        max[n-1]=A.get(n-1);
        for(int i=n-2; i>=0; i--) {
            max[i] = Math.min(max[i+1], A.get(i));
        }

        int min=A.get(0);
        for(int i=1; i<n-1; i++) {
            min = Math.max(min, A.get(i));
            if(min == max[i]) {
                return 1;
            }
        }

        return 0;
    }
}
