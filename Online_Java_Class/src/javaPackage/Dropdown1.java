package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropdown1 {

	public static void main(String[] args) throws Exception
{
		System.setProperty("webdriver.edge.driver", "D:\\SoftwareEdge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	   // maximize the window
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	   System.out.println("Window get maximized successfully");
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();  // Clicking Create Account button
       
	   Thread.sleep(2000);
	   List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
	   System.out.println("Total Dropdown Values :" + birthMonth.size());
       birthMonth.get(0).click();
       
       Thread.sleep(2000);
       birthMonth.get(1).click();
       
       Thread.sleep(2000);
       birthMonth.get(2).click();
       
       Thread.sleep(2000);
       birthMonth.get(3).click();
       
       Thread.sleep(2000);
       birthMonth.get(4).click();
       
       Thread.sleep(2000);
       birthMonth.get(5).click();
       
       Thread.sleep(2000);
       birthMonth.get(11).click();
       
       Thread.sleep(2000);
       birthMonth.get(7).click();
       
       Thread.sleep(2000);
       birthMonth.get(8).click();
       
       Thread.sleep(2000);
       birthMonth.get(9).click();
       
       Thread.sleep(2000);
       birthMonth.get(10).click();
       
       Thread.sleep(2000);
       birthMonth.get(06).click();
       
       Thread.sleep(2000);
	   List<WebElement> birthDay = driver.findElements(By.xpath("(//select[@id='day'])/option"));
	   System.out.println("Total Dropdown Values :" + birthDay.size());
       birthDay.get(0).click();
       
       Thread.sleep(2000);
       birthDay.get(20).click();
       
       Thread.sleep(2000);
	   List<WebElement> birthYear = driver.findElements(By.xpath("(//select[@id='year'])/option"));
	   System.out.println("Total Dropdown Values :" + birthYear.size());
	   
	   Thread.sleep(2000);
       birthYear.get(29).click();
	}

}
