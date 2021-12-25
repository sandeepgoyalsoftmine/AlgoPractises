package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickFromBothSide {
    public static void main(String[] args) {
        PickFromBothSide pickFromBothSide = new PickFromBothSide();
        Integer array[] = { -533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
        System.out.println("args = " + pickFromBothSide.solve(Arrays.asList(array),48));
    }
    public int solve(List<Integer> A, int B) {
        int sum = 0;
        for(int i=0;i<B;i++) {
            sum+=A.get(i);

        }
        int max = sum;
        for(int i=A.size()-1;i>=A.size()-B;i--) {
            int index = i-(A.size()-B);
            sum = sum-A.get(index)+A.get(i);
            max = Math.max(sum,max);
        }
        return max;

    }
}
