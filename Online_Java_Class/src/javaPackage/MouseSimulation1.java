package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception
	{
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com");
			
   // maximize the window
   driver.manage().window().maximize();
   System.out.println("Window get maximized successfully");
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
   // Create Electronics web Element Ref
   WebElement electro = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
      
   // Mouse simulation using Actions class
   
   Actions act = new Actions(driver);
   
   // Mouse hover to Electronics
   Thread.sleep(2000);
   act.moveToElement(electro).build().perform();
   System.out.println("Electronics highlighted");
   Thread.sleep(2000);  
   
   act.moveToElement(electro).build().perform();

   // Create Audio web Element Ref
   // WebElement audio = driver.findElement(By.xpath("//a[normalize-space()='Audio']"));
      
   // Mouse simulation using Actions class
   
   //Actions act1 = new Actions(driver);
   
   // Mouse hover to Audio
   Thread.sleep(2000);
   //act1.moveToElement(audio).build().perform();
   //System.out.println("Audio highlighted");
   //Thread.sleep(2000); 
   
// Create Electronics GST Store web Element Ref
      //WebElement gst = driver.findElement(By.xpath("//a[normalize-space()='Electronics GST Store']"));
   // Mouse simulation using Actions class
      //Actions act2 = new Actions(driver); 
      
   // Mouse hover to Electronics GST Store
//   Thread.sleep(2000);
//   act2.moveToElement(gst).build().perform();
//   System.out.println("Electronics GST Store highlighted");
   
   // Clicking on Electronics GST Store
//   Thread.sleep(2000);
//      driver.findElement(By.xpath("//a[normalize-space()='Electronics GST Store']")).click();
//     
//      System.out.println("Electronics GST Store clicked");
//      Thread.sleep(2000);
      
      //Keyboard Operations
      Thread.sleep(2000);
      driver.navigate().to("https://www.flipkart.com");
      Thread.sleep(2000);
      WebElement fash = driver.findElement(By.xpath("//*[contains(text(),'Fashion')]"));
      act.sendKeys(fash, Keys.ENTER).build().perform();
      System.out.println("Fashion Clicked");
      Thread.sleep(3000);
   
      // Right click on webpage
      Thread.sleep(2000);
      act.contextClick().build().perform();
      Thread.sleep(3000);
      System.out.println("Right click operation performed");
      // driver.close();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
