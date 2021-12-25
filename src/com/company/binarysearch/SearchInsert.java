package com.company.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchInsert {
    public static void main(String[] args) {
        System.out.println("args = " + new SearchInsert().findPosition(Arrays.asList(new Integer[]{1, 3, 5, 6}), 2));
    }
    public int searchInsert(ArrayList<Integer> a, int b) {
        return findPosition(a,b);
    }
    public  int findPosition(List<Integer> A, int B) {
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
        return firstPosition;
    }
}
