package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Online_Java_Class\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.google.com/");
	    
	   // maximize the window
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	   System.out.println("Window get maximized successfully");
	   
	   // Implicit wait
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff works");
       System.out.println("Element Searched");
       
       // Handling auto-suggestions
       List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li")); 
	   for(int i=0; i<AllSuggestions.size(); i++) 
	   {
		   String expResult = "how stuff works podcast";
		   if(AllSuggestions.get(i).getText().equalsIgnoreCase(expResult)) {
		   AllSuggestions.get(i).click();
		   break;

		   }
		   System.out.println("Expected Result opened");
	   }
		   
	
	}
}


