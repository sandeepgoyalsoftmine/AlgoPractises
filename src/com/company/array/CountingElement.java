package com.company.array;

import java.util.HashMap;

public class CountingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(new CountingElement().countElements(arr));
    }
    public int countElements(int[] arr) {
        HashMap<Integer,Maping> map = new HashMap<>();
        for (int i:arr) {
            Maping value = map.get(i);
            if(value == null){
                value = new Maping();
            }
            value.incrementCount();
            map.put(i,value);
            value = map.get(i+1);
            if (value != null){
                map.get(i).setExist();
            }
            value = map.get(i-1);
            if(value != null) {
                value.setExist();
            }
        }
        int count = 0;
        for(Maping value:map.values()){
            if(value.isExist()) {
                count+=value.getCount();
            }
        }
        return count;
    }
    class Maping {


        boolean exist;
        int count = 0;
        void incrementCount() {
            count++;
        }
        int getCount() {
            return count;
        }
        public boolean isExist() {
            return exist;
        }

        public void setExist() {
            this.exist = true;
        }

    }
}
