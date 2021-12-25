package com.company.binarysearch;

import java.util.ArrayList;
import java.util.HashMap;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(new PowerFunction().pow(71045970,41535484,64735492));
    }
    public int pow(int x,int n, int d) {
        return pow(x*1L,n*1L,d*1L);
    }
    public int pow(long x, long n, long d) {
        if(x==0) {
            return 0;
        }
        HashMap<Integer,Long> resultArray = new HashMap<>();
        int power2=1;
        int i=0;
        long result = 1;
        while(power2<=n) {
            if(i ==0) {
                resultArray.put(power2,x%d);
            }else {
                resultArray.put(power2, ((result % d) * (result % d)) % d);
            }
            result = resultArray.get(power2);
            i++;
            power2 = (int) Math.pow(2,i);

        }
        long diff = n-power2/2;
        power2 = 1;
        while(diff!=0) {
            if((diff & 1) ==1) {
                result = (result * (resultArray.get(power2)))%d;
            }
            diff = diff>>1;
            power2 = power2*2;
        }
        return (int) (result<0?result+d:result);
    }
}
