package com.company.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Elements_which_have_atleast_two_greater_elements {
    public ArrayList<Integer> Solution(ArrayList<Integer> array) {
        ArrayList<Integer> result = new ArrayList<>();
        if(array.size()<=2) {
            return result;
        }
        int secondLargest = array.get(0)<array.get(1)?array.get(0):array.get(1);
        int largest =array.get(0)<array.get(1)?array.get(1):array.get(0);
        for (int numberr = 2;numberr<array.size();numberr++) {
            int number = array.get(numberr);
            if (number > largest) {
                result.add(secondLargest);
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                result.add(secondLargest);
                secondLargest = number;

            } else {
                result.add(number);
            }


        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(new Elements_which_have_atleast_two_greater_elements().Solution(new ArrayList(List.of(new Integer[]{11, 17, 100, 5}))).toString());
    }
}
