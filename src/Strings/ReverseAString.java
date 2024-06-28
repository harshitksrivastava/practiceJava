package src.Strings;

import java.util.Scanner;

public class ReverseAString {	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String input");
		String value = sc.next();
		String str = "";
		
//		Logic 1
//		for(int i=0;i<value.length();i++) {
//			str = value.charAt(i)+str;		
//		}
		
//		Logic 2
//		for(int i =value.length()-1;i>=0;i--) {
//			str+=value.charAt(i);
//		}
		
//		Logic 3 -> by converting string to char Array type
		char a [] = value.toCharArray();
		for(int i = a.length -1; i>=0;i--) {
			str+=a[i];
		}
		
//		StringBuffer & StringBuilder have inbuilt  methods to reverse a string
		
		System.out.println("Reverse of input string "+value+" is "+str);
	}
}
