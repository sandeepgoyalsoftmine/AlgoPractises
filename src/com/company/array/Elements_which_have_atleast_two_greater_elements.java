package com.company.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Elements_which_have_atleast_two_greater_elements {
    public int Solution(ArrayList<Integer> array) {
        Collections.sort(array);
        return array.size()-2;

    }
    public static void main(String[] args) {
        System.out.println(new Elements_which_have_atleast_two_greater_elements().Solution(new ArrayList(List.of(new Integer[]{11, 17, 100, 5}))));
    }
}
