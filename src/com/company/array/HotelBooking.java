package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HotelBooking {
    public static void main(String[] args) {
        HotelBooking hotelBooking = new HotelBooking();
        Integer array[] = {13, 14, 36, 19, 44, 1, 45, 4, 48, 23, 32, 16, 37, 44, 47, 28, 8, 47, 4, 31, 25, 48, 49, 12, 7, 8 };
        Integer array1[] = {28, 27, 61, 34, 73, 18, 50, 5, 86, 28, 34, 32, 75, 45, 68, 65, 35, 91, 13, 76, 60, 90, 67, 22, 51, 53};
        int k = 23;
        System.out.println("args = " + hotelBooking.hotel(Arrays.asList(array),Arrays.asList(array1),k));
    }
    public boolean hotel(List<Integer> arrive, List<Integer> depart, int K) {
        ArrayList<Character> list = new ArrayList();
        Collections.sort(arrive);
        Collections.sort(depart);
        int length = 0;
        int i=0,j=0;
        while(i<arrive.size()&&j<depart.size()) {
            if(arrive.get(i)<depart.get(j)) {
                list.add('A');
                i++;
            }else {
                list.add('D');
                j++;
            }
        }
        while(i<arrive.size()) {
            list.add('A');
            i++;
        }
        while(j<depart.size()) {
            list.add('D');
            j++;
        }

        for(i=0;i< list.size();i++) {
            if(list.get(i)=='A') {
                length++;
            }else if(list.get(i)=='D') {
                length--;
            }
            if(length>K) {
                return false;
            }
        }
        return true;
    }
}
