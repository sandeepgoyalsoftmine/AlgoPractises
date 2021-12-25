package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WaveArray {
    public static void main(String[] args) {
        WaveArray waveArray = new WaveArray();
        ArrayList<Integer> A = new ArrayList<>();
        //21, 1, 45, 10, 33
        Integer array[] = {5, 1, 3, 2, 4};
        System.out.println("args = " + waveArray.wave(Arrays.asList(array)));
    }

    public ArrayList<Integer> wave(List<Integer> A) {
        Collections.sort(A, Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = A.size() - 2; i >= 0; i = i - 2) {
            list.add(A.get(i));
            list.add(A.get(i + 1));
        }
        if (list.size() < A.size()) {
            list.add(A.get(0));
        }
        return list;
    }
}
