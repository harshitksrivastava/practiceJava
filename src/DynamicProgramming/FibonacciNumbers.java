package src.DynamicProgramming;

public class FibonacciNumbers {
	static int memo [];
//	recursive approach
//	complexity 
//		time: exponential -> 2^n;
//		space: O(n) -> for the depth of the tree formed
	public int fibRecursive(int n) {
		if(n<=1) {
			return n;
		}
		return fibRecursive(n-1)+fibRecursive(n-2);
	}
	
//	iterative approach
//	a=1, b=1,  initial values
//	this is for loop from 2 <= n
//	c=a+b; 
//	a= b; b=c;	updating values
//	returning b at the end.
	
	
//	Dynamic approach
//	top down approach using memoization follows recursive 
//	Complexities:
//		time: O(n)
//		space: O(n)
	public int fibDynamicTD(int n) {
		if(n<=1)
			return n;
		
		else {
			if(memo[n]!=0) 
				return memo[n];
			memo[n]= fibDynamicTD(n-1)+fibDynamicTD(n-2);
			return memo[n];
		}
		
	}
	
//	Dynamic approach
//	bottom up approach using memoization, but non-recursive
//	Complexities:
//		time: O(n)
//		space: O(n)
	public int fibDynamicBU(int n) {
		int fib [] = new int[n+2];
		if(n<=1)
			return n;
		else {
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<=n;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		}
		return fib[n];
	}
	
	public static void main(String args[]) {
		FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
		int a = fibonacciNumbers.fibRecursive(0);		//0 1 1 2 3 5 8
		System.out.println(a);
		
//		 this memo array is shared throughout the program 
//		 so that a new instance is not created oon every recursive call 
		int n = 10;
		memo = new int[n+2];
		a = fibonacciNumbers.fibDynamicTD(n);		//0 1 1 2 3 5 8
		System.out.println(a);
		
		a = fibonacciNumbers.fibDynamicBU(0);		//0 1 1 2 3 5 8
		System.out.println(a);

	}
}

