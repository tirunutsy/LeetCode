package medium;

// Find Maximum and Minimum value in a Segment or Array

public class MaxMinInArray {
	
	public static void findMinMax(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		System.out.println("Min Value : "+min+" | Max Value : "+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 7, -5, 24, 0, 34, -2};
		findMinMax(arr);
	}

}
