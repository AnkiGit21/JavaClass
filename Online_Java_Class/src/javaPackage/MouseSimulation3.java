package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {
	
		public static void main(String[] args) throws Exception
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Online_Java_Class\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    
		    driver.get("https://jqueryui.com/draggable");
		    
		   // maximize the window
		   driver.manage().window().maximize();
		   System.out.println("Window get maximized successfully");
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		// Switch to frame
		   driver.switchTo().frame(0);
		   System.out.println("Switched to Frame");
		   
		   // Draggable web Element
		   
		   WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		   
        // Drag and Drop using Action class
		   
		   Thread.sleep(2000);
		   Actions act = new Actions(driver);
		   act.dragAndDropBy(drag, 100, 60).build().perform();
		   System.out.println("Drag and drop operation performed");
		   

	}

}
