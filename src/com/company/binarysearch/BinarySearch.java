package com.company.binarysearch;

import java.util.List;

public class BinarySearch {
    public static int findPosition(List<Integer> A, int B) {
        int firstPosition =0;
        int lastPosition = A.size()-1;
        while(firstPosition<=lastPosition) {
            int mid = (firstPosition+lastPosition)/2;
            if(A.get(mid) < B) {
                firstPosition = mid+1;
            }else if(A.get(mid)>B) {
                lastPosition = mid-1;
            }else  {
                return mid;
            }
        }
        return -1;
    }
}
