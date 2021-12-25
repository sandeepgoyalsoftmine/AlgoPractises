package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SprialPrinting {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Integer[] array = {1};//, 2,3};
        list.add(new ArrayList(Arrays.asList(array)));
        Integer[] array1 = {4};//, 5,6};
        list.add(new ArrayList(Arrays.asList(array1)));
        Integer[] array2 = {7};//, 8, 9};
        list.add(new ArrayList(Arrays.asList(array2)));
        solution.spiralOrder(list);

    }

    public static class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
            int rightDir = 0;
            int bottomDir = 0;
            int lastColoumn = A.get(rightDir).size() - 1;
            int lastRow = A.size() - 1;
            ArrayList<Integer> result = new ArrayList();
            int i , j ;
            while (bottomDir <= lastRow && rightDir <= lastColoumn) {
                j=rightDir;
                while (j <= lastColoumn) {
                    result.add(A.get(rightDir).get(j));
                    j++;
                }
                bottomDir++;
                i = bottomDir;
                while (i <= lastRow) {
                    result.add(A.get(i).get(lastColoumn));
                    i++;
                }
                lastColoumn--;
                if(bottomDir <= lastRow) {
                    j = lastColoumn;
                    while (j >= rightDir) {
                        result.add(A.get(lastColoumn).get(j));
                        j--;
                    }
                    lastRow--;
                }
                if(rightDir <= lastColoumn) {
                    i = lastRow;
                    while (i >= bottomDir) {
                        result.add(A.get(i).get(rightDir));
                        i--;
                    }
                    rightDir++;
                }

            }
            for (Integer is : result) {
                System.out.print(is + " ");
            }
            return result;
        }
    }

}
