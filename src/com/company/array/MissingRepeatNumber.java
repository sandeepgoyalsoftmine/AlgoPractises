package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRepeatNumber {
    public static void main(String[] args) {
        MissingRepeatNumber missingRepeatNumber = new MissingRepeatNumber();
        Integer array[] = {3,1,2,5,3};

        System.out.println("args = " + missingRepeatNumber.repeatedNumber(Arrays.asList(array)));
    }
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        long size = A.size();
        long sum = (size) *(size+1)/2;
        long squareSum = (2*size+1)*size*(size+1)/6;
        for(long i:A) {
            sum -=i;
            squareSum-=i*i;
        }
        int B = (int) (((squareSum/sum)+sum)/2);
        result.add((int) (B-sum));
        result.add(B);
        return result;
    }
}
