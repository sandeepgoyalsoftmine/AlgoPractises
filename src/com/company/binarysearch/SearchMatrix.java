package com.company.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchMatrix {
    public static void main(String[] args) {
        ArrayList<Integer> matrix = new ArrayList<>();
        matrix.add(1);
        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>();
        matrix1.add(matrix);
        System.out.println("args = " + new SearchMatrix().searchMatrix(matrix1,1));
    }
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
        int row = findRow(A,B);
        if(row == -2) {
            return 1;
        }else if(row == -1) {
            return 0;
        }else {
            return findColoumn(A.get(row),B);
        }
    }
    int findRow(ArrayList<ArrayList<Integer>> A,int B) {
        int start = 0;
        int end = A.size()-1;
        int result = -1;
        while(start<=end) {
            int mid =  (start+end)/2;
            if(A.get(mid).get(0)<=B) {
                if (mid > result) {
                    result = mid;
                }if(A.get(mid).get(0) == B) {
                    return -2;
                }
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
        return result;
    }
    int findColoumn(ArrayList<Integer> A,int B) {
        int start = 0;
        int end = A.size()-1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(A.get(mid)==B) {
                return 1;
            }else if(A.get(mid)<B) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return 0;
    }
}
