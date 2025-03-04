package medium;

//There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
//
//You are giving candies to these children subjected to the following requirements:
//
//Each child must have at least one candy.
//Children with a higher rating get more candies than their neighbors.
//Return the minimum number of candies you need to have to distribute the candies to the children.
//


public class Candy_Destribution {
	
	public static int minCandyRequired(int[] ratings) {
		int n= ratings.length;
		int[] candies = new int[n];
		
//		each child will have at least 1 candy
		for(int i=0; i<candies.length; i++) {
			candies[i] = 1;
		}
		
//		now passing from left to right
		for(int i=1; i<ratings.length; i++){
			if(ratings[i]>ratings[i-1] ) {
				candies[i] = candies[i-1] + 1;
			}
		}
		
//		from right to left
		for(int i = n-2; i>=0; i--) {
			if(ratings[i]>ratings[i+1]) {
				candies[i] = Math.max(candies[i], candies[i+1] + 1);
			}
		}
		
//		now add total candies and return
		int totalMinCandy = 0;
		for(int i : candies) {
			totalMinCandy += i;
		}
		return totalMinCandy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,2};
		int output = minCandyRequired(arr);
		System.out.println(output);
	}

}
 