package com.company.strings;

public class AmazingSubstringVowelStarting {
    public static void main(String[] args) {
        System.out.println(new AmazingSubstringVowelStarting().solve("ABEC"));
    }
    public int solve(String A) {
        int result = 0;
        char[] strings = A.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = strings.length - 1; i >= 0; i--) {
            switch (strings[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    result = (result + process(strings.length-i-1) % 10003)%10003;
                    break;


            }
        }
        return result;
    }

    int process(int i) {
        return 1+i;
    }

}
