package src.Arrays;

import java.util.Arrays;

//LeetCode Question Number: 238 -> Medium
public class ProductArrayExceptSelf {

//	Complexities:
//	time: O(n)
//	space: O(n)
	public int[] productExceptSelf(int[] nums) {
        int output [] = new int[nums.length];
        int t =1;
        // output[0]=1;
        for(int i=0;i<nums.length;i++){
            // output[i]=output[i-1]*nums[i-1];
            output[i]=t;
            t*=nums[i];
        }
        t=1;
    for(int i=nums.length -1;i>-1;i--){
            output[i]*=t;
            t*=nums[i];
        }
    return output;
		
//		this can calculate above operation in one go.. but will take 3 ms more to execute
//		int n= nums.length;
//        int output [] = new int[n];
//        int prefix =1;
//        int suffix =1;
//        Arrays.fill(output,1);
//        // output[0]=1;
//
//        for(int i=0;i<n;i++){
//            // output[i]=output[i-1]*nums[i-1];
//            output[i]*=prefix;
//            prefix*=nums[i];
//            output[n-i-1]*=suffix;
//            suffix*=nums[n-i-1];
//    }
//        return output;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductArrayExceptSelf productArrayExceptSelf = new ProductArrayExceptSelf();

		int op [] =productArrayExceptSelf.productExceptSelf(new int[] {1,2,3,4});
	System.out.println(Arrays.toString(op));
	} 
}