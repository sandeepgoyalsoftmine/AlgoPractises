package com.company.bit;

public class Add_Binary_strings {
    public static void main(String[] args) {
        System.out.println(new Add_Binary_strings().addBinary("11","11"));
    }
    public String addBinary(String A, String B) {
        int maxLength = Math.max(A.length(), B.length());
        int carry = 0;
        String ans ="";
        for(int i = 0;i<maxLength;i++) {
            int sum =  valueAT(A,i)+ valueAT(B,i) +carry;
            carry = sum/2;
            sum %=2;
            ans =  sum + ans;
        }
        if(carry > 0) {
            ans = carry + ans;
        }
        return ans;
    }

    public Integer valueAT(String A, int position ) {
        if(position>=A.length()){
            return 0;
        }else {
            return Integer.parseInt(String.valueOf(A.charAt(position)));
        }
    }
}