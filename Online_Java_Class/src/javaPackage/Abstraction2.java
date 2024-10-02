package javaPackage;

public class Abstraction2 extends Abstraction1 {

	@Override
	void eat()                            //Implementing eat() method 
	{          
		System.out.println("Please eat");
		
	}
	
     public static void main(String[] args) 
    {
		Abstraction2 a2 = new Abstraction2();
		a2.eat();
		a2.a();
   
	}

}
