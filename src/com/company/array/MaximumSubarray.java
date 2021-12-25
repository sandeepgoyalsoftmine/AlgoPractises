package com.company.array;

import java.util.ArrayList;

public class MaximumSubarray {
    public static void main(String[] args) {
        int [] array = {-1,1};
    }
}
class Solution {
    public int maxSubArray(ArrayList<Integer> nums) {
        int maxNumber = nums.get(0);
        int sum = 0;
        for (int i:nums){
            sum += i;
            if (sum>maxNumber) {
                maxNumber = sum;
            }
            if(sum<0) {
                sum =0;
            }

        }
        return maxNumber;
    }
}