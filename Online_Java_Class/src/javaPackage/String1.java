package javaPackage;

public class String1 {

	public static void main(String[] args) {
		
		{
		  String[] str = new String[10];
		  str[0] = "Wel";
		  str[1] = "Come";
		  str[2] = "Home";
          str[3] = "Soon";
		  for (String value : str) {
			    System.out.println(value);	    
		  
		}
		  String name = "John";
		  int age = 30;
		  double salary = 10;
		  String message = String.format("My name is %s and I am %d years old and my salary is %f", name, age, salary);
		  System.out.println(message);
	}

	}
}