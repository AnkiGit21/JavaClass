package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Online_Java_Class\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// maximize the window
		driver.manage().window().maximize();
		System.out.println("Window get maximized successfully");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("thakare.ankita777@gmail.com");

		System.out.println(driver.findElement(By.id("email")).getAttribute("Value"));
		WebDriverWait wt = new WebDriverWait(driver, 50);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("12345678");

	}

}
