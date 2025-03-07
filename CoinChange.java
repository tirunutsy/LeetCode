package medium;

//You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
//
//Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
//
//You may assume that you have an infinite number of each kind of coin.
//
// 
//
//Example 1:
//
//Input: coins = [1,2,5], amount = 11
//Output: 3
//Explanation: 11 = 5 + 5 + 1
//Example 2:
//
//Input: coins = [2], amount = 3
//Output: -1
//Example 3:
//
//Input: coins = [1], amount = 0
//Output: 0


import java.util.Arrays;

public class CoinChange {
	
	public static int coin_Change(int[] coins, int amount) {
//		if amount is 0
		if(amount == 0) {
			return 0;
		}
//		create dp array
		int[] dp = new int[amount+1];
		Arrays.fill(dp, amount+1);
		dp[0] = 0; //because we can match 0 best with 0
		for(int i=1; i<=amount; i++) {
			for(int coin : coins) {
				if(coin <= i) {
					dp[i] = Math.min(dp[i], dp[i-coin]+1);
				}
			}
		}
		return dp[amount]>amount ? -1 : dp[amount];
	}
	
	public static void main(String[] args) {
		int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coin_Change(coins, amount));
	}
}
