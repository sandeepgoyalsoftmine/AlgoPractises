package com.company.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
A : [1 5 6 7 8 9 ]
B : [2 3 4]

-50 -50 -41 -40 -21 -19 -10 5 21 28
* */
public class MedianOfArray {
    public static void main(String[] args) {
        System.out.println("args = " + new MedianOfArray().findMedianSortedArrays(
                Arrays.asList(-50, -41, -40, -19, 5, 21, 28),Arrays.asList( -50, -21, -10)));
    }
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        if(a.size()>b.size()) return findMedianSortedArrays(b, a);

        int x = a.size();
        int y = b.size();

        int low = 0; int high = x;

        while(low<=high){
            int partitionX = (low+high)/2;
            int partitionY = (x+y+1)/2-partitionX;

            int leftMaxX = (partitionX==0)? Integer.MIN_VALUE: a.get(partitionX-1);
            int leftMaxY = (partitionY==0)? Integer.MIN_VALUE:b.get(partitionY-1);

            int rightMinX = (partitionX==x)? Integer.MAX_VALUE:a.get(partitionX);
            int rightMinY = (partitionY==y)? Integer.MAX_VALUE:b.get(partitionY);

            if((leftMaxX<=rightMinY)&& (leftMaxY<=rightMinX)){
                if((x+y)%2==0){
                    return ((double)Math.max(leftMaxX,leftMaxY)+Math.min(rightMinX, rightMinY))/2;
                }else{
                    return ((double)Math.max(leftMaxX, leftMaxY));
                }
            }else if(leftMaxX>rightMinY) {
                high = partitionX-1;

            }
            else low = partitionX+1;
        }
        return -1;
/*
       if(a.size() ==0) {
           return findMedian(b);
       }else if(b.size() == 0) {
           return findMedian(a);
       }
       if(a.size() ==1 && b.size() ==1) {
           return ((double) (a.get(0)+ b.get(0)))/2d;
       }
       boolean isFirstSmaller = a.size()<b.size();
       double firstMedian = findMedian(a);
       double secondMedian = findMedian(b);

       if(firstMedian == secondMedian) {
           return firstMedian;
       }
        if(firstMedian<secondMedian) {
            if(isFirstSmaller) {
                if(a.size() == 1) {
                    return findMedianSortedArrays(new ArrayList<>(),b.subList(0,b.size()-1));
                }
                return findMedianSortedArrays(a.subList(a.size()/2,a.size()),b.subList(0,b.size()-(a.size()/2)));
            }else {
                if(b.size() == 1) {
                    return findMedianSortedArrays(a.subList(1,a.size()), new ArrayList<>());
                }
                return findMedianSortedArrays(a.subList((b.size() / 2),a.size()),b.subList(0,b.size()-b.size()/2));
            }
        }else {
            if(isFirstSmaller) {
                if(a.size() == 1) {
                    return findMedianSortedArrays(new ArrayList<>(),b.subList(1,b.size()));
                }
                return findMedianSortedArrays(a.subList(0,a.size()/2),b.subList(a.size()/2,b.size()));
            }else {
                if(b.size() == 1) {
                    return findMedianSortedArrays(a.subList(0,a.size()-1), new ArrayList<>());
                }
                return findMedianSortedArrays(a.subList(0,a.size()-(b.size()/2)),b.subList(b.size()/2,b.size()));
            }
        }*/
    }
    double findMedian(List<Integer> a) {
        if(a.size() == 1) {
            return a.get(0);
        }
        boolean isEven = ((a.size())%2 ==0);
        if(isEven) {
            return ((double) (a.get(a.size()/2-1)+ a.get(a.size()/2)))/2d;
        }else {
            return a.get(a.size()/2);
        }
    }
    public  int findPosition(List<Integer> A, int B) {
        int firstPosition =0;
        int lastPosition = A.size()-1;
        while(firstPosition<=lastPosition) {
            int mid = (firstPosition+lastPosition)/2;
            if(A.get(mid) < B) {
                firstPosition = mid+1;
            }else if(A.get(mid)>B) {
                lastPosition = mid-1;
            }else  {
                return mid;
            }
        }
        return firstPosition;
    }
}
