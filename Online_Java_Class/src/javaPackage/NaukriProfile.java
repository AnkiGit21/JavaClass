package javaPackage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NaukriProfile {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "D:\\Software\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	
		try {
			driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
			driver.manage().window().maximize();
			driver.findElement(By.id("usernameField")).sendKeys("thakare.ankita777@gmail.com");
			driver.findElement(By.id("passwordField")).sendKeys("Ganpati@21");
			driver.findElement(By.xpath("//button[@type='submit']")).click();                                  // Next button
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			
			driver.findElement(By.xpath("//img[@class='draft-cross']")).click();  // Clicking cross button

			driver.findElement(By.xpath("//input[@type='button']")).click();       // Upload resume
			
			driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Admin\\Downloads\\Ankita Thakare-Automation TestEngineer_4Yr_Exp_Resume.pdf");
			
			Thread.sleep(10000);
			
			Robot rb = new Robot();
			StringSelection str = new StringSelection("C:\\Users\\Admin\\Downloads\\Ankita Thakare-Automation TestEngineer_4Yr_Exp_Resume.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='photoBadge Pending']")).click();    //Clicking on Replace photo
			driver.findElement(By.id("fileUpload")).sendKeys("C:\\Users\\Admin\\Downloads\\AnkiPic.jpg");                    // Clicking on Change Photo button
			
			// driver.findElement(By.xpath("//i[@title='Click here to download your resume']")).click();           // Download resume
			Thread.sleep(3000);
			// driver.findElement(By.xpath("//i[@title='Click here to delete your resume']")).click();            // Delete current resume
			
		 } catch(Exception e) {
	          e.printStackTrace();
	      } finally 
		{
	        System.out.println("Finally executed");
	      	Thread.sleep(2000);
		}        
	}
}

