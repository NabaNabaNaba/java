package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1A {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		driver.findElement(By.cssSelector("#item_4_title_link > div")).click();
		driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.cssSelector("#shopping_cart_container > a")).click();
		WebElement dash = driver.findElement(By.cssSelector("#continue-shopping"));
		dash.click();
		if (dash.isDisplayed()) {
			System.out.println("Test is passed.");
		}
		else {
			System.out.println("Test failed.");
			
		}
		driver.quit();

	}

}
