package Polymorphism;

public class MethodOverloading {

	
      public void add(int a, int b)
      {
    	  try {
			int c = a+b;
			  System.out.println("The sum is:" +c);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
      }
      
      public void add(int a, int b, int c)
      {
    	  try {
			int d = a+b+c;
			  System.out.println("The sum is:" +d);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
      }
      
      public static void main(String[] args) {
  		MethodOverloading mo = new MethodOverloading();
  		mo.add(1,2);
  		mo.add(10, 20, 30);

  	}
}
