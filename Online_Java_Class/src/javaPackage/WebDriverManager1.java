package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManager1 {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception
	{
		// WebDriverManager.edgedriver().setup();
		   WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

}
