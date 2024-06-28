package src.Arrays;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
	public int [] twoSum(int nums [], int target) {
		HashMap<Integer,Integer> diff = new HashMap<>();
		int differenceN = 0;
		for(int i=0;i<nums.length;i++) {
			differenceN = target-nums[i];
			if(diff.containsKey(differenceN))
				return new int[] {i,diff.get(differenceN)};
			else
			diff.put(nums[i], i);
		}
		return null;
	}
}
