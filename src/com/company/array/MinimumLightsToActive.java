package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumLightsToActive {
    public static void main(String[] args) {
        MinimumLightsToActive minimumLightsToActive = new MinimumLightsToActive();
        Integer array[] = {0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0};
        System.out.println("args = " + minimumLightsToActive.solve(Arrays.asList(array),12));
    }

    public int solve(List<Integer> A, int B) {
        int count = 0;
        int i = 0;
        while(i<A.size()) {
            int start = findStart(i,B);
            if(start<0) {
                start=0;
            }
            int end = i+B-1;
            if(end > A.size()-1) {
                end =A.size()-1;
            }
            int j = end;
            for(j=end;j>=start;j--) {
                if(A.get(j)==1) {
                    break;
                }
            }
            if(j<start) {
                return -1;
            }
            count++;
            i = findEnd(j,B)+1;
        }
        return count;
    }
    public int findStart(int position,int B) {
        return position-B+1;
    }
    public int findEnd(int position,int B) {
        return position+B-1;
    }
}
