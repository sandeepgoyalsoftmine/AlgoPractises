package com.company.array;/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;

class JavaClass90Rotation {
    /*
    [
  [31, 32, 228, 333]
  [79, 197, 241, 246]
  [77, 84, 126, 337]
  [110, 291, 356, 371]
]
     */
    public static void main(String[] args) {

        JavaClass90Rotation antiDiagnol = new JavaClass90Rotation();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Integer[] array = {31, 32, 228, 333};
        list.add(new ArrayList(Arrays.asList(array)));
        Integer[] array1 = {79, 197, 241, 246};
        list.add(new ArrayList(Arrays.asList(array1)));
        Integer[] array2 = {77, 84, 126, 337};
        list.add(new ArrayList(Arrays.asList(array2)));
        Integer[] array3 = {110, 291, 356, 371};
        list.add(new ArrayList(Arrays.asList(array3)));
        antiDiagnol.rotate(list);

        System.out.println("args = " + list);
    }
    void test() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // One by one run for all input test cases
        while (t > 0) {
            // Input the size of the array
            int N = sc.nextInt();
            int arr[][] = new int[N][N];
            // Input the array
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    arr[i][j] = sc.nextInt();

            for (int i = 0; i <= (N - 1) / 2; i++) {
                int n1 = N - i;
                for (int j = i; j < n1 - 1; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][n1 - 1];
                    arr[j][n1 - 1] = arr[n1 - 1][n1 - 1 + (i - j)];
                    arr[n1 - 1][n1 - 1 + (i - j)] = arr[n1 - 1 + i - j][i];
                    arr[n1 - 1 + i - j][i] = temp;

                }
            }
            for (int i = 0; i <= N - 1; i++) {
                for (int j = 0; j <= N - 1; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }


        }
    }
 /*
    [
  [31, 32, 228, 333]
  [79, 197, 241, 246]
  [77, 84, 126, 337]
  [110, 291, 356, 371]
]
     */

    //clock 90
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        for (int i = 0; i <= (a.size() - 1) / 2; i++) {
            int matrix_size = a.size() - 2*i-1;
            for (int j = 0; j < matrix_size; j++) {
                int temp = a.get(i).get(i+j);
                a.get(i).set(i+j,a.get(i+matrix_size-j).get(i));
                a.get(i+matrix_size-j).set(i,a.get(i+matrix_size).get(i+matrix_size-j));
                a.get(matrix_size+i).set(i+matrix_size-j,a.get(i+j).get(i+matrix_size));
                a.get(i+j).set(i+matrix_size,temp);
            }
        }
    }
}