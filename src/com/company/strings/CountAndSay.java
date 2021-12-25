package com.company.strings;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(5));
    }
    public String countAndSay(int A) {
        String startPosition = "1";

        for(int i = 2;i<=A;i++) {
            String number = startPosition;
            String semi_result = "";
            startPosition ="";
            char oldNum = '#';
            int count = 1;
            for(char num:number.toCharArray()) {
                if(oldNum != num) {
                    if(semi_result.equals("")) {
                        semi_result = ""+num;
                    }else {
                        startPosition = startPosition + count + semi_result;
                        semi_result = ""+num;
                    }
                    count = 1;
                }else {
                    count++;
                }
                oldNum = num;
            }
            startPosition = startPosition + count +semi_result;
        }

        return startPosition;
    }
}
