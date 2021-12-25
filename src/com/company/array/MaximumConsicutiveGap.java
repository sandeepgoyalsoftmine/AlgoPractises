package com.company.array;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumConsicutiveGap {
    public static void main(String[] args) {
        MaximumConsicutiveGap maximumConsicutiveGap = new MaximumConsicutiveGap();
        ArrayList<Integer> A = new ArrayList<>();
        //21, 1, 45, 10, 33
        A.add(21);
        A.add(1);
        A.add(45);
        A.add(10);
        A.add(33);
        System.out.println("args = " + maximumConsicutiveGap.maximumGap(A));
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
        int size = A.size(), max = 0;
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(size);
        for (int i = 0; i < size; i++) {
            q.add(A.get(i));
        }

        for (int i = 1; i < size; i++) {
            int last = q.poll();
            int secondLast = q.peek();
            int diff = secondLast - last;
            if (diff > max) {
                max = diff;
            }
        }

        return max;

    }
}
