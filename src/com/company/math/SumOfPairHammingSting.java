package com.company.math;

import java.util.List;

public class SumOfPairHammingSting {
    public int hammingDistance(final List<Integer> A) {
        int sum =0;
        int n = A.size();
        for(int i=0;i<32;i++) {
            int count = 0;
            for (int j = 0; j < n; j++)
                if ((A.get(j) & (1 << i)) == 0)
                    count++;
            sum += (count * (n - count) * 2);
            // Add "count * (n - count) * 2"
            // to the answer
            }

        return sum;
    }
}
