package com.company.array;

import java.util.ArrayList;

public class SetMatrixZero {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int row[] = new int[a.size()];
        int coloumn[] = new int[a.size()];

        for(int i=0;i<a.size();i++) {
            for(int j=0;j<a.get(i).size();j++) {
                if(a.get(i).get(j) == 0) {
                    row[i] = 0;
                    coloumn[j] =0;
                }

            }
        }
        for(int i=0;i<a.size();i++) {
            for(int j=0;j<a.get(i).size();j++) {
                if(row[i]==0) {
                    a.get(i).set(j,0);
                }else if(coloumn[j]==0) {
                    a.get(i).set(j,0);
                }

            }
        }
    }
}
