package com.company.math;

public class PostionSequecing {
    public int solve(int A, int B) {
        int value;
        int i;
        int sum = 0;
        int ans = 0;
        for (i = 0; i < A; i++) {
            value = (B-sum)/(A-i);
            if(value>i+1) {
                value= i+1;
            }
            sum = sum +value;
            if(value != i+1) {
                return A-i;
            }
        }



        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new PostionSequecing().solve(10,39));
    }
}
