package src.CollectionsDemo;

import java.util.HashMap;

public class DemoHashMap {
	
	public static void main(String args[]) {
		HashMap<Object,Object> hm = new HashMap<>();
		
		HashMap<String,Integer> hM = new HashMap<String,Integer>();
		hM.put("one", 1);
		
		hm.put("two", 2);
		
		System.out.println(hm);
		System.out.println(hM);
		
	}

}
