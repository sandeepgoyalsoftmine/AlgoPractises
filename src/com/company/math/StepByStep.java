package com.company.math;
/*
If we only took positive steps, it would be 1+2+3+4=10>9.
Now, at any point(say i), if you would have taken a step backward, your sum would have been 2*i less than the sum you have if i was in positive direction.

So in case sum-2i=target, it means we have to take one negative step
This means (sum-target)=2i i.e. (sum-target is even).

Hence you go on to the next move until the condition (sum-target==2*i) is true
This is why you check (sum-target)%2!=0 at every iteration of the loop.
 */
public class StepByStep {
    public static void main(String[] args) {
        System.out.println(solve(-42));
    }
    public static  int solve(int A) {
        A= Math.abs(A);
        int value =0;
        int i =0;
        while(true) {
            value = value+i;
            if(value > A) {
                while((value-A)%2!=0) {
                    i++;
                    value = value+i;
                }
                break;

            }else if(value == A) {
                break;
            }
            i++;
        }
        return i;
    }
}
