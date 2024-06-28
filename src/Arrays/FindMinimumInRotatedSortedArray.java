package src.Arrays;

import java.util.Arrays;

//LeetCode Question Number: 238 -> Medium
public class FindMinimumInRotatedSortedArray {

//	Complexities:
//		time: O(log N)
//		space: O(1)	
	
	public int findMin(int[] nums) {
		int i, mid, low = 0, high = nums.length - 1;
		int mini = Integer.MAX_VALUE;
		while (low <= high) {
			mid = (low + high) / 2;
			if (nums[mid] >= nums[low]) {
				mini = Math.min(mini, nums[low]);
				low = mid + 1;
			} else {
				mini = Math.min(mini, nums[mid]);
				high = mid - 1;
			}
		}
		return mini;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();

		int op  =findMinimumInRotatedSortedArray.findMin(new int[] {3,4,5,1,2});
	System.out.println(op);
	} 
}
