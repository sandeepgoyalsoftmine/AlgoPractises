package com.company.array;

import java.util.ArrayList;

public class NumberPartition {
    public static void main(String[] args) {
        NumberPartition numberPartition = new NumberPartition();
        ArrayList<Integer> integers = new ArrayList<>();

//        integers.add(3);
//        integers.add(3);
//        integers.add(-3);
//        integers.add(3);
//        integers.add(0);
//        integers.add(0);
//        integers.add(0);
//        integers.add(0);
//        integers.add(0);
//        integers.add(0);
//        integers.add(0);
//        integers.add(0);
//        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(0);
        integers.add(3);
        System.out.println("args = " + numberPartition.solve(5, integers));

    }

    public int solve(int A, ArrayList<Integer> B) {
        int sum = 0;
        for (int i : B) {
            sum += i;
        }
        if(sum%3 != 0) {
            return 0;
        }
        sum = sum / 3;
        int sm =0;
        int count = 0;

        int j;
        for (j=0;j<B.size();j++) {
            int i = B.get(j);
            sm += i;
            if(sm == sum) {
                j++;
                break;
            }
        }
        int k;
        sm = 0;
        for (k=B.size()-1;k>=0;k--) {
            int i = B.get(k);
            sm += i;
            if(sm == sum) {
                k--;
                break;
            }
        }
        if(k>=j) {
            count = 1;
        }

        sm =0;
        int zeroahead;
        for(int i =j;i<=k;i++) {
            if(sm == 0) {
                if(i>j)
                    count++;
                for (zeroahead = k; zeroahead > i; zeroahead--) {
                    sm += B.get(zeroahead);
                    if (sm == 0) {
                        count++;
                    }
                }
                sm =0;
            }
            sm+=B.get(i);

        }
        return count;
    }
}
