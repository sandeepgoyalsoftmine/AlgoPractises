package com.company.strings;


public class VowelConsentSubstring {
    public int solve(String A) {
        int ans = 0;
        int consentCount = 0;
        int vowelCount = 0;
        for(int i = 0;i<A.length();i++) {
            boolean isVowel = isVowel(A.charAt(i));
            if(isVowel) {
                if(consentCount>0) {
                    ans +=consentCount;
                    ans = ans % 1000000007;
                }
                vowelCount++;
            }else {
                if(vowelCount>0) {
                    ans +=vowelCount;
                    ans = ans % 1000000007;
                }
                consentCount++;
            }
        }
        return ans;
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        System.out.println( new VowelConsentSubstring().solve("abc"));
    }
}
