package com.company.array;

import java.util.ArrayList;

public class SpiralOrder2 {
    public static void main(String[] args) {
        SpiralOrder2 spiralOrder2 = new SpiralOrder2();
        System.out.println("args = " + spiralOrder2.generateMatrix(4));
    }

    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> integer = new ArrayList<>();
        int top = 0, left = 0,right = A-1,bottom = A-1;
        int number = 1;
        for(int i =0;i<A;i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int j =0;j< A;j++) {
                list.add(0);
            }
            integer.add(i,list);
        }
        while(top<=right && left<=bottom) {
            for (int i = top; i <= right; i++) {
                integer.get(left).set(i,number++);
            }
            left++;
            for(int i = left;i<=bottom;i++) {
                integer.get(i).set(right,number++);
            }
            right--;
            for(int i= right;i>=top;i--) {
                integer.get(bottom).set(i,number++);
            }
            bottom--;
            for(int i= bottom;i>=left;i--) {
                integer.get(i).set(top,number++);
            }
            top++;

        }
        return integer;
    }
}
