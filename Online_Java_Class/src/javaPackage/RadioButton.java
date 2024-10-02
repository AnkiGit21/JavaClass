package javaPackage;


 import java.util.List;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;

 public class RadioButton 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Online_Java_Class\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	   // maximize the window
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	   System.out.println("Window get maximized successfully");
       
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();  // Clicking Create Account button
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@value='1']")).click();  // Female
	   

	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@value='2']")).click();  // Male
	   

	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@value='-1']")).click();  // Custom
	   
	   // 2nd Way 
	   List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
	   System.out.println("Total radio buttons:-" + radios.size());
	   System.out.println(radios.get(02).isSelected()); // True
	   System.out.println(radios.get(0).isSelected()); // False
	   System.out.println(radios.get(0).isDisplayed()); // True
	   Thread.sleep(2000);
	   radios.get(0).click(); // Female
	   System.out.println(radios.get(01).isSelected()); // True
	   
	   // 3rd Way
	   Thread.sleep(2000);
	   List<WebElement> radiosText = driver.findElements(By.xpath("//label[@class='_58mt']"));
	   System.out.println("Total radio buttons text:- " + radiosText.size());
	   String expResult = "Male";
	   for(int i=1; i<=radiosText.size();i++) 
	   {
		 if(radiosText.get(i).getText().equalsIgnoreCase(expResult))
		 {
			 radiosText.get(i).click();
			 System.out.println(expResult  + " Clicked**");
			 break;
			 
		 }
		 }
	   Thread.sleep(2000);
	   driver.close();

	}
}
