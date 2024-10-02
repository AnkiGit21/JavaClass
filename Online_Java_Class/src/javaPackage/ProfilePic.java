package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class ProfilePic {
	@Test
	public void login() throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "D:\\Software\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	
		driver.get("https://login.yahoo.com/myaccount/overview/?src=ym&.done=https%3A%2F%2Fmail.yahoo.com%2F&pspid=159600001&activity=ybar-acctinfo&.scrumb=.SFkLODo2yW");
		driver.manage().window().maximize();
    	driver.findElement(By.id("login-username")).sendKeys("bslive1234@yahoo.com");
    	driver.findElement(By.id("login-signin")).click();                                  // Next button
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	driver.findElement(By.id("login-passwd")).sendKeys("Ganpati@21");   //Password
    	driver.findElement(By.id("login-signin")).click();
    	Thread.sleep(2000);
    	try {
    	 driver.findElement(By.xpath("//span[@class='_yb_hqfjsf _yb_f6a4a0 _yb_d3s45l   _yb_lbwe2j']")).click();
    	 
    	    // Locate the iframe by its id
    	    WebElement iframeElement = driver.findElement(By.xpath("//*[@class='_yb_1k16kbh']")); // Change selector as needed
    	    System.out.println("Frame");

    	    // Switch to the iframe
    	    driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='_yb_1k16kbh']")));
    	 
    	   
    	    WebDriverWait wait = new WebDriverWait(driver, 20);
    	    WebElement avatar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='avatarText']")));
    	    
    	   
    	    Actions act1 = new Actions(driver);
    	    act1.moveToElement(avatar).perform();
    	    Thread.sleep(2000);
    	 driver.findElement(By.xpath("//a[@class='edit-avatar']")).click();
    	 Thread.sleep(5000);
    	 driver.findElement(By.id("btnUploadFromDevice")).click();
    	 
    	// Wait for the upload input and upload a new profile picture
         WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));
         Thread.sleep(5000);
         uploadInput.sendKeys("C:\\Users\\Admin\\Downloads\\pexels-pixabay-15239.jpg");
         Thread.sleep(5000);
         // Save the changes
         WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSaveProfileImage")));
         saveButton.click();
		} catch(Exception e) {
            e.printStackTrace();
        } finally {
        	System.out.println("Finally executed");
        	Thread.sleep(2000);
        	//driver.close();

	}
	}	
}





