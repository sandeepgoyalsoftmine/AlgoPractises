package com.company.array;

import java.util.*;
import java.util.stream.Collectors;

public class InRange1to2 {
    public static void main(String[] args) {

    }

    //;Take two heaps max heap and min heap
    // if first three digit has in range return 1
    // else if its less than one (<1) remove smallest digit and add new digit remove top digit from min heap
    // else if (>1) remove highest number add new number and check it in range or not remove digit from max heap
    public int solve(ArrayList<String> A) {

        if (A.size() < 3)
            return 0;
        List<Double> input = A.stream().mapToDouble(num -> Double.parseDouble(num)).boxed().collect(Collectors.toList());
        PriorityQueue<Double> maxHeap = new PriorityQueue<Double>(input.size(), Collections.reverseOrder());
        PriorityQueue<Double> minHeap = new PriorityQueue<Double>(input.size());
        Double sum=0.0;
        for(int i=0; i<3; i++) {
            maxHeap.add(input.get(i));
            minHeap.add(input.get(i));
            sum += input.get(i);
        }
        if(1<sum && sum<2)
            return 1;
        for(int i=3; i<input.size(); i++) {
            if(sum<1)
                sum -= minHeap.poll();
            else
                sum -= maxHeap.poll();
            minHeap.add(input.get(i));
            maxHeap.add(input.get(i));
            sum +=  input.get(i);
            if(1<sum && sum<2)
                return 1;
        }
        return 0;
    }
}
