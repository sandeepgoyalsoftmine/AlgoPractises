package com.company.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PainterProblem {
    public static void main(String[] args) {
        System.out.println("args = " + new PainterProblem().paint(3,10,Arrays.asList(new Integer[]{640, 435, 647, 352, 8, 90, 960, 329, 859 })));
    }
    public int paint(int A,int B,ArrayList<Integer> C) {
        return paint(A,B,(List)C);
    }
        public int paint(int A, int B, List<Integer> C) {
            long total = 0, max = Long.MIN_VALUE;
            for(Integer c : C){
                total += c;
                max = Math.max(max,c);
            }
            long l = max, h = total;
            while(l<h){
                long mid = (l + (h-l)/2);
                long reqPainters = getRequiredPainters(C,mid);
                if(reqPainters <= A) h = mid;
                else l = mid + 1;
            }
            long ans = ((l%10000003)*(B%10000003))%10000003;
            return (int)ans;
        }
        public long getRequiredPainters(List<Integer> A , long k){
            long total = 0, reqPainters = 1;
            for(Integer a : A){
                total += a;
                if(total > k){
                    total = a;
                    reqPainters++;
                }
            }
            return reqPainters;
        }
}
