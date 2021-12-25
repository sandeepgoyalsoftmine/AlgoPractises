package com.company.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class CityTour {
    /*public int solve(int A, ArrayList<Integer> B) {
        int count = 0;
        ArrayList<Integer> checked = new ArrayList<>();
        if(A==B.size()) {
            return 1;
        }

        for (int i = 0; i < B.size(); i++) {
            int newVisited;
            if(B.get(i) != 1) {
                newVisited = B.get(i) - 1;
                if (!B.contains(newVisited) && !checked.contains(newVisited)) {
                    B.add(newVisited);
                    count += solve(A, B);
                    checked.add(newVisited);
                    B.remove(new Integer(newVisited));
                }
            }
            if(B.get(i) != A) {
                newVisited = B.get(i) + 1;
                if (!B.contains(newVisited) && !checked.contains(newVisited)) {
                    B.add(newVisited);
                    count += solve(A, B);
                    checked.add(newVisited);
                    B.remove(new Integer(newVisited));
                }
            }
        }
        return count;
    }*/
    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(3);
//        integers.add(5);
//           System.out.println("args = " + new CityTour().solve(5, integers));

    }
    class Solution {

        long comb[][] = new long[1001][1001];
        long exp[] = new long[1001];

        public Solution() {
            for (int i = 0; i < 1001; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || i == j) comb[i][j] = 1;
                    else {
                        comb[i][j] = (comb[i - 1][j] + comb[i - 1][j - 1]) % 1000000007;
                    }
                }
            }
            exp[0] = 1;
            for (int i = 1; i < 1001; i++) {
                exp[i] = (exp[i - 1] * 2) % 1000000007;
            }
        }

        public int solve(int A, ArrayList<Integer> B) {
            Collections.sort(B);
            long ans = 1;
            int cnt = B.get(0) - 1;
            for (int i = 1; i < B.size(); i++) {
                int t = B.get(i) - B.get(i - 1) - 1;
                if (t > 0) {
                    ans = ((ans * exp[t - 1]) % 1000000007 * comb[cnt + t][t]) % 1000000007;
                    cnt += t;
                }
                //System.out.print(i+" "+t+" ")
            }
            int t = A - B.get(B.size() - 1);
            ans = (ans * comb[cnt + t][t]) % 1000000007;
            return (int) ans;
        }
    }
}
