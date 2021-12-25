package com.company.math;

import java.util.ArrayList;

public class ExcelColoumTitle {
    public static void main(String[] args) {
        ExcelColoumTitle excelColoumnNumber = new ExcelColoumTitle();
        System.out.println("args = " + excelColoumnNumber.convertToTitle(26));
    }
    public String convertToTitle(int A) {
        ArrayList<Character> chars = new ArrayList<>();
        while(A!=0) {
            int reminder = A%(26);
            if(reminder == 0) {
                reminder = 26;
                A-=1;
            }
            A = A/26;
            chars.add((char)(reminder + 'A'-1));
        }
        String result = "";
        for(int i = chars.size()-1;i>=0;i--) {
            result+=chars.get(i);
        }
        return result;
    }

}
