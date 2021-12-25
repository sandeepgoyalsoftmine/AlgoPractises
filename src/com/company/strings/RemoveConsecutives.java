package com.company.strings;

public class RemoveConsecutives {
    public String solve(String A, int B) {
        StringBuilder ans = new StringBuilder();
        char first_char = A.charAt(0);

        StringBuilder concatenated_string = new StringBuilder();
        concatenated_string.append(first_char);
        int counter = 1;
        for(int i=1;i<A.length();i++) {
            if(counter == B) {
                concatenated_string = new StringBuilder();
                first_char = A.charAt(i);
                concatenated_string.append(A.charAt(i));
                counter = 1;
                continue;
            }
            if(first_char == A.charAt(i)) {
                counter++;
            }else {
                ans.append(concatenated_string);
                concatenated_string = new StringBuilder();
                first_char = A.charAt(i);
                concatenated_string.append(A.charAt(i));
                counter = 1;
            }

        }
        if(counter != B)
            ans.append(concatenated_string);
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println( new RemoveConsecutives().solve("aaagccc",3));
    }
}

/*


    char string = A.charAt(i);
            if(oldChar == string) {
        counter++;
    }else {
        if(counter != B) {
            ans.append(concatedString);
        }
        concatedString = new StringBuilder();
        counter = 0;
    }
            if(counter == B) {
        string = A.charAt(++i);
        i++;
        concatedString.append(string);
        counter = 0;
    }else {
        concatedString.append(string);
    }
    oldChar = string;

}
        if(counter != B) {
                ans.append(concatedString);
                }*/
