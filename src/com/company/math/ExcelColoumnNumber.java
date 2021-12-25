package com.company.math;

import java.util.Arrays;

public class ExcelColoumnNumber {
    public static void main(String[] args) {
        ExcelColoumnNumber excelColoumnNumber = new ExcelColoumnNumber();
        System.out.println("args = " + excelColoumnNumber.titleToNumber("AZA"));
    }
    public int titleToNumber(String A) {
        char [] chars = A.toCharArray();
        int number =0;
        int multipler = 1;
        for(int i = chars.length-1;i>=0;i--) {
            number = number+(chars[i]-'A'+1) * multipler;
            multipler*=26;
        }
        return number;
    }

}
