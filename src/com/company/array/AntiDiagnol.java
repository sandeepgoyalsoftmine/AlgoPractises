package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagnol {
    public static void main(String[] args) {
        AntiDiagnol antiDiagnol = new AntiDiagnol();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Integer[] array = {1, 2,3};
        list.add(new ArrayList(Arrays.asList(array)));
        Integer[] array1 = {4, 5,6};
        list.add(new ArrayList(Arrays.asList(array1)));
        Integer[] array2 = {7 , 8, 9};
        list.add(new ArrayList(Arrays.asList(array2)));
        System.out.println("args = " + antiDiagnol.diagonal(list));

    }
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int right = A.get(0).size();
        int bottom = A.size();
        for(int i = 0;i<right;i++) {
            ArrayList<Integer> value = new ArrayList<>();
            int coloumn = i;
            int row = 0;
            while(coloumn >= 0) {
                value.add(A.get(row).get(coloumn));
                coloumn--;
                row++;
            }
            result.add(value);
        }
        for(int i= 1;i<bottom;i++) {
            ArrayList<Integer> value = new ArrayList<>();
            int coloumn = right-1;
            int row = i;
            while(row < bottom) {
                value.add(A.get(row).get(coloumn));
                coloumn--;
                row++;
            }
            result.add(value);
        }
        return result;
    }
}

