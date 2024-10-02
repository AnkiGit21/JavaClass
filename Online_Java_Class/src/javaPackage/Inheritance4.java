package javaPackage;

public class Inheritance4 extends Inheritance3 {


	public void multiply(int x, int y) {
    	
    	z=x*y;
    	System.out.println("Product is: " +z);
    		
    }
    public void div(int x, int y) {
    	
    	z=x/y;
    	System.out.println("Division is: " +z);
    		
    }
	public static void main(String[] args) {
		int x= 30; int y=20;
		Inheritance4 I4 = new Inheritance4();
		I4.add(x, y);       //50
		I4.sub(20, 10);     //10
		I4.multiply(x, y);  //600
		I4.div(50, 10);     //5
	}

}
