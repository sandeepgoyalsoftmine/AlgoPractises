package com.company.array;

public class BackspaceCompare {
    public static void main(String[] args) {
        String S = "y#fo##f",T =  "y#f#o##f";

        System.out.println(new BackspaceCompare().backspaceCompare(S,T));
    }
    public boolean backspaceCompare(String S, String T) {
        return getCompiledString(S).equals(getCompiledString(T));
    }
    public String getCompiledString(String s) {
        String p = "";
        for(char a:s.toCharArray() ) {
            if(a =='#') {
                if(p.length()>0)
                p=p.substring(0,p.length()-1);
            }else {
                p +=a;
            }
        }
        return p;
    }
}
