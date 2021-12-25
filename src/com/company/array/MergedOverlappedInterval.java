package com.company.array;

import java.util.ArrayList;
import java.util.Collections;

public class MergedOverlappedInterval {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals,(o1, o2) ->  o2.start-o1.start);
        ArrayList<Interval> newIntervals = new ArrayList<>();
        Interval first_interval = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            if(first_interval.end>intervals.get(i).start) {
                if(intervals.get(i).end > first_interval.end)
                    first_interval.end = intervals.get(i).end;
            }else {
                newIntervals.add(first_interval);
                first_interval = intervals.get(i);
            }
        }
        return newIntervals;
    }
}
