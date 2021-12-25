package com.company.array;

import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println("args = " + pascalTriangle.solve(6));
    }
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i=0;i<A;i++) {
            ArrayList<Integer> integer = new ArrayList<>();
           if(i>0){
               int value = 0;
               for(int j=0;j<result.get(i-1).size();j++) {
                   integer.add(value+result.get(i-1).get(j));
                   value = result.get(i-1).get(j);
               }
            }
            integer.add(1);
           result.add(integer);
        }
        return result;
    }
}
