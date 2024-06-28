package src.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoArray {

    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> dup = new HashSet();
    	
        Set<Integer> dup = new HashSet<Integer>();
        boolean contains_dup = false;
        
        
        
        for(int n : nums) {
        	if(dup.contains(n)) {
        		contains_dup = true;
        		break;
        	}
        	dup.add(n);
        }
        return contains_dup;

//        for(int n : nums){
//            dup.add(n);
//        }
//        System.out.println(dup.size());
//        System.out.println(nums.length);
        
//    	Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

//        if(set.size()==nums.length)
//            return false;
//        else
//            return true;
    }
    
    public static void main(String args[]) {
    	DemoArray demoArray = new DemoArray();
    	Boolean d = demoArray.containsDuplicate(new int [] {1,2,3,4});
    	System.out.println(d);
    }
}
