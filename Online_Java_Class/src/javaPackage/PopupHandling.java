package javaPackage;

import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws Exception
	{ 
		{
			
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Online_Java_Class\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://demoqa.com/browser-windows");
		    
		   // maximize the window
		   driver.manage().window().maximize();
		   System.out.println("Window get maximized successfully");
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   // Step-1 Handling Tab window
		   Thread.sleep(2000);
		   driver.findElement(By.id("tabButton")).click();
		   System.out.println("Tab button is clicked");
		   
		   // Get the total number of tabs/windows
		   Set<String> allWindowsID = driver.getWindowHandles();
		   System.out.println(allWindowsID);
		  
		   Iterator<String> abc = allWindowsID.iterator();
		   String win1 = abc.next();
		   String win2 = abc.next();
		   
		   //Print the title of Parent window
		   driver.switchTo().window(win1);
		   System.out.println("Parent window ID "+win1);
		   System.out.println(driver.getTitle());
		   
		 //Print the title of Child window
		   driver.switchTo().window(win2);
		   System.out.println("Child window ID "+win2);
		   System.out.println(driver.getTitle());
		   System.out.println(driver.getCurrentUrl());
		   System.out.println("All the best");
		   Thread.sleep(2000);
		   
		   
		// Step-2 window/popup handling
		   
		   Thread.sleep(2000);
		   driver.switchTo().window(win1);
		   Thread.sleep(4000);
		   driver.findElement(By.id("windowButton")).click();
		   
		// Print the title of child window  
		   Set<String> allWindowsID1 = driver.getWindowHandles();
		   System.out.println(allWindowsID1);
		   Iterator<String> abc1 = allWindowsID1.iterator();
		   String win3 = abc1.next();
		   String win4 = abc1.next();
		   Thread.sleep(2000);
		   driver.switchTo().window(win4);
		   System.out.println("Child window ID "+win4);
		   System.out.println(driver.getTitle());
		   System.out.println(driver.getCurrentUrl());
		   System.out.println("All the popups handled");
		   Thread.sleep(2000);
		   
	}

}
}