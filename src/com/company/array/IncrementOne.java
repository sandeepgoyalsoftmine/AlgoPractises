package com.company.array;

import java.util.ArrayList;
import java.util.Iterator;

public class IncrementOne {
    public static void main(String[] args) {
        IncrementOne incrementOne = new IncrementOne();
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 3, 7, 6, 4, 0, 5, 5, 5
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);

        incrementOne.plusOne(arrayList);
    }

    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int num = 0;
        int carry = 1;
        Iterator<Integer> it = A.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i == 0) {
                it.remove();
            }else {
                break;
            }
        }
        for (int i = A.size() - 1; i >= 0; i--) {
            num = A.get(i) +carry;
            if(num > 10)  {
                A.set(i,(num) % 10);
                carry = num / 10;
            }else {
                A.set(i,num);
                return A;
            }
        }
        if (carry != 0) {
            A.add(0, carry);
        }

        return A;

    }
}
