package com.company.array;

import java.util.Arrays;
import java.util.List;

public class MinimumLightToActive2 {
    public static void main(String[] args) {
        MinimumLightsToActive minimumLightsToActive = new MinimumLightsToActive();
        Integer array[] = {0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0};
        System.out.println("args = " + new MinimumLightToActive2().solve1(Arrays.asList(array),12));
    }
    public int findEnd(int position,int B) {
        return position+B-1;
    }



    public int solve1(List<Integer> A, int B) {
        int count = 0;
        int i =0;
        while(i<A.size()) {
            int k = findEnd(i,B);
            if(k>A.size()) {
                break;
            }
            for(;k>i;k--) {
                if(A.get(k)==1) {
                    break;
                }
            }
            count++;
            if(k==i) {
                return -1;
            }
            i = k;
        }
        return count;
    }
}
