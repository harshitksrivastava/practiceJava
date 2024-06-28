package src.DynamicProgramming;

//LeetCode Question Number: 152 -> Medium
import src.Arrays.ProductArrayExceptSelf;

public class MaximumProductSubarray {
	
//	Complexities:
//		time: O(n)
//		space: O(1)
	public int maxProduct(int[] nums) {
        int n = nums.length;
        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            // if arrays contains zero we restart by putting prefix/suffix to 1
            if(prefix==0)
                prefix=1;
            if(suffix==0)
                suffix=1;
            
            // we calculate prefix
            prefix*= nums[i];

            // we calculate suffix
            suffix*= nums[n-i-1];

            // and store the maximum number found
            ans = Math.max(ans,Math.max(prefix,suffix));

        }

        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumProductSubarray  maximumProductSubarray= new MaximumProductSubarray();

		int op =maximumProductSubarray.maxProduct(new int[] {1,2,-3,4});
	System.out.println(op);
	} 
}
