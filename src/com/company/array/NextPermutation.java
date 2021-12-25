package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        NextPermutation nextPermutation = new NextPermutation();
        Integer[] number = { 444, 994, 508, 72, 125, 299, 181, 238, 354, 223, 691, 249, 838, 890, 758, 675, 424, 199, 201, 788, 609, 582, 979, 259, 901, 371, 766, 759, 983, 728, 220, 16, 158, 822, 515, 488, 846, 321, 908, 469, 84, 460, 961, 285, 417, 142, 952, 626, 916, 247, 116, 975, 202, 734, 128, 312, 499, 274, 213, 208, 472, 265, 315, 335, 205, 784, 708, 681, 160, 448, 365, 165, 190, 693, 606, 226, 351, 241, 526, 311, 164, 98, 422, 363, 103, 747, 507, 669, 153, 856, 701, 319, 695, 52};

        System.out.println("args = " + nextPermutation.nextPermutation(Arrays.asList(number)));
    }
    public List<Integer> nextPermutation(List<Integer> A) {
        if(A.size() == 1) {
            return A;
        }
        int first=A.size()-2,last=A.size()-1;
        int smallestNumber =last;
        for(int i=A.size()-1;i>=1;i--) {

            first = i-1;
            last = i;
            if(A.get(first)<A.get(last)) {
                break;
            }else {

            }
        }
        if(first>last) {
            Collections.sort(A);
            return A;
        }else {
            ArrayList<Integer> result = new ArrayList<>();
            for(int i=0;i<first;i++) {
                result.add(A.get(i));
            }

            List<Integer> subList =  A.subList(first,A.size());
            smallestNumber = 1;
            for(int i= 2;i<subList.size();i++) {
                if(subList.get(smallestNumber)>subList.get(i) && subList.get(i) > subList.get(0)) {
                    smallestNumber = i;
                }
            }
            int temp = subList.get(0);
            subList.set(0,subList.get(smallestNumber));
            subList.set(smallestNumber,temp);
            result.add(subList.get(0));
            subList = subList.subList(1,subList.size());
            Collections.sort(subList);
            result.addAll(subList);
            return result;
        }
    }
}
