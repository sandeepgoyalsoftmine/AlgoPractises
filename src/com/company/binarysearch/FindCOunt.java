package com.company.binarysearch;

import java.util.Arrays;
import java.util.List;

public class FindCOunt {


    public static void main(String[] args) {
        System.out.println("args = " + new FindCOunt().findCount(Arrays.asList(new Integer[]{ 1 }),1));
    }
    public int findCount(final List<Integer> A, int B) {
        int position = BinarySearch.findPosition(A, B);
        if (position == -1) {
            return 0;
        }
        int leftPostion = findLeftPosition(A,B,position);
        int findRightPosition = findRightPositon(A,B,position);

        return (findRightPosition==-1?position:findRightPosition)-(leftPostion==-1?position:leftPostion)+1;
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
