package javaPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	public void a2() {
		System.out.println("Hello a2 Test method");
	}
	
    @BeforeTest
    public void bt() {
    	System.out.println("Hello bt method");
    }
    
    @BeforeSuite
    public void bs() {
    	System.out.println("Hello bs method");
    }
    
    @AfterMethod
    public void am() {
    	System.out.println("Hello am method");
    }
    
    @BeforeClass
    public void bc() {
    	System.out.println("Hello bc method");
    }
    
    @AfterClass
    public void ac() {
    	System.out.println("Hello ac method");
    }
    
    @BeforeMethod
    public void bm() {
    	System.out.println("Hello bm method");
    }
    
    @AfterTest
    public void at() {
    	System.out.println("Hello at method");
    }
    
    @AfterSuite
    public void as() {
    	System.out.println("Hello as method");
    }
    
    @Test
    public void a1() {
    	System.out.println("Hello a1 methodx");
    }
    
}
