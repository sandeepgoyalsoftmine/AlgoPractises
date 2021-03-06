package com.company.math;

import java.util.ArrayList;

public class FizzBuzz {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> result = new ArrayList<>();
        for(int i=1;i<=A;i++) {
            if(i%15 == 0) {
                result.add("FizzBuzz");
            }else if(i %5 == 0) {
                result.add("Buzz");
            }else if(i %3 == 0) {
                result.add("Fizz");
            }else {
                result.add(i+"");
            }
        }
        return result;
    }
}
