package javaPackage;

public class Constructor2 {

	int id;               //Global variable
	String name;          //Global variable
	String address;       //Global variable
	
	
	
		
      //Default constructor
		Constructor2()
		{
			System.out.println("Hello default constructor");
		}
		
		//Parameterized constructor
				Constructor2(int a, String b, String c)
				{
					id = a;
					name = b;
					address = c;
				}
				
        // Non-static method
				public void displayInfo()
				{
					System.out.println(id+ " " +name + " " + address );
				}
				
		public static void main(String[] args) {
			
			//Default constructor
			Constructor2 c2= new Constructor2();
			
			//Parameterized constructor
			Constructor2 c3= new Constructor2(1, "Nancy", "USA");
			c3.displayInfo();
			
			
			//Parameterized constructor
			Constructor2 c4= new Constructor2(2, "Nui", "UK");
			c4.displayInfo();
			
		}

}
