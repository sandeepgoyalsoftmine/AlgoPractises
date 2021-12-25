package com.company.binarysearch;

import java.util.*;

public class SimpleQueries {
    /*public static void main(String[] args) {
        System.out.println(new SimpleQueries().solve(Arrays.asList(39, 99, 70, 24, 49, 13, 86, 43, 88, 74, 45, 92, 72, 71, 90, 32, 19, 76, 84, 46, 63, 15, 87, 1, 39, 58, 17, 65, 99, 43, 83, 29, 64, 67, 100, 14, 17, 100, 81, 26, 45, 40, 95, 94, 86, 2, 89, 57, 52, 91, 45),
                Arrays.asList(1221, 360, 459, 651, 958, 584, 345, 181, 536, 116, 1310, 403, 669, 1044, 1281, 711, 222, 280, 1255, 257, 811, 409, 698, 74, 838 )));
    }
    public ArrayList<Integer> solve(List<Integer> A, List<Integer> B) {
        ArrayList<Integer> G  = generateG(A);
        ArrayList<Integer> A1  = new ArrayList<>();
        G= divisorMultiplier(G);
        Collections.sort(G,Collections.reverseOrder());
        for(Integer integer:B) {
            A1.add(G.get(integer-1));
        }
        return A1;
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        return solve((List)(A),(List)B);
    }

    ArrayList<Integer> generateG(List<Integer> A) {
        ArrayList<Integer> G = new ArrayList<>();
        for(int j =0;j<A.size();j++) {
            int max = Integer.MIN_VALUE;
            for (int i = j; i < A.size(); i++) {
                max = Math.max(max, A.get(i));
                G.add(max);
            }
        }
        return G;
    }
    ArrayList<Integer> divisorMultiplier(List<Integer> list) {
        ArrayList<Integer> G = new ArrayList<>();
        HashMap<Integer,Integer> multiplierMapping = new HashMap<>();
        for(Integer integer:list) {
            if(multiplierMapping.get(integer) == null) {
                int multiplier = getDivisor(integer);
                G.add(multiplier);
                multiplierMapping.put(integer,multiplier);
            }else {
                G.add(multiplierMapping.get(integer));
            }
        }
        return G;
    }
    int getDivisor(int integer) {
        int multiplier = 1;
        for(int i =1;i<=integer/2;i++) {
            if(integer%i==0) {
                multiplier *= i%(1e9 + 7);
            }
        }
        multiplier*=integer%(1e9 + 7);
        return multiplier;
    }*/


    public ArrayList<Integer> solve(ArrayList<Integer> as, ArrayList<Integer> qs) {
        int n = as.size();
        Stack<Integer> st = new Stack<Integer>();
        int[] left = new int[n];
        for (int i = 0; i < n; ++i) {
            while (!st.isEmpty() && as.get(st.peek()) < as.get(i)) st.pop();
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st = new Stack<Integer>();
        int[] right = new int[n];
        for (int i = n - 1; i >= 0; --i) {
            while (!st.isEmpty() && as.get(st.peek()) <= as.get(i)) st.pop();
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        Map<Integer, Integer> prod = new HashMap<Integer, Integer>();
        List<int[]> counts = new ArrayList<int[]>();
        for (int i = 0; i < n; ++i) {
            int cnt = (i - left[i]) * (right[i] - i);
            int a = as.get(i);
            Integer pr = prod.get(a);
            if (pr == null) {
                pr = toProd(a);
                prod.put(a, pr);
            }
            counts.add(new int[]{pr, cnt});
        }
        Collections.sort(counts, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        int[] vals = new int[n];
        long[] bounds = new long[n];
        for (int i = 0; i < n; ++i) {
            int[] c = counts.get(i);
            vals[i] = c[0];
            bounds[i] = c[1];
            if (i > 0) bounds[i] += bounds[i - 1];
            if (bounds[i] > Integer.MAX_VALUE * 2L) bounds[i] = Integer.MAX_VALUE * 2L;
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int q : qs) {
            int pos = Arrays.binarySearch(bounds, q);
            if (pos < 0) {
                pos = -1 - pos;
            }
            res.add(vals[pos]);
        }
        return res;
    }

    private final static long b = (long) (1e9 + 7);

    private int toProd(int a) {
        long res = a;
        for (int d = 2; d * d <= a; ++d) {
            if (a % d != 0) continue;
            int m = (d * d == a) ? d : a;
            res = (res * m) % b;
        }
        return (int) res;
    }
}

