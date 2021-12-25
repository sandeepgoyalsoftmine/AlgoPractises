package com.company.array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        FindDuplicate findDuplicate = new FindDuplicate();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(4);
        A.add(1);
        A.add(4);
        A.add(1);
        System.out.println("args = " + findDuplicate.repeatedNumber(A));
    }
    public int repeatedNumber(final List<Integer> A) {
        Integer[] AB = new Integer[A.size()-1];
        for(Integer i:A) {
            if(AB[i-1] == null) {
                AB[i-1] = i;
            }else {
                return i;
            }
        }
        return -1;
    }
}
