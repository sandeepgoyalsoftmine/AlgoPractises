package com.company.math;

import java.util.HashMap;

public class RectangleSides {
    public int solve(int A, int B, int C, int D) {
        if(A==B && C==D) {
            return 1;
        }else if(A==C && B==D) {
            return 1;
        }else if(A==D && C==B) {
            return 1;
        }
        return 0;
    }
}
