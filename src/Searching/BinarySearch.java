package src.Searching;

public class BinarySearch {
	
	int binarySearch(int [] nums,int target) {
		
		int start = 0;
		int end = nums.length-1;
		int mid = 0;
		while(start<=end) {
			mid = start+(end-start)/2;
			if(nums[mid]==target)
				return mid;
			else if(nums[mid]>target)
				end = mid-1;
			else
				start=mid+1;
		}		
		
		
//		element does not exist if execution reaches here 
		return -1;
	}
	
	public static void main(String args[]) {
		int nums []= {2,3,4,5,6,7,8,9};
		BinarySearch bSearch = new BinarySearch();
		int index = bSearch.binarySearch(nums, 7);
		System.out.println("index "+index);
	}
}
