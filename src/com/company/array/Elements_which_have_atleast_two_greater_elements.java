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
        int largest = array.get(0)<array.get(1)?array.get(1):array.get(0);

        for (int numberr = 2;numberr<array.size();numberr++) {
            int number = array.get(numberr);
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;

            }

        }
        for (int numberr = 0;numberr<array.size();numberr++) {
            int number = array.get(numberr);
            if (number == largest || number == secondLargest) {
                continue;
            } else  {
                result.add(number);
            }

        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(new Elements_which_have_atleast_two_greater_elements().Solution(new ArrayList(List.of(new Integer[]{ 391, 634, 740, 441, 75, 444, 65, 611, 679, 59, 878, 102, 42, 190, 801, 571, 79, 686, 523, 580, 199, 497, 879, 334, 200, 202, 991, 341, 479, 563, 112, 550, 494, 468, 56, 644, 53, 581, 836, 461, 905, 849, 838, 434, 818, 350, 585, 280, 252, 834, 510, 420, 395, 776, 118, 886, 19, 809, 534, 143, 933, 15, 999, 514, 230, 531, 666, 841, 861, 703, 972, 622, 640, 21, 811, 476, 751, 430, 308, 996, 165, 812, 424, 412, 903, 601, 226, 239, 728, 135}))).toString());
    }
}
