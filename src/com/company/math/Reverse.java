package com.company.math;

public class Reverse {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println("args = " + reverse.reverse(-1146467285));
    }
   public int reverse(int A) {
        int number = A;
        int multiplier = 10;
        int newNumber = 0;
        int prev_rev_num = 0;
        boolean isNegative= false;
        if(A<0) {
            isNegative =true;
        }
        number = Math.abs(A);
        while(number!=0) {
            newNumber =newNumber*multiplier;
            int curr_digit = number%10;
            newNumber += (curr_digit);
            if ((newNumber - curr_digit)/10 != prev_rev_num)
            {
                return 0;
            }
            prev_rev_num = newNumber;
            number /=10;
        }
        return (isNegative?-1:1)* newNumber;
    }
}
