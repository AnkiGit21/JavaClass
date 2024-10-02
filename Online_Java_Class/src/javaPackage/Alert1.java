package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert1 {

	public static void main(String[] args) throws Exception 
	{
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://demoqa.com/alerts");
	    
	   // maximize the window
	   driver.manage().window().maximize();
	   System.out.println("Window get maximized successfully");
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   //Alert Handling
	   Thread.sleep(2000);
	   driver.findElement(By.id("confirmButton")).click();
	   Thread.sleep(2000);
	   
	   // Verify alert text
	   String expAlertText = "Do you confirm action";
	   String alertText = driver.switchTo().alert().getText();
	   Assert.assertEquals(alertText, expAlertText);
       System.out.println("Alert text verified");
       
       //Alert Accept
       driver.switchTo().alert().accept();
       System.out.println("Alert accepted");
       
     //Alert Dismiss
       Thread.sleep(2000);
	   driver.findElement(By.id("confirmButton")).click();
	   Thread.sleep(2000);
       driver.switchTo().alert().dismiss();
       System.out.println("Alert dismissed");
       driver.close();
       
       
	}

}
