package com.company.bit;

public class Count_total_set_bits {
    public static void main(String[] args) {
        System.out.println(new Count_total_set_bits().solve(3));
    }
    public int solve(int A) {
        int bitcount = 0;
        for (int i = 0; i < 32; i++) {
            for (int j = 1; j <= A; j++) {
                if (((1 << i) & (j)) != 0) {
                    bitcount++;
                }
                bitcount = bitcount % 1000000007;
            }
        }
        return bitcount;
    }
}
