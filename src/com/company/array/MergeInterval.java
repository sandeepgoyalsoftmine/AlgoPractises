package com.company.array;


import java.util.ArrayList;

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}


public class MergeInterval {
    /*    Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].

        Example 2:

        Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].

        This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].*/
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> newIntervals = new ArrayList<>();
        if (newInterval.end < newInterval.start) {
            int temp = newInterval.end;
            newInterval.end = newInterval.start;
            newInterval.start = temp;
        }
        boolean found = false;
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (found) {
                newIntervals.add(interval);
            } else {
                if (checkLeft(newInterval, interval)) {
                    newIntervals.add(newInterval);
                    newIntervals.add(interval);
                    found = true;

                } else if (checkRight(newInterval, interval)) {
                    newIntervals.add(interval);

                } else if (checkInbetween(newInterval, interval)) {
                    newIntervals.add(interval);
                    found = true;
                }else if(checkInbetween(interval,newInterval)) {

                } else{
                    if (interval.start > newInterval.start) {
                        interval.start = newInterval.start;
                    }

                    found = true;
                    Interval newIntervall = null;
                    while (i < intervals.size() && (newIntervall == null ||  newInterval.end >  newIntervall.end )) {
                        newIntervall = intervals.get(i);
                        i++;
                    }
                    i--;
                    if(newInterval.end < newIntervall.start) {
                        interval.end = newInterval.end;
                        newIntervals.add(interval);
                        newIntervals.add(newIntervall);
                    }else if(newInterval.end > newIntervall.end) {
                        interval.end = newInterval.end;
                        newIntervals.add(interval);
                    }else {
                        interval.end = newIntervall.end;
                        newIntervals.add(interval);
                    }

                }
            }

        }
        if(!found) {
            newIntervals.add(newInterval);
        }
        return newIntervals;
    }

    boolean checkLeft(Interval newInterval, Interval interval) {
        if (newInterval.end < interval.start) {
            return true;
        }
        return false;
    }

    boolean checkRight(Interval newInterval, Interval interval) {
        if (interval.end < newInterval.start) {
            return true;
        }
        return false;
    }

    boolean checkInbetween(Interval newInterval, Interval interval) {
        if (interval.start < newInterval.start && newInterval.end < interval.end) {
            return true;
        }
        return false;
    }
}
