package com.company.array;

public class FactorialString {
    public static void main(String[] args) {
        FactorialString.Solution solution = new FactorialString.Solution();
        solution.solve(3);
    }
    public static class Solution {
        public String solve(int A) {
            String A1 = "1";
            for (int i = 1; i <= A; i++) {
                A1 = multiply(A1, i);
            }
            System.out.println(A1);
            return A1;
        }

        public String multiply(String a1, int number) {
            String result = "";
            int carry = 0;
            for (int i = a1.length() - 1; i >= 0; i--) {
                int num = Integer.parseInt(String.valueOf(a1.charAt(i)));
                num = (num * number)+carry;
                result = num %10 + result ;
                carry = num / 10;
            }
            return (carry!=0?carry+"":"") + result;
        }
    }
}
