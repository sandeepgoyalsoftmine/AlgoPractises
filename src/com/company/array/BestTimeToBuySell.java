package com.company.array;

public class BestTimeToBuySell {

    public static void main(String[] args) {
	// write your code here
        int [] array = {7,6,4,3,1};
        System.out.print(new Solution1().maxProfit(array));
    }
}


class Solution1 {
    enum State {BUY,SALE}
    public int maxProfit(int[] prices) {
        int profit = 0;
        State state = State.BUY;
        int buy = 0;
        int i =0;
        while(i!=-1) {
            if (state == State.BUY) {
                i = getNextBuy(prices, i);
                if (i == -1)
                    break;
                buy = prices[i];
                state = State.SALE;
            }
            else {
                i = getNextSale(prices, i);
                if (i == -1)
                    break;
                profit += prices[i] - buy;
                state = State.BUY;
            }
            i++;

        }

        return profit;
    }

    public int getNextBuy(int[] prices,int startPosition) {
        int lastposition = startPosition;
        for(int i = startPosition+1;i< prices.length;i++) {
            if (prices[lastposition]< prices[i]){
                return lastposition;
            }
            lastposition = i;
        }
        return -1;
    }
    public int getNextSale(int[] prices,int startPosition) {
        int lastposition = startPosition;
        for(int i = startPosition+1;i< prices.length;i++) {
            if (prices[lastposition]> prices[i]){
                return lastposition;
            }
            lastposition = i;
        }
        return lastposition;
    }
}