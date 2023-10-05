package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1sendKeys {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/nabarajkhatiwada/Downloads/Softwares\\ and\\ files/chromedriver"); 
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName = driver.findElement(By.cssSelector("#user-name"));
				userName.sendKeys("standard_user");
		WebElement password = driver.findElement(By.cssSelector("#password"));
				password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
				login.click();
		WebElement dashboard = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
				dashboard.isDisplayed();
		
		if (dashboard.isDisplayed()) {
			System.out.println("Test is passed.");
		}
		else {
			System.out.println("Test failed.");
			
		}
		driver.quit();
	}
}