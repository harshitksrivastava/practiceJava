package src.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
	List<List<String>> groupAnagrams(String [] strs){
		List<List<String>> anagrams = new ArrayList<List<String>>();
		for(String s: strs) {
			List<String> temp = new ArrayList<String>();
			if(anagrams.isEmpty()) {
				temp.add(s);
				anagrams.add(temp);
				continue;
			}			
			int f=-1;
			for(int i=0;i<anagrams.size();i++) {
//				first item of every list to compare to s
				String t = anagrams.get(i).get(0);
				if(s.length()!= t.length())
					continue;
				char[] sChars = s.toCharArray();
		        char[] tChars = t.toCharArray();
		        
		        Arrays.sort(sChars);
		        Arrays.sort(tChars);
		        
		        if(Arrays.equals(sChars, tChars)) {
					anagrams.get(i).add(s);
					f=1;
					break;
		        }
			}
			if(f!=1) {
				temp.add(s);
				anagrams.add(temp);
			}
		}
		
		
		return anagrams;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupAnagrams gAnagrams = new GroupAnagrams ();
		List<List<String>> res = new ArrayList<List<String>>();

		res = gAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
		System.out.println(res);
	}

}
