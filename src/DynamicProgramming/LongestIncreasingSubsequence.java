package src.DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;

// LeetCode Question Number: 300-> Medium
public class LongestIncreasingSubsequence {
	
//	without using binary search intuition
//  [10,9,2,5,3,7,101,18]
//dp[ 1,1,1,2,2,3, 4 ,3]
//  [2,3,7,101]
//	complexities:
//		time: O(n^2)
//		space: O(n)
	public int lengthOfLIS(int [] nums) {
		if(nums.length==0) 
			return 0;
		int dp[] = new int[nums.length];
		int maxi =0;
		for(int i=0;i<nums.length;i++) {
			int max=0;
			for(int j=0;j<=i;j++) {
				if(i==j)
					dp[i]=max+1;
				if(nums[i]>nums[j])
					max=Math.max(max, dp[j]);
				
			}
			maxi=Math.max(maxi,dp[i]);
		}
		return maxi ;
	}
	
//	using binary search intuition
//	complexities:
//		time: O(n log n)
//		space: O(n)
//	public int lengthofLISBinarySearch(int [] nums) {
//		if(nums.length ==0)
//			return 0;
//		ArrayList<Integer> dp = new ArrayList<Integer>();
//		int sizeDp = 0;
//		for(int i=0;i<nums.length;i++) {
//			if(sizeDp ==0 || nums[i]>dp.get(sizeDp-1)) {
//				dp.add(nums[i]);
//				sizeDp++;
//			}
//			else {
//				int start=0;
//				int end = sizeDp;
//				int mid = 0;
//				while(start<=end) {
//					 mid = (start+end)/2;
//					if(dp.get(mid)==nums[i])
//						break;
//					else if(dp.get(mid)>nums[i])
//						end=mid-1;
//					else
//						start=mid+1;
//				}
//				if(end<start) {
//					dp.set(start,nums[i]);
//				}
//			}
//		}
//		return sizeDp;
//	}
	
	
//	using in built function for binary search
//  same complexities as above
	public int lengthofLISInbuilt(int [] nums) {
		if(nums.length==0)
	        return 0;
	    ArrayList<Integer> dp = new ArrayList<Integer>();
	    
	    for(int i=0;i<nums.length;i++){
	        int index = Collections.binarySearch(dp,nums[i]);
	        // - insertionPoint - 1

	        if(index<0){
	            index = (-1)*(index+1);
	        }
	        if(index==dp.size())
	            dp.add(nums[i]);
	        else
	            dp.set(index,nums[i]);
	        

	    }
	            return dp.size();

	}
}


