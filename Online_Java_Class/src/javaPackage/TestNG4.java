package javaPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {
  //@Test - 1st way to execute
  public void a() {
	  
	  System.out.println("Hello a test method");
  }
  
  @Test(enabled = false)    // 2nd way widely used in market, false means not runnable
  public void b() {
    
	  System.out.println("Hello b test method");
  
  }
  
  @Test(enabled = true)  // Enabling test as true means runnable.
  public void c() {
    
	  System.out.println("Hello c test method");
  
  }
  
  @Test(invocationCount = 2)    // Invocation count is 2 means test will run 2 times, will give same output twice.
  public void d() {
    
	  System.out.println("Hello d test method");
  
  }
  
  @Test(invocationCount = 0)   // Invocation count is 0 means test will not be run.
  public void e() {
    
	  System.out.println("Hello e test method");
  
  }
  
  @Test(invocationCount = 1)
  public void f() {
    
	  System.out.println("Hello f test method");
  
  }
  
  @Test                          //Conditional skipping
  public void g() {
    
	  System.out.println("Hello g test method");
      throw new SkipException("Skipping f test method");
  }
  
}
