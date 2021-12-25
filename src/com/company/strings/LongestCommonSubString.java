package com.company.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonSubString {
    public static void main(String[] args) {
        System.out.println(new LongestCommonSubString().longestCommonPrefix(Arrays.asList("abcd", "abcd", "abfgh")));
    }
    public String longestCommonPrefix(List<String> A) {
        char[] charArray = A.get(0).toCharArray();
        int lengthCommon = charArray.length;
        for (int i = 1; i < A.size(); i++) {
            char[] checkingArray = A.get(i).toCharArray();
            int j;
            for (j = 0; j < charArray.length && j < checkingArray.length && j < lengthCommon; j++) {
                if (checkingArray[j] != charArray[j]) {
                    break;
                }
            }
            lengthCommon = j;
        }
        return new String(charArray).substring(0,lengthCommon);

    }
}
