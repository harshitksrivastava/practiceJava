package src.DynamicProgramming;

import java.util.ArrayList;

// LeetCode Question Number: 198 -> Medium
public class HouseRobber {
	
//	Complexities:
//		time: O(n)
//		space: O(n)
	
	public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        ArrayList <Integer> dp = new ArrayList<Integer>();
        dp.add(nums[0]);
        dp.add(Math.max(nums[0],nums[1]));
        for(int i=2;i<nums.length;i++){
            dp.add(Math.max(nums[i]+dp.get(i-2),dp.get(i-1)));
        }

        return dp.get(dp.size()-1);

    }
}

//NOTE: we can not rob two adjacent house
//input -> nums = [1,2,3,1]
//             dp [1,2,4,4]
//				1-> is copied from the initial position;
//				2-> max(1,2) -> 2
//				4-> max(3+1, 2{values from dp[i-1]}) -> 4 
//				4-> max(1+2, 4) -> 4
//	hence the value obtained on the final position is the answer.