package javaPackage;

public class Encapsulation1 {
	
	String name;          //Global Variable
	int b;               //Global Variable
	final int c = 2;    // Final variable
	
	

	public void a() 
	{
		
		int c = 5;
		System.out.println(c);

	}
	
	final void d() 
	{
       System.out.println("final method");
    }
	
	public void setName(String s) {
	     this.name = s;
	     this.b = 5;
	     System.out.println(b);
	     System.out.println(c);		
	}
	
	public String getName() {
		return name;
	}
}