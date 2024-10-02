package javaPackage;

public class EH7 {

	  public static void a(int age) {
		  try {
			if(age<18) {
				  throw new Exception("Not Applicable");
			  } else {
				  System.out.println("Applicable");
			  }
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		  
	  }
	
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(10000);
		a(15);
		a(20);
		
	}

}
