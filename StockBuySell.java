package medium;

//    Stock Buy and Sell – Multiple Transaction Allowed

//	  Given an array prices[] of size n denoting the cost of stock on each day, the task is to     find the maximum total profit if we can buy and sell the stocks any number of times.
//
//    Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.

public class StockBuySell {

//	Following greedy approach
	public static int maxTotalProfit(int[] prices) {
		int profit = 0;
		for(int i=1; i<prices.length; i++) {
			if(prices[i] > prices[i-1]) {
				profit += prices[i] - prices[i-1];
			}
		}
		return profit;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7, 1, 5, 3, 6, 4};
		System.out.println(maxTotalProfit(prices));
	}

}
