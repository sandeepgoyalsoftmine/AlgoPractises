package com.company.math;

import java.util.Arrays;

public class NextPalindrome {
    public static void main(String[] args) {
        System.out.println("args = " + new NextPalindrome().solve("12454"));
    }

    public String solve(String A) {
       return makePalindrome(A,false);
    }
    public String makePalindrome(String A,boolean increment) {
        char[] array = A.toCharArray();

        if(isAll9(array)) {
            return resizeNumber(array);
        }
//        array = incrementNumber(array,array.length-1);
        int length = array.length;
        int i = length / 2 - 1;

        int j;
        if (length % 2 != 0) {
            j = i + 2;
        } else {
            j = i + 1;
        }

        while (i >= 0) {
            if (array[i] >= array[j] || increment) {
                if(array[i]!=array[j]) {
                    increment = true;
                }
                array[j] = array[i];
            } else {
                increment = true;
                if (length % 2 != 0) {
                    char []array1 = incrementNumber(array,j-1);
                    if(array.length<array1.length) {
                        return new String(array1);
                    }
                    array[j] = array[i];
                } else {

                    array[i]++;
                    array[j] = array[i];
                }
            }

            j++;
            i--;
        }
        if(!increment) {
            i = length / 2 - 1;
            if (length % 2 != 0) {
                j = i + 2;
            } else {
                j = i + 1;
            }
            char []array1 = incrementNumber(array,j-1);
            if(array.length<array1.length) {
                return new String(array1);
            }
            return makePalindrome(new String(array),true);
        }

        return new String(array);
    }
    public boolean isAll9(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != '9') {
                return false;
            }
        }
        return true;
    }

    public String resizeNumber(char[] array) {
        array = new char[array.length + 1];
        array[0] = '1';
        for (int ii = 0; ii < array.length - 1; ii++) {
            array[ii + 1] = '0';
        }
        array[array.length - 1] = '1';
        return new String(array);
    }
    public char[] incrementNumber(char[] array,int incremetFrom) {
        int k = 0;
        int j= incremetFrom;
        while (j - k >= 0) {
            if (array[j - k] == '9') {
                array[j - k] = '0';
            } else {
                array[j - k]++;
                break;
            }
            k++;
        }
        if(k>j) {
            return resizeNumber(array).toCharArray();
        }
        return array;
    }

}
