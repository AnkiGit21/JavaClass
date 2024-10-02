package javaPackage;

import org.testng.annotations.Test;

public class TestNG3 {

	@Test
	public void a() {
		System.out.println("Hello a method");
	}
	
	@Test(priority = 0)
	public void b() {
		System.out.println("Hello b method");
	}
	
	@Test(priority = -1)
	public void c() {
		System.out.println("Hello c method");
	}
	
	@Test
	public void d() {
		System.out.println("Hello d method");
	}
	
	
	
}
