package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	private static final String JavascriptExecutor = null;

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Online_Java_Class\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.flipkart.com/camera-clp-store?otracker=nmenu_sub_Electronics_0_Camera&fm=neo%2Fmerchandising&iid=M_14151e10-be3d-4b2d-9511-00059a8010f2_1_372UD5BXDFYS_MC.JR4C1KAN1IAQ&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Electronics~Cameras%2B%2526%2BAccessories_JR4C1KAN1IAQ&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L1_view-all&cid=JR4C1KAN1IAQ");
        driver.manage().window().maximize();
        System.out.println("Window get maximized successfully");
        Thread.sleep(2000);
        driver.manage().deleteAllCookies();
        
        driver.findElement(By.xpath("(//div[@class='XqNaEv'] [3]")).click(); //4* & Above
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='XqNaEv'] [2]")).click(); //3* & Above
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='XqNaEv'] [1]")).click(); //2* & Above
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='XqNaEv'] [0]")).click(); //1* & Above
        System.out.println("All 4 checkboxes are checked");
        
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,-2000)");
        System.out.println("Page is scrolled");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[contains(text(),'Clear all')])[2]")).click(); // clear all the checkboxes
        System.out.println("All checkboxes are cleared");
        
        
	}

}
