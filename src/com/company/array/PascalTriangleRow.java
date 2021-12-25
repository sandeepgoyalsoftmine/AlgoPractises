package com.company.array;

import java.util.ArrayList;

public class PascalTriangleRow {
    public static void main(String[] args) {
        PascalTriangleRow pascalTriangle = new PascalTriangleRow();
        System.out.println("args = " + pascalTriangle.getRow(2));
    }
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer>[] result = new ArrayList[2];
        result[0] = new ArrayList<>();
        result[1] = new ArrayList<>();

        for(int i=0;i<=A;i++) {
            if(i>0){
                int value = 0;
                for(int j=0;j<result[(i-1)%2].size();j++) {
                    value = value+result[(i-1)%2].get(j);
                    if(result[i%2].size()>j)
                        result[i%2].set(j,value);
                    else
                        result[i%2].add(j,value);
                    value = result[(i-1)%2].get(j);
                }
            }
            result[i%2].add(1);
        }
        return result[(A)%2];
    }
}
