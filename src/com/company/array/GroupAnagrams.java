package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] list = {"eat", "tea", "tan", "ate", "nat", "bat"};
        new GroupAnagrams().groupAnagrams(list);
        System.out.println(new GroupAnagrams().groupAnagrams(list));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<String,List<String>> list = new HashMap<>();
        for(String str: strs) {
            String number = sort(str);
            List<String> l = list.get(number);
            if(l == null) {
                l = new ArrayList<>();
                list.put(number,l);
            }
            l.add(str);

        }
        for (List<String> l: list.values()){
            result.add(l);
        }
        return result;
    }

    private String sort(String str) {
        char array[] = str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
