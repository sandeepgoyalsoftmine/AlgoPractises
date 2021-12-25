package com.company.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class FindRange {
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        int position = BinarySearch.findPosition(A, B);
        ArrayList<Integer> result = new ArrayList<>();
        if (position == -1) {
            result.add(-1);
            result.add(-1);
            return result;
        }
        int leftPostion = findLeftPosition(A,B,position);
        int findRightPosition = findRightPositon(A,B,position);
        if(leftPostion == -1) {
            leftPostion = position;
        }
        if(findRightPosition == -1) {
            findRightPosition = position;
        }
        result.add(leftPostion);
        result.add(findRightPosition);
        return result;
    }
    private int findRightPositon(List<Integer> A, int B, int position) {
        int number = BinarySearch.findPosition(A.subList(position+1,A.size()),B);

        if (number != -1) {
            number = position+number+1;
            int number1 = findRightPositon(A,B,number);
            if(number1==-1) {
                return number;
            }
            number = number1;
        }
        return number;
    }

    public int findLeftPosition(final List<Integer> A, int B,int position) {
        int number = BinarySearch.findPosition(A.subList(0,position),B);
        if (number != -1) {
            int number1 = findLeftPosition(A,B,number);
            if(number1==-1) {
                return number;
            }
            number = number1;
        }
        return number;
    }
}
