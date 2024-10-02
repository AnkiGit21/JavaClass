package javaPackage;

public abstract class Abstraction1 
{
	static int a = 5;           //static variable
	int b = 10;                //Global variable
    final int c = 15;          //final variable
    
    
    abstract void eat();       //Declaring Abstract eat() method without body
    
    public void a()            //Non-Abstract method with body
    {
    System.out.println("Non abstract method"); 
    }

}