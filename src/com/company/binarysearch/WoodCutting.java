package com.company.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WoodCutting {
    public static void main(String[] args) {
        System.out.println(new WoodCutting().solve(Arrays.asList(114, 55, 95, 131, 77, 111, 141), 95));
    }

    public int solve(List<Integer> A, int B) {
        A.sort(Collections.reverseOrder());
        int height = 0;
        int requiredmeteres = 0;
        int firstHegith = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            int secondHeight = A.get(i);
            int diff = firstHegith - secondHeight;
            if (diff < (B - requiredmeteres) / i) {
                requiredmeteres += diff * i;
                height += diff;
            } else {
                height += Math.ceil(((float)(B - requiredmeteres)) / i);
                break;
            }

            firstHegith = secondHeight;
        }

        return A.get(0) - height;
    }
}


//25 16 14
