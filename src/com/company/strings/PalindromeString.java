package com.company.strings;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(new PalindromeString().isPalindrome("\"A man, a plan, a canal: Panama\""));
    }
    public int isPalindrome(String A) {
        A = A.toUpperCase();
        int i = 0, j = A.length() - 1;
        while (i < A.length()) {
            while (i < A.length() && !Character.isLetterOrDigit(A.charAt(i)) ) {
                i++;
            }
            while ( j>=0 && !Character.isLetterOrDigit(A.charAt(j))) {
                j--;
            }
            if(j<0 && i>= A.length()) {
                break;
            }else if (A.charAt(i) != A.charAt(j))
                break;
            i++;
            j--;
        }
        if (i == A.length()) {
            return 1;
        }
        return 0;
    }

}
