package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSubSquareMatrix {
    /*
    [1, 1, 1, 1, 1]
        [2, 2, 2, 2, 2]
        [3, 8, 6, 7, 3]
        [4, 4, 4, 4, 4]
        [5, 5, 5, 5, 5]
     */
    public static void main(String[] args) {
        MaximumSubSquareMatrix maximumSubSquareMatrix = new MaximumSubSquareMatrix();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Integer[] array = {1, 1, 1, 1, 1};//, 2,3};
        list.add(new ArrayList(Arrays.asList(array)));
        Integer[] array1 = {2, 2, 2, 2, 2};//, 5,6};
        list.add(new ArrayList(Arrays.asList(array1)));
        Integer[] array2 = {3, 8, 6, 7, 3};//, 8, 9};
        list.add(new ArrayList(Arrays.asList(array2)));
        Integer[] array3 = {4, 4, 4, 4, 4};//, 8, 9};
        list.add(new ArrayList(Arrays.asList(array3)));
        Integer[] array4 = {5, 5, 5, 5, 5};//, 8, 9};
        list.add(new ArrayList(Arrays.asList(array4)));
        System.out.println("args = " + maximumSubSquareMatrix.solve(list,3));
    }
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            ArrayList<Integer> row = new ArrayList();
            for (int j = 0; j <= A.get(i).size() - B; j++) {
                int sum = 0;
                for (int k = j; k <j + B; k++) {
                    sum += A.get(i).get(k);
                }
                row.add(sum);
            }
            result.add(row);
        }
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < result.get(0).size(); j++) {
            for (int i = 0; i <= result.size() - B; i++) {
                int sum = 0;
                for (int k = i; k < i + B; k++) {
                    sum += result.get(k).get(j);
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
