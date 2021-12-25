package com.company.math;

public class TotalNoOFMove {
    public int solve(int A, int B) {
        return (Math.min(A,B)-1)+(Math.min(A,9-B)-1) +(8-Math.max(A,9-B))+(8-Math.max(A,B));
    }
}
