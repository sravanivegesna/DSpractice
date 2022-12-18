package com.lc.Arrays.slidingWindow;

import java.util.Arrays;
import java.util.Iterator;

public class DuplicateZeros1089 {
	
	public int[] duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length_ = arr.length - 1;
        
		// find possible number of zeros
		for (int i = 0; i <= length_ - possibleDups; i++) {
			if (arr[i] == 0) {
				// example [0, 1, 0, 3, 0 , 4, 0] 4 position only duplcate zero should skip
				// edge case if length_-possibleDups is zero don't want to replace twice bcz out
				// index
				if (i == length_ - possibleDups) {
					arr[length_] = 0;
					length_--;
					break;
				}
				possibleDups++;
			}
		}
		
		// insert the duplicate zero to the array
		// where to start last
		
		int last = length_ - possibleDups;
		
		for (int start = last; start >=0 ; start--) {
			
			// if start element is zero 
			if (arr[start] == 0) {
				// insert duplicate
				// where the current pointer from last 
				arr[start+possibleDups] =0;
				possibleDups--;
				// before pointer from last
				arr[start+possibleDups] =0;
			} else {
				// only insert the non zero value to the last
				arr[start+possibleDups] = arr[start];
			}
		}
		return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,0,2,3,0,4,5,0};
		DuplicateZeros1089 obj = new DuplicateZeros1089();
		System.out.print(Arrays.toString(obj.duplicateZeros(nums)));

	}

}
