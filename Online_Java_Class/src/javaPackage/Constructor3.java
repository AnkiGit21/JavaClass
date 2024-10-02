package javaPackage;

public class Constructor3 {
	
	// Constructor overloading
	//Default constructor
			Constructor3()
			{
				System.out.println("No argument constructor");
			}
			
			Constructor3(int a)
			{
				System.out.println("int argument constructor");
			}
			
			Constructor3(String b)
			{
				System.out.println("String argument constructor");
			}

	public static void main(String[] args) {
		Constructor3 c3 = new Constructor3();
		Constructor3 c4 = new Constructor3(1);
		Constructor3 c5 = new Constructor3("abc");
	}

}
