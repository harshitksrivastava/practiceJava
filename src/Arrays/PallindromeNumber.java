package src.Arrays;

public class PallindromeNumber {
	
	    public boolean isPalindrome(int x) {
	        if(x<0)
	            return false;
	        int result = 0;
	        int temp = 0;
	        int copy = x;
	        while(copy!=0){
	            temp = copy%10;
	            result=result*10+temp;
	            copy/=10;
	        }
	        System.out.println(result);
	        if(result==x)
	            return true;
	        else
	            return false;
	    }
	    
	    public static void main(String args[]) {
	    	PallindromeNumber isp = new PallindromeNumber();
	    	
	    	boolean result = isp.isPalindrome(121);
	    }
	}

