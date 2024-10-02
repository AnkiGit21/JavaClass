package javaPackage;

public class EH1 {

	public static void main(String[] args) {
		try { 
		int a = 5/0;                        // Arithmetic Exception
		} catch (NullPointerException n) { 
			
			n.printStackTrace();       // Print complete exception info
			System.out.println(n);     // Print only exception part
		} catch (ArithmeticException a) { 
			a.printStackTrace(); 
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("Exception Handled");
}
}