package src.Searching;

public class LinearSearch {
	
	int linearSearch(int [] nums, int target) {
		
		for(int i=0;i<nums.length;i++) {
			if(target==nums[i])
					return i;
		}
		return -1;
	}
}
