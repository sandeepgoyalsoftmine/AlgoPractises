package com.company.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class    ReArrangeArray {
    public static void main(String[] args) {
        Integer array[] = {4, 0, 2, 1, 3};
//        3 4 2 0 1
//
//
        System.out.println("args = " + new ReArrangeArray().arrange(Arrays.asList(array)));
    }
    public List<Integer> arrange(List<Integer> a) {
        int i =0;
        while(i<a.size()) {
            a.set(i,((a.get(i)+1)*a.size())+getValueAtI(a,i));
            i++;
        }
        for(i=0;i<a.size();i++) {
            a.set(i,a.get(i)%a.size());
        }
        return a;
    }

    public int getValueAtI(List<Integer> a,int i) {
        int number  = a.get(a.get(i));
        if(number<a.size()) {
            return number;
        }else {
            return (number/a.size())-1;
        }
    }
}
