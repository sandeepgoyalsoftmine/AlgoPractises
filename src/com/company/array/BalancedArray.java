package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  BalancedArray {
    public static void main(String[] args) {
        BalancedArray balancedArray = new BalancedArray();
        Integer array[] = { 5, 5, 2, 5, 8};
        System.out.println("args = " + balancedArray.solve(Arrays.asList(array)));
    }
    public int solve(List<Integer> A) {
        int odd = 0;
        int even = 0;
        for(int i=0;i<A.size();i++) {
            if(i%2 ==0 ) {
                odd += A.get(i);
            }else {
                even+=A.get(i);
            }
        }
        int result = 0;
        int currenEvent = 0,currentOdd = 0;
        for(int i =0;i<A.size();i++) {
            if(i%2 ==0 ) {
                int newOdd = odd - A.get(i);
                int newEven = even;
                if(i>0) {
                    newOdd = newOdd+currenEvent-currentOdd;
                    newEven = even - currenEvent + currentOdd;
                }
                if(newOdd == newEven) {
                    result++;
                }
                currentOdd += A.get(i);

            }else {
                int newEven = even - A.get(i);
                int newOdd = odd + currenEvent - currentOdd;
                newEven = newEven - currenEvent + currentOdd;
                if(newOdd == newEven) {
                    result++;
                }
                currenEvent +=A.get(i);
            }
        }
        return result;

    }
}
