package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	
		public static void main(String[] args) throws Exception
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Online_Java_Class\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://paytm.com/");
		    
		    
		   // maximize the window
		   driver.manage().window().maximize();
		   System.out.println("Window get maximized successfully");
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();
		   Thread.sleep(2000);
		   
		   // Find total number of frames present
		   int allFrames = driver.findElements(By.tagName("iFrame")).size();
		   System.out.println("Total Frames:" + allFrames);
           
		   
		   //Check if element is present or not
		   for (int i=0; i< allFrames; i++) {
			   
		   driver.switchTo().frame(i);
		   driver.switchTo().frame(i);
		   
		   String expText = "Open Paytm App";  
		   String abc = driver.findElement(By.xpath("//*[text() ='Open Paytm App']")).getText();
		   
		   if(abc.equalsIgnoreCase(expText)) {
			   System.out.println("****Element found****");
		   } else {
			   System.out.println("###Element not found###");
			   
			   
		   }	   
		   driver.close();
		   
	    }
	}

}
