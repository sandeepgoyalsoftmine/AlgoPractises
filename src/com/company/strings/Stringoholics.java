package com.company.strings;

import java.util.*;

public class Stringoholics {
    public static void main(String[] args) {
        System.out.println(new Solution().solve(Arrays.asList(new String[]{"a", "ababa", "aba"})));
    }
     static class Solution {
        public int solve(List<String> A) {
            ArrayList<StringBuilder> stringBuilders = new ArrayList<>();
            ArrayList<Integer> repeated[]= new ArrayList[A.size()];
            int max = 1;
            for(int i=0;i<A.size();i++) {
                stringBuilders.add(new StringBuilder(A.get(i)));
                repeated[i].add(1);
            }
            while(true){
              /*  for(int i=0;i<A.size();i++) {
                    for (int k = 0; k < repeated[i]; k++) {
                        stringBuilders.get(i).append(stringBuilders.get(i).charAt(k));
                    }
                    stringBuilders.get(i).delete(0,repeated[i]);
                    repeated[i] = ++repeated[i] % A.get(i).length() % 1000000007;
                    if(repeated[i]>max) {
                        max = repeated[i];
                    }
                }*/
                boolean allSame = true;
                for(int i=0;i<A.size();i++) {
                    if(!stringBuilders.get(i).toString().equals(A.get(i))) {
                        allSame = false;
                    }else {
                        stringBuilders.set(i,new StringBuilder(A.get(i)));
                    }
                }
                if(allSame)
                    break;
            }
            return max;
        }
         int findlcm(int arr[])
         {
             // Initialize result
             int ans = arr[0];

             // ans contains LCM of arr[0], ..arr[i]
             // after i'th iteration,
             for (int i = 1; i < arr.length; i++)
                 ans = (((arr[i] * ans)) /
                         (gcd(arr[i], ans)));

             return ans;
         }
        int gcd(int[] numbers) {
            int result = numbers[0];
            for (int i = 1; i < numbers.length; i++)
            {
                result = gcd(numbers[i], result);

                if(result == 1)
                {
                    return 1;
                }
            }
            return result;
        }
         // Function to return gcd of a and b
         int gcd(int a, int b)
         {
             if (a == 0)
                 return b;
             return gcd(b % a, a);
         }
     }
}
