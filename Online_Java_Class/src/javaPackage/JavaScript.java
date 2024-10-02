package javaPackage;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Online_Java_Class\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com");
	    
	   // maximize the window
	   driver.manage().window().maximize();
	   System.out.println("Window get maximized successfully");
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   //Java Script executor
	   JavascriptExecutor jse = (JavascriptExecutor) driver;
	   
	   // Locate web element using Javascript
	   jse.executeScript("document.getElementById('email').value='thakare.ankita777@gmail.com'");
	   jse.executeScript("document.getElementById('pass').value='Ganpati@21'");
		
	   // scroll down using javascript
	   Thread.sleep(2000);
	   jse.executeScript("window.scrollBy(0,500)");
	   
	// scroll Up using javascript
	   Thread.sleep(2000);
	   jse.executeScript("window.scrollBy(0,-500)");

	}

}
