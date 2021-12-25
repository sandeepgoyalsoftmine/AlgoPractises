package com.company.array;

import java.util.ArrayList;

public class FindPermutation {
    public static void main(String[] args) {
        FindPermutation findPermutation = new FindPermutation();
//        findPermutation.findPerm("")
    }
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 1;
        int end = B;
        for(int i=0;i<A.length();i++) {
            if(A.charAt(i) == 'D') {
                result.add(end--);
            }else {
                result.add(start++);
            }
        }
        result.add(start);
        return result;
    }
}
