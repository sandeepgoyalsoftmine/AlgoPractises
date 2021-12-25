package com.company.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BooksAllocation {
    public static void main(String[] args) {
        System.out.println("args = " + new BooksAllocation().books(Arrays.asList(new Integer[]{97, 26, 12, 67, 10, 33, 79, 49, 79, 21, 67, 72, 93, 36, 85, 45, 28, 91, 94, 57, 1, 53, 8, 44, 68, 90, 24}), 26));
    }

    public int books(ArrayList<Integer> A, int B) {
        return books((List) A, B);
    }

    public int books(List<Integer> A, int B) {

        int end = findSum(A);
        int start = findMin(A);
        while (start < end) {
            int mid = start + (end - start) / 2;
            int countStudent = 1;
            int sum = 0;
            for (int i = 0; i < A.size(); i++) {
                sum = sum + A.get(i);
                if (sum > mid) {
                    sum = A.get(i);
                    countStudent++;
                }
            }
            if (countStudent > B) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;

    }
    int findMax(List<Integer> A) {
        int max = Integer.MIN_VALUE;
        for (Integer inte : A) {
            max = Math.max(inte, max);
        }
        return max;
    }
    int findMin(List<Integer> A) {
        int min = Integer.MAX_VALUE;
        for (Integer inte : A) {
            min = Math.min(inte, min);
        }
        return min;
    }

    int findSum(List<Integer> A) {
        int sum = 0;
        for (Integer inte : A) {
            sum += inte;
        }
        return sum;
    }

}
