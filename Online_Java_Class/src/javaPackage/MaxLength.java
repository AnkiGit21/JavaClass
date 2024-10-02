package javaPackage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class MaxLength {
	    public static void main(String[] args) {
	        // Set the path to the chromedriver executable
	        System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver-win64\\chromedriver.exe");
	        
           // Headless browser mode definition
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless"); // Run in headless mode
	        options.addArguments("--disable-gpu"); // Disable GPU (Windows-specific workaround)
	        
	     // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Navigate to the target web page
	            driver.get("https://www.facebook.com/");
	            
	            driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	            
	           
	            // Locate the input field
	            WebDriverWait wait = new WebDriverWait(driver, 10);
	    	    WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")));
	            

	            // Create a string that exceeds the maximum length (assuming max length is 10)
	            String longInput = "ThisString1";

	            // Clear any pre-filled data
	            inputField.clear();

	            // Enter the exceeding data
	            inputField.sendKeys(longInput);

	            // Retrieve the value from the input field
	            String enteredValue = inputField.getAttribute("value");

	            // Verify if the entered value is truncated or a validation message is displayed
	            if (enteredValue.length() > 10) {
	                System.out.println("Test Failed: Input data is not truncated as expected.");
	            } else {
	                System.out.println("Test Passed: Input data is truncated as expected.");
	            }

	            // Optionally, check for validation messages or errors
//	            WebElement validationMessage = driver.findElement(By.id("validationMessageId"));
//	            if (validationMessage.isDisplayed()) {
//	                System.out.println("Validation Message: " + validationMessage.getText());
//	            } else {
//	                System.out.println("No validation message displayed.");
//	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            //driver.quit();
	        }
	    }
	}



