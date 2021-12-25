package com.company.array;

import java.util.ArrayList;
import java.util.HashMap;

public class InfiniteGrid {
    public static void main(String[] args) {
        InfiniteGrid infiniteGrid = new InfiniteGrid();
        ArrayList<Integer> a = new ArrayList();
        a.add(0);
        a.add(1);
        a.add(1);
        ArrayList<Integer> b = new ArrayList();
        b.add(0);
        b.add(1);
        b.add(2);
        System.out.println(infiniteGrid.coverPoints(a, b));
    }

    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0;

        for (int i = 0; i < A.size() - 1; i++) {
            int x = A.get(i + 1) - A.get(i);
            int y = B.get(i+1) - B.get(i);
            count += Math.abs(Math.max(x,y));
        }
        return count;
    }

    public int shortestLength(int startX, int startY, int endX, int endY) {
        int length = 0;
        HashMap<Integer, HashMap<Integer, Integer>> tracker = new HashMap();
        ArrayList<Integer> queue = new ArrayList<>();
        saveToTracker(queue, tracker, startX, startY, length,endX,endY);
        while (!queue.isEmpty()) {
            startX = queue.remove(0);
            startY = queue.remove(0);
            length = tracker.get(startX).get(startY);
            if (startX == endX && startY == endY) {
                return length;
            }
            length++;
            saveToTracker(queue, tracker, startX - 1, startY, length,endX,endY);
            saveToTracker(queue, tracker, startX, startY - 1, length,endX,endY);
            saveToTracker(queue, tracker, startX + 1, startY, length,endX,endY);
            saveToTracker(queue, tracker, startX, startY + 1, length,endX,endY);
            saveToTracker(queue, tracker, startX - 1, startY - 1, length,endX,endY);
            saveToTracker(queue, tracker, startX + 1, startY + 1, length,endX,endY);
            saveToTracker(queue, tracker, startX - 1, startY + 1, length,endX,endY);
            saveToTracker(queue, tracker, startX + 1, startY - 1, length,endX,endY);
        }
        return 0;
    }

    public boolean valid(int a1, int a2,int endx,int endy) {
        if(endx<0) {
            return !(a1<endx);
        }
        if (endy < 0) {
            return !(a2<endy);
        }
        return a1<=endx && a2<=endy;
    }

    public void saveToTracker(ArrayList<Integer> queue, HashMap<Integer, HashMap<Integer, Integer>> tracker, int x, int y, Integer length,int endx,int endy) {
        if (valid(x, y,endx,endy)) {
            if (tracker.get(x) == null) {
                queue.add(x);
                queue.add(y);
                HashMap<Integer, Integer> yposition = new HashMap<>();
                yposition.put(y, length);
                tracker.put(x, yposition);
            } else {
                if (tracker.get(x).get(y) == null || tracker.get(x).get(y) > length) {
                    if(tracker.get(x).get(y) == null) {
                        queue.add(x);
                        queue.add(y);
                    }
                    tracker.get(x).put(y, length);
                }
            }
        }
    }
}
