package com.company.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MINIMUM_PICKS {

    public int solution(ArrayList<Integer> array) {
        int eventMax = Integer.MIN_VALUE;
        int oddMin = Integer.MAX_VALUE;
        for(int i:array) {
            if(i%2==0) {
                if(i>eventMax) {
                    eventMax = i;
                }
            }else {
                if(i<oddMin) {
                    oddMin = i;
                }
            }
        }
        return eventMax-oddMin;

    }
    public static void main(String[] args) {
        System.out.println(new MINIMUM_PICKS().solution(new ArrayList(List.of(new Integer[]{0, 2, 9}))));
    }
}
