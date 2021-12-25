package com.company.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchBitonicArray {
    public static void main(String[] args) {
        System.out.println(new SearchBitonicArray().solve(Arrays.asList(1, 20, 50, 40, 10),20));
    }
    public int solve(List<Integer> A, int B) {
        int firstPosition =0;
        int lastPosition = A.size()-1;
        while(firstPosition<=lastPosition) {
            int mid = (firstPosition+lastPosition)/2;
            if(A.get(mid) == B) {
                return mid;
            }
            if(A.get(mid) < B) {
                if( mid+1<A.size() && A.get(mid+1)>A.get(mid) ) {
                    firstPosition = mid+1;
                }else {
                    lastPosition = mid-1;
                }
            }else if(A.get(mid)>B) {
                if(mid+1<A.size()  && A.get(mid+1)>A.get(mid)) {
                    lastPosition = mid-1;
                }else {
                    firstPosition = mid+1;
                }
            }
        }
        return -1;
    }
}
