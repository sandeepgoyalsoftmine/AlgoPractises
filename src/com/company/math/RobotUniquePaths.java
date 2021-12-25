package com.company.math;

public class RobotUniquePaths {
    public static void main(String[] args) {
        System.out.println(new RobotUniquePaths().uniquePaths(3,3));
    }
    public int uniquePaths(int A, int B) {
       int [][] array = new int[A][B];
        for(int i =0;i<A;i++) {
           for(int j = 0 ;j<B;j++) {
               if(j==0 || i ==0) {
                   array[i][j] = 1;
               }else{
                   array[i][j] = array[i-1][j] + array[i][j-1];
               }
           }
       }
        return array[A-1][B-1];
    }
}
