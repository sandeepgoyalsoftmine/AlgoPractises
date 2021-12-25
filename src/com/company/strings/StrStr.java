package com.company.strings;

public class StrStr {
    public static void main(String[] args) {
        System.out.println(new Solution().strStr("bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba","babaaa"));
    }
    static class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public int strStr(final String A, final String B) {
            char a[] = B.toCharArray();
            char b[] = A.toCharArray();
            if(a.length==0 || b.length ==0) {
                return -1;
            }
            int ans = -1;
            for(int i=0;i<b.length;i++) {
                if(b[i]==a[0]) {
                    ans = i++;
                    int j =1;
                    while(i< b.length && j< a.length &&b[i]==a[j]) {
                        i++;
                        j++;
                    }
                    if(j==a.length) {
                        return ans;
                    }else {
                        i = ans;
                        ans = -1;
                    }
                }

            }
            return ans;
        }
    }
}
