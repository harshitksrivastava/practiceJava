package src.Strings;

public class StringBufferDemo {
	public static void main(String args[]) {
		
		StringBuffer demo = new StringBuffer();
		
		String s = "Python";
		
		for(int i =0;i<s.length();i++) {
			demo.append(s.charAt(i));
			System.out.println(demo);
		}
		
		StringBuilder demo2 = new StringBuilder("Hello");
		demo2.append(" Java");
		demo2.append("L");
		System.out.println(demo2);
		demo2.replace(2, 5, s);
		System.out.println(demo2);

	}
}
