package com.company;

public class SwitchOnLight {

    static void permute(String s , String answer)
    {
    if (s.length() == 0)
    {
        System.out.println(answer);
        return;
    }

    for(int i = 0 ;i < s.length(); i++)
    {
        char ch = s.charAt(i);
        String left_substr = s.substring(0, i);
        String right_substr = s.substring(i + 1);
        String rest = left_substr + right_substr;
        permute(rest, answer + ch);
    }
}

    // Driver code
    public static void main(String args[])
    {

        String s;
        String answer="";

        System.out.print("Enter the string : ");
        s = "abc";

        System.out.print("\nAll possible strings are : ");
        new SwitchOnLight().solve(5);
    }

    public void solve(int A) {
        String switches = "";
        for(int i = 0 ;i< A;i++) {
            switches+=i;
        }
        boolean[] lights = new boolean[A];
        int onLights = 0;
        int onSwitches = 0;
        permute(switches,"");
    }

    private int permute(boolean[] switches, boolean[] lights, int onLights, int onSwitches) {
       /* if (onLights == lights.length)
        {
            return onSwitches;
        }

        for(int i = 0 ;i < switches.length; i++)
        {
            switches[i] = true;
            String left_substr = switches.(0, i);
            String right_substr = switches.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }*/
        return 0;
    }
}
