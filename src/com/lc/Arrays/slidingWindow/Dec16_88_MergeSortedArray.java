package com.lc.Arrays.slidingWindow;

import java.util.Arrays;

// Date_num_Description
public class Dec16_88_MergeSortedArray {
	public int[] easyMerge(int[] nums1, int m, int[] nums2, int n) {
        // a) 7 to 15 length of m
        int m_length = nums1.length;

        // add the num2 remaining n elements to nums1
        int pos_nums2 = 0;
        for(int pos_nums1 = m_length-n ; pos_nums1 < m_length ; pos_nums1++) {
            nums1[pos_nums1] = nums2[pos_nums2];
            pos_nums2++;
        }
        
        for (int i =0 ; i <n ; i++) {
        	nums1[m+i] = nums2[i];
        }
        
        System.out.println(Arrays.toString(nums1) + "before sort");
        Arrays.sort(nums1);
        return nums1;
    }
	public int[] bestApproach(int[] nums1, int m, int[] nums2, int n) {
		int r1 = m -1;
		int r2 = n -1;
		for(int w= nums1.length-1; w >=0 ; w--) {
			
			if(r1>=0 && r2 >=0) {
				nums1[w] = nums1[r1] > nums2[r2] ? nums1[r1--]: nums2[r2--];
			} else if (r1>=0) {
				nums1[w] = nums1[r1--];
			} else {
				nums1[w] = nums2[r2--];
			}
			 
					
		}
		return nums1;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int nums1[] = {1, 2, 3, 0, 0, 0};
		int nums2[] = {1, 2, 3};
		int m = 3;
	    int n = 3;
//		Dec16MergeSortedArray obj = new Dec16MergeSortedArray();
//		System.out.print(Arrays.toString(obj.easyMerge(nums1, m , nums2, n)));
		
	    Dec16_88_MergeSortedArray obj1 = new Dec16_88_MergeSortedArray();
		System.out.print(Arrays.toString(obj1.bestApproach(nums1, m , nums2, n)));

	}

}
