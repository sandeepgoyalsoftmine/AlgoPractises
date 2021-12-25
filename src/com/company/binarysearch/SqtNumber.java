package com.company.binarysearch;

import java.util.Arrays;

public class SqtNumber {
    public static void main(String[] args) {
        System.out.println("args = " + new SqtNumber().sqrt(2147483647));
    }
    public int sqrt(int A) {
        if(A==0) {
            return 0;
        }
        int min = 0;
        int max = A;
        int mid = 1;
        while (min<=max) {
            mid = (min+max)/2;
            System.out.println(min + " " +max+ " "+ mid +" "+ mid*mid);
            if(mid == A/mid) {
                return mid;
            } else if(mid >A/mid) {
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return max;
    }
}


//10
//1 2 3 4 5