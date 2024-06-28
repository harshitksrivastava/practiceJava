package src.DynamicProgramming;

//LeetCode Question Number: 53-> Medium
public class MaximumSubarray {
	
//	Complexities: 
//		time: O(N)
//		space: O(N)
	public int maxSubArrayDP(int [] nums) {
		// dynamic programming style: 
        int dp [] = new int [nums.length];
        dp[0]=nums[0];
        int maximum =nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            if(dp[i]>maximum)
                maximum=dp[i];
        }
        return maximum;
	}
	
//	Complexities: 
//	time: O(N)
//	space: O(1)
	public int maxSubArray(int [] nums) {
		int max_so_far = nums[0];
		int maximum  = nums[0];
		for(int i=1;i<nums.length;i++) {
			max_so_far= Math.max(max_so_far+nums[i],nums[i]);
			maximum = Math.max(maximum, max_so_far);
		}
		
		return maximum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSubarray maximumSubarray = new MaximumSubarray();
		int max = maximumSubarray.maxSubArrayDP(new int [] {-2,1,-3,4,-1,2,1,-5,4});
		int max1 = maximumSubarray.maxSubArray(new int [] {-2,1,-3,4,-1,2,1,-5,4});
		
	}

}
