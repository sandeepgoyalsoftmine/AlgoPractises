package com.company.array;

import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        LargestNumber largestNumber = new LargestNumber();
        Integer array[] = {3, 30, 34, 5, 9};
        System.out.println("args = " + largestNumber.largestNumber(Arrays.asList(array)));
    }
    public String largestNumber(final List<Integer> a) {

        String[] arr = new String[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = String.valueOf(a.get(i));
        }


        Arrays.sort(arr, (a1, b) -> (b+ a1).compareTo(a1 +b));


        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }

        if(sb.charAt(0) == '0'){     //check if all zeroes are there
            return String.valueOf(0);
        }

        return sb.toString();
    }
  /*  public String largestNumber(final List<Integer> A) {
        SortedMap<Character, ArrayList<String>> result = new TreeMap<>(Collections.reverseOrder());
        for(Integer i:A) {
            String number = String.valueOf(i);

            ArrayList<String> list = result.get(number.charAt(0));
            if(list == null) {
                list = new ArrayList();
                result.put(number.charAt(0),list);
            }
            list.add(number);
        }
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<Character, ArrayList<String>>entry : result.entrySet()) {
            ArrayList<String> list1 = entry.getValue();
            Collections.sort(list1,Collections.reverseOrder());
            list.add(sort(list1));
        }
        return sort(list);

    }

    public String sort(List<String> A) {
        String firstNumber = String.valueOf(A.get(A.size()-1));
        for(int i =A.size()-2;i>=0;i--) {
            String secondNumber = String.valueOf(A.get(i));
            firstNumber = sort(firstNumber,secondNumber);
        }
        boolean isAllZeero = true;
        for(int i =0;i<firstNumber.length() && isAllZeero;i++) {
            if(firstNumber.charAt(i)!='0') {
                isAllZeero = false;
            }
        }
        if(isAllZeero) return "0";
        return firstNumber;
    }
    public String sort(String firstNumber,String secondNumber) {
        return checkMax(firstNumber+secondNumber,secondNumber+firstNumber);
    }
    public String checkMax(String firstNumber,String secondNumber) {
        if(firstNumber.length()>secondNumber.length()) {
            return firstNumber;
        }else if(secondNumber.length()>firstNumber.length()) {
            return secondNumber;
        }else {
            int i =0;
            while(i<secondNumber.length()) {
                if(secondNumber.charAt(i)<firstNumber.charAt(i)) {
                    return firstNumber;
                }else if(firstNumber.charAt(i)<secondNumber.charAt(i)) {
                    return secondNumber;
                }else{
                    i++;
                }
            }
            return firstNumber;
        }
    }*/
}
