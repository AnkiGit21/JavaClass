package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Online_Java_Class\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://money.rediff.com/gainers");
	    
	   // maximize the window
	   driver.manage().window().maximize();
	   System.out.println("Window get maximized successfully");
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   // Create list - All companies
	   List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total companies : "+ allCompanies.size());
		
	 // Create list - Current company
	   List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	   System.out.println("Total current price : "+ currentPrice.size());
		
	   String expResult = "Skipper Ltd.";
	   for(int i=0; i<allCompanies.size(); i++) 
	   {
		  if(allCompanies.get(i).getText().equalsIgnoreCase(expResult))
		{
		System.out.println(allCompanies.get(i).getText() + " ==== " + currentPrice.get(i).getText());
		allCompanies.get(i).click();
	    break;
	    }
	   }	
	   
	}		
		
}	
	


