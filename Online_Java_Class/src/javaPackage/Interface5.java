package javaPackage;

public class Interface5 extends Inheritance1 implements Interface3, Interface4
    {

	
	public void b() {
		System.out.println("b method");
		
	}

	
	public void a() {
		System.out.println("a method");
		
	}

	public static void main(String args[]) {
		
	Interface5 I5 = new Interface5();
	I5.b();
	I5.a();
	System.out.println(I5.roll);
		

}
}