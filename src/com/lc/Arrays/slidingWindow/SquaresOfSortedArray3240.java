package com.lc.Arrays.slidingWindow;

import java.util.Arrays;

public class SquaresOfSortedArray3240 {
	public  int[] sortedSquares(int[] nums) {
        // create a new output
        int n = nums.length; 
        int result[] = new int[n]; // capacity n = length
        int right = n-1, left = 0;
        for(int i= n-1; i >=0 ; i--) {
            int square;
            //IMP
             if (Math.abs(nums[left]) < Math.abs(nums[right])) { 
                 square = nums[right];
                 right--;
             } else {
                 square = nums[left];
                 left++;
             }
             result[i] = square * square;
        }
        return result;
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-4,-1,0,3,10};
		SquaresOfSortedArray3240 obj = new SquaresOfSortedArray3240();
		System.out.print(Arrays.toString(obj.sortedSquares(nums)));
	}

}
