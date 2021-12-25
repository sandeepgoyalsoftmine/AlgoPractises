package com.company.math;

public class  Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println("args = " + palindrome.isPalindrome(121));
    }
    public int isPalindrome(int A) {
        int number = A;
        int multiplier = 10;
        int newNumber = 0;
        while(number!=0) {
            newNumber =newNumber*multiplier;
            newNumber += (number%10);
            number /=10;
        }
        if(newNumber == A) {
            return 1;
        }else {
            return 0;
        }
    }
}
