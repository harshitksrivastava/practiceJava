package src.Arrays;

import java.util.HashMap;

public class RomanToInteger {
	
	public int romanToInt(String s) {
		HashMap<Character, Integer> romanToIntegerMap = new HashMap<>();
		int result = 0;
		romanToIntegerMap.put('I', 1);
		romanToIntegerMap.put('V', 5);
		romanToIntegerMap.put('X', 10);
		romanToIntegerMap.put('L', 50);
		romanToIntegerMap.put('C', 100);
		romanToIntegerMap.put('D', 500);
		romanToIntegerMap.put('M', 1000);
	
		for(int i=0;i<=s.length()-2;i++) {
			int value = romanToIntegerMap.get(s.charAt(i));
			int nextValue = romanToIntegerMap.get(s.charAt(i+1));
			if(value<nextValue)
				result-= value;
			result+=value;
		}
		
		return result+romanToIntegerMap.get(s.charAt(s.length()-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanToInteger romanToInteger = new RomanToInteger();
		int result = romanToInteger.romanToInt("LVIII");
		
		System.out.println(result);
	}

}
