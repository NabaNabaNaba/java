package one;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Day7fluientWait {

public static void main (String[]args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	
	//fluentWait() 
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)) // total time
			.pollingEvery(Duration.ofSeconds(2)) // polling time
			.ignoring(NoSuchElementException.class); // exemption

	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("item_0_title_link"))));
	driver.findElement(By.id("item_0_title_link")).click();
	
//	WebElement flwait = wait.until(new Function<WebDriver, WebElement>() {
//		public WebElement apply(WebDriver driver) {
//			return driver.findElement(By.id("item_0_title_link"));
//		}
	}

}
