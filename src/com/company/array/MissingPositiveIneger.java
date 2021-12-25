package com.company.array;

import java.util.*;

public class MissingPositiveIneger {
    public static void main(String[] args) {
        MissingPositiveIneger missingPositiveIneger = new MissingPositiveIneger();
        Integer array[] = {1};

        System.out.println("args = " + missingPositiveIneger.firstMissingPositive(Arrays.asList(array)));
    }
    public int firstMissingPositive(List<Integer> A) {
        boolean[] marker = new boolean[A.size()+1];
        for(int i = 0;i<A.size();i++) {
            if(A.get(i)>0 && A.get(i)<marker.length) {
                marker[A.get(i)-1] =true;//true;
            }
        }
        for(int i = 0; i<marker.length; i++) {
            if(!marker[i]) {
                return i+1;
            }
        }
        return 0;
    }
}
