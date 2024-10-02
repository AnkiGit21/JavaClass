package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {

	@Test 
	public void a() {
			Assert.assertTrue(3<12);
			System.out.println("a test method");
		}
	
	@Test 
	public void b() {
			Assert.assertTrue(3>12);
			System.out.println("b test method");
		}
	    
	
	@Test(dependsOnMethods = "a") 
			public void z() {
				
		    System.out.println("z test method");
			}
			
		

}