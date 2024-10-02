package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Online_Java_Class\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		Actions actions = new Actions(driver);

		// Get title of the window
		System.out.println(driver.getTitle());

		// maximize the window
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println("Window get maximized successfully");

		driver.navigate().to("https://www.flipkart.com/");

		// Entering Email ID
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("thakare.ankita777@gmail.com");

//	   driver.findElement(By.id("pass")).sendKeys("Ganpati@21");
//	   
//	  driver.findElement(By.name("login")).click();

		// Delete all cookies
//	   Thread.sleep(2000);
//	   driver.manage().deleteAllCookies();
//	   
		// Open URL using navigate method
//	   Thread.sleep(2000);
//	   driver.navigate().to("https://www.google.com/");

		// Refresh the page
//	   Thread.sleep(2000);
//	   driver.navigate().refresh(); 

		// Navigate to back
//	   Thread.sleep(2000);
//	   driver.navigate().back(); 

		// Navigate to forward
//	   Thread.sleep(2000);
//	   driver.navigate().forward();

		// Fetch current URl
//	   Thread.sleep(2000);
//	   System.out.println(driver.getCurrentUrl());

		// Get title of the WebPage
//	   Thread.sleep(2000);
//	   System.out.println(driver.getTitle());
		Thread.sleep(2000);
//	   driver.close();
		// Close the current window
//	   

	}

}
