package javaPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
		

		public class RelativeLocator {
		    public static void main(String[] args) {
		        // Set the path to the ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        // Initialize the WebDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the login page
		        driver.get("URL_of_the_login_page");

		        // Locate elements using relative locators
		        WebElement username = driver.findElement(By.tagName("input"));  // Assuming the first input field is 'username'
		        WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(username));
		        WebElement loginButton = driver.findElement(RelativeLocator.with(By.tagName("button")).below(password));

		        // Interact with the elements
		        username.sendKeys("your_username");
		        password.sendKeys("your_password");
		        loginButton.click();

		        // Close the browser
		        driver.quit();
		    }
		}

	}

}
