package javaPackage;

public class TypeCastingNarrowing {

	public static void main(String[] args) throws Exception {
		double b = 5.9;
		int a = (int) b;    //Manual casting double to integer
		
		System.out.println(b);
		System.out.println(a);
		
		// String to integer conversion
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		// Integer to String conversion
		int z = 5;
		String t = String.valueOf(z);
		System.out.println(t);
		System.out.println(t.length());
		
		// Double to String conversion
				double x = 5.35;
				String y = String.valueOf(x);
				System.out.println(y);
				System.out.println(y.length());
	
	}

}
