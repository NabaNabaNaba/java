package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4MultiUserPr {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		// testcase 1 login
		driver.get("https://www.saucedemo.com/");
		login(driver, "standard_user", "secret_sauce");
		WebElement txt1 = driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div"));
		if (txt1.isDisplayed()) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		// testcase 2 login
		driver.get("https://www.saucedemo.com/");
		login(driver, "locked_out_user", "secret_sauce");
		WebElement txt2 = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error"));
		if (txt2.isDisplayed()) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		// testcase 3 login
		driver.get("https://www.saucedemo.com/");
		login(driver, "problem_user", "secret_sauce");
		WebElement txt3 = driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div"));
		if (txt3.isDisplayed()) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		// testcase 4 login
		driver.get("https://www.saucedemo.com/");
		login(driver, "performance_glitch_user", "secret_sauce");
		WebElement txt4 = driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div"));
		if (txt4.isDisplayed()) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		//count of image in the page
		List<WebElement> imageList = driver.findElements(By.cssSelector("#inventory_container > div"));
		System.out.println(imageList.size());
		 
		//how to find whole elements in a page
//		List<WebElement> elementList = driver.findElements(By.cssSelector("body"));
//		System.out.println(elementList.size());
//	
//		driver.quit();
	}
	
	
	
	// creating function for multiuser
	public static void login(ChromeDriver driver, String userName, String password) {
		WebElement userN = driver.findElement(By.cssSelector("#user-name"));
		WebElement pass = driver.findElement(By.cssSelector("#password"));
		WebElement click = driver.findElement(By.cssSelector("#login-button"));
		userN.sendKeys(userName);
		pass.sendKeys(password);
		click.click();
	}
}
