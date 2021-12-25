package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumUnsortedArray {
    public static void main(String[] args) {
        MaximumUnsortedArray maximumUnsortedArray = new MaximumUnsortedArray();
        //Integer array[] = {10, 20, 11, 4, 11, 11, 20, 10, 11, 11, 20, 14, 11, 20, 20 };//[0, 12]
        Integer array[] = {1, 3, 2, 4, 5 };//[7,17]
        System.out.println("args = " + maximumUnsortedArray.subUnsort(Arrays.asList(array)));

    }
    /*
    * make two arrays
    * first with increasing order remove that number skip where sort skip [1,3,3,4,5]
    * first with decreasing order from last order remove that number skip where sort skip [1,2,2,4,5]
    * where number change from start and end it that number is ans
     */

            public ArrayList<Integer> subUnsort(List<Integer> A) {
                int n = A.size();
                ArrayList<Integer> result = new ArrayList<>();

                int max[] = new int[n];
                max[0]=A.get(0);
                for(int i=1; i<n; i++) {
                    max[i] = Math.max(max[i-1], A.get(i));
                }
                int min[] = new int[n];
                min[n-1]=A.get(n-1);
                for(int i=n-2; i>=0; i--) {
                    min[i] = Math.min(min[i+1], A.get(i));
                }

                // System.out.print(Arrays.toString(max)+"::"+Arrays.toString(min)+"::");

                int start=-1;
                for(int i=0; i<n; i++) {
                    if(max[i]!=min[i]) {
                        start=i;
                        break;
                    }
                }
                result.add(start);
                if(start==-1)
                    return result;

                for(int i=n-1; i>=0; i--) {
                    if(max[i]!=min[i]) {
                        result.add(i);
                        break;
                    }
                }
                return result;
            }

        }


