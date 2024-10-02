package javaPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jLogging {

	public static void main(String[] args) {
		
		// Create logger instance
		Logger logger = Logger.getLogger("Log4J logging");
		
		// configure Log4j.properties file
		PropertyConfigurator.configure("C:\\Users\\Admin\\eclipse-workspace\\Online_Java_Class\\log4j.properties");
		
		// Open browser instance
		
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    logger.info("Chrome Browser instance opened");
	    
	    // Window maximized
	    driver.manage().window().maximize();
	    logger.info("Window maximized");
	    
	    // Implicit wait
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        logger.info("Implicit wait given");
         
        // Check if the web element is displayed or not
        try {
			driver.findElement(By.id("email")).isDisplayed();
			logger.info("Web element found");
				
		} catch (Exception e) {
			logger.info("Failure - Web element not found");
		}
        
        
	}

}
