package com.company.array;

import java.util.ArrayList;

public class FlipOneZero {
    public static void main(String[] args) {
        FlipOneZero flipOneZero = new FlipOneZero();
        System.out.println("args = " + flipOneZero.flip("0111000100010").toString());
    }



    public ArrayList<Integer> flip(String s) {
        /*
            l to r is the current interval;
            ml to mr is the answer interval;
            n1 and n0 are the number of zeros and ones after fliping in current interval;
            diff is the difference of no. of zeros to one in our answer interval;
            flag is to check if all indices are '1' only;

        */
        int n1=0,n0=0,l=0,r=0,ml=0,mr=0,diff=0,i=0;
        boolean flag=true;
        while(i<s.length()){
            char c=s.charAt(i);
            // update r & iif n1>=n0;
            if(n1>=n0){
                if(c=='1'){
                    n0++;
                }
                if(c=='0'){
                    n1++;
                    flag=false;
                }
                r++;
                i++;
            }
            // if n0>n1 means our current interval is not correct.
            else{
                l=r=i;
                n1=n0=0;
            }
            /*
                to include the current interval in our
                answer if current difference of 0's and 1's
                is more than diff equal to is avoided to
                get lexigraphically the smallest answer;
            */
            if(diff<(n1-n0)){
                ml=l;
                mr=r;
                // System.out.println(ml+" "+mr);
                diff=n1-n0;
            }
        }
        ArrayList<Integer> arr=new ArrayList<Integer>();
        if(flag)
            return arr;
        arr.add(ml+1);
        arr.add(mr);
        return arr;
    }
}
