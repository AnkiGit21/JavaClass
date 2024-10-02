package javaPackage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

class ProfileUpload2 {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\SoftwareEdge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get(
				"https://login.yahoo.com/myaccount/overview/?src=ym&.done=https%3A%2F%2Fmail.yahoo.com%2F&pspid=159600001&activity=ybar-acctinfo&.scrumb=.SFkLODo2yW");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-username")).sendKeys("bslive1234@yahoo.com");
		driver.findElement(By.id("login-signin")).click(); // Next button
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("login-passwd")).sendKeys("Ganpati@21"); // Password
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//img[@class='_yb_23noqw']")).click();

			// Locate the iframe by its id
			WebElement iframeElement = driver.findElement(By.xpath("//*[@class='_yb_phrxni']")); // Change selector as
																									// needed
			System.out.println("Frame");

			// Switch to the iframe
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='_yb_phrxni']")));

			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement avatar = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='avatarImage']")));

			Actions act1 = new Actions(driver);
			act1.moveToElement(avatar).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='edit-avatar']")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("btnUploadFromDevice")).click();
			// Wait for the upload input and upload a new profile picture
//       WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));
			Thread.sleep(5000);
//       uploadInput.sendKeys("C:\\Users\\Admin\\Downloads\\pexels-blaque-x-264516-863963.jpg");

			// driver.findElement(By.xpath("//*[@type='file']")).sendKeys("C:\\Users\\Admin\\Downloads\\pexels-blaque-x-264516-863963.jpg");
			// Thread.sleep(5000);

			Robot rb = new Robot();
			StringSelection str = new StringSelection("C:\\Users\\Admin\\Downloads\\pexels-pixabay-15239.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);

			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);

			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);

			// Save the changes
			WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSaveProfileImage")));
			saveButton.click();

			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(2000);

			WebElement inboxButton = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//button[@class='_yb_u47985 _yb_cnxrpc       _yb_1ace5mi _yb_5e69di    ']")));
			inboxButton.click();
			Thread.sleep(2000);

			String originalWindow = driver.getWindowHandle();

			// Wait for the new tab
			Set<String> allWindows = driver.getWindowHandles();
			while (allWindows.size() == 1) {
				allWindows = driver.getWindowHandles();
			}

			// Loop through until we find a new window handle
			for (String windowHandle : allWindows) {
				if (!windowHandle.equals(originalWindow)) {
					driver.switchTo().window(windowHandle);
					break;
				}
			}
			

			WebElement messageCount = driver.findElement(By.xpath(
					"//span[@class='A_6DUj P_Z2rzCvT H_6FIA i_6FIA c1AVi73_6EWk c1AVi7H_6LEV c1AVi7a_6LEV t_C e_3mS2U C_Z281SGl I_T u_b']"));

			String count = messageCount.getText();

			int number = Integer.parseInt(count);

			System.out.println("Inbox message count is:" + number);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			System.out.println("Finally executed");
			Thread.sleep(2000);
			// driver.close();

		}
	}
}
