package com.company.math;

import java.util.Arrays;

public class NextSimilarBiggerNumber {
    public static void main(String[] args) {
        System.out.println("args = " + new NextSimilarBiggerNumber().solve("892795"));
    }
    public String solve(String A) {
        char array[] = A.toCharArray();

        int i;
        int end = A.charAt(A.length()-1);
        for(i=A.toCharArray().length-2;i>=0;i--) {
            if(A.charAt(i)<end) {
                break;
            }
            end = A.charAt(i);
        }
        if(i<0) {
            return "-1";
        }
        String newString = new String(array).substring(0,i);
        array = new String(array).substring(i).toCharArray();
        int smallestPosition = findSmallestPosition(array);
        char temp = (char) array[smallestPosition];
        array[smallestPosition] = array[0];
        array[0] = temp;
        newString+=array[0];
        array = new String(array).substring(1).toCharArray();
        Arrays.sort(array);
        return newString+new String(array);

    }
    int findSmallestPosition(char[] arr) {
        int min = 1;
        for(int i =2;i<arr.length;i++) {
            if(arr[i] > arr[0] && arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }
}
