package com.company.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MatrxiMedian {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Integer[] array = {1, 3, 5};//, 2,3};
        list.add(new ArrayList(Arrays.asList(array)));
        Integer[] array1 = {};//, 5,6};
        list.add(new ArrayList(Arrays.asList(array1)));
        Integer[] array2 = {3, 8, 6, 7, 3};//, 8, 9};
        list.add(new ArrayList(Arrays.asList(array2)));
        Integer[] array3 = {4, 4, 4, 4, 4};//, 8, 9};
        list.add(new ArrayList(Arrays.asList(array3)));
        Integer[] array4 = {5, 5, 5, 5, 5};//, 8, 9};
        list.add(new ArrayList(Arrays.asList(array4)));
    }
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (ArrayList<Integer> integers : A) {

            // Finding the minimum element
            if (integers.get(0) < min)
                min = integers.get(0);

            // Finding the maximum element
            if (integers.get(integers.size() - 1) > max)
                max = integers.get(integers.size() - 1);
        }
        int expectedMedian = (A.size()*A.get(0).size() +1)/2;
        while(min<max) {
            int place = 0;
            int mid = min +(max-min)/2;
            for(int i=0;i<A.size();i++) {
                int get = Collections.binarySearch(A.get(i),mid);
                if(get<0) {
                    get = Math.abs(get)-1;
                }else {
                    while(get<A.get(i).size() && A.get(i).get(get)== mid) {
                        get++;
                    }
                }
                place = place+get;


            }
            if(place< expectedMedian) {
                min = mid+1;
            }else {
                max = mid;
            }
        }
        return min;
    }
}

