package com.company;

public class SwitchOnBulb {
    public static void main(String[] args) {
        System.out.println(new SwitchOnBulb().solve(74320-3696));
    }

    public int solve(int A) {
        array1 = new int[A];
        boolean[] switches = new boolean[A - 1];
        boolean[] lights =new boolean[A];
        int ans = factorial(A - 1) * (A - 1);

        ans =  ans - notIncluded(switches,lights,0);
        for(int i = 0;i<array1.length;i++) {
            System.out.println(i + "  "+ array1[i]);
        }
        return ans;
    }

    int[] array1;
    private int notIncluded(boolean[] switches, boolean[] lights,int alreadyon) {
        int ans = 0;
        for (int i = 0; i < switches.length; i++) {
            if (switches[i]) {
                continue;
            }

            int zeroCount = 0;
            if(alreadyon==lights.length) {
                for(int k = 0; k < switches.length; k++){
                if(!switches[k])
                    zeroCount++;
                }
                array1[zeroCount]++;
                ans++;
            }
            if(zeroCount == 2) {
                for(int k = 0; k < switches.length; k++) {
                    System.out.print(switches[k] ? 1 : 0);
                }
                System.out.println();
            }
            if (!lights[i]) {
                alreadyon++;
            }
            if (!lights[i + 1]) {
                alreadyon++;
            }
            lights[i] = true;
            lights[i + 1] = true;

            switches[i] = true;
            ans += notIncluded(switches, lights,alreadyon);
            switches[i] = false;
            if(i>0) {
                if (!switches[i - 1]) {
                    lights[i] = false;
                    alreadyon--;
                }
            }
            else {
                lights[i] = false;
                alreadyon--;
            }
            if(i<switches.length-1) {
                if (!switches[i + 1]) {
                    lights[i + 1] = false;
                    alreadyon--;
                }
            }
            else {
                lights[i + 1] = false;
                alreadyon--;
            }
        }
        return ans;
    }

    public int factorial(int num) {
        int multiply = 1;
        for (int i = 1; i <= num; i++) {
            multiply *= i;
            multiply %= 1000000007;
        }
        return multiply;
    }
}
