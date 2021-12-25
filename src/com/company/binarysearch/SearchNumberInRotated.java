package com.company.binarysearch;

import java.util.Arrays;
import java.util.List;

public class SearchNumberInRotated {
    public static void main(String[] args) {
        System.out.println(new SearchNumberInRotated().search(Arrays.asList(new Integer[]{180, 181, 182, 183, 184, 187,
                188, 189, 191, 192, 193, 194, 195, 196, 201, 202, 203, 204, 3, 4, 5, 6, 7, 8, 9, 10, 14, 16,
                17, 18, 19, 23, 26, 27, 28, 29, 32, 33, 36, 37, 38, 39, 41, 42, 43, 45, 48, 51, 52, 53, 54, 56,
                62, 63, 64, 67, 69, 72, 73, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 96, 98, 99, 101, 102, 104,
                105, 106, 107, 108, 109, 111, 113, 115, 116, 118, 119, 120, 122, 123, 124, 126, 127, 129, 130, 135,
                137, 138, 139, 143, 144, 145, 147, 149, 152, 155, 156, 160, 162, 163, 164, 166, 168, 169, 170, 171, 172, 173,
                174, 175, 176, 177}), 42));
    }

    public int search(final List<Integer> a, int b) {
        int i=0;
        int j=a.size()-1;

        while(i<=j) {
            int mid = (i +j)/2;

            if(a.get(mid)==b)
                return mid;
            if(a.get(mid)>=a.get(i)) {
                if(b>=a.get(i)&&b<a.get(mid))
                    j=mid-1;
                else
                    i=mid+1;
            }
            else {
                if(b>a.get(mid)&&b<=a.get(j))
                    i=mid+1;
                else
                    j=mid-1;
            }
        }
        return -1;
        /*boolean isInfirstHalf = false;
        if (B > A.get(0)) {
            isInfirstHalf = true;
        }
        int pivotPoint = findPivotPoint(A);
        if (isInfirstHalf) {
            return findPosition(A.subList(0, pivotPoint), B);
        } else {
            int position = findPosition(A.subList(pivotPoint, A.size()), B);
            if (position != -1) {
                return position + pivotPoint;
            }else {
                return -1;
            }
        }*/
            /*    if (B > A.get(mid)) {
                    firstPosition = mid + 1;
                } else if (B < A.get(mid)) {
                    lastPosition = mid - 1;
                }
      */
    }

    public static int findPosition(List<Integer> A, int B) {
        int firstPosition = 0;
        int lastPosition = A.size() - 1;
        while (firstPosition <= lastPosition) {
            int mid = (firstPosition + lastPosition) / 2;
            if (A.get(mid) < B) {
                firstPosition = mid + 1;
            } else if (A.get(mid) > B) {
                lastPosition = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    int findPivotPoint(final List<Integer> A) {
        int firstPosition = 0;
        int lastPosition = A.size() - 1;
        while (firstPosition <= lastPosition) {
            int mid = (firstPosition + lastPosition) / 2;
            if (A.get(firstPosition) < A.get(lastPosition)) {
                return 0;
            }

            if (firstPosition == lastPosition) {
                return firstPosition + 1;
            }
            if (A.get(lastPosition) < A.get(mid)) {
                firstPosition = mid + 1;
                if (A.get(mid) > A.get(mid + 1)) {
                    return mid + 1;
                }
            } else if (A.get(firstPosition) > A.get(mid)) {
                lastPosition = mid - 1;
                if (A.get(mid) < A.get(mid - 1)) {
                    return mid;
                }

            }
        }
        return -1;
    }
}
