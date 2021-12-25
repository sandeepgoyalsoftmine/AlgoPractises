package com.company.math;

public class Power_OF_Two_Integers {
    public static void main(String[] args) {
        Power_OF_Two_Integers power_of_two_integers = new Power_OF_Two_Integers();
        System.out.println(power_of_two_integers.isPower(16808));
    }
    public int isPower(int A) {
        for(int i =2;i<=(int)(Math.sqrt(A));i++) {
            float temp = A;
            while(temp>i) {
                if(temp%i !=0) {
                    break;
                }
                temp = temp/i;
            }
            if(temp == i) {
                return 1;
            }
        }
        return 0;
    }
}
