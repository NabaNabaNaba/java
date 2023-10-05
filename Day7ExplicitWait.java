package one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day7ExplicitWait {

	public static void main (String[]args) {
		//The Explicit Wait is used to tell the Web Driver
		//to wait for certain conditions (Expected Conditions) 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();
		//creating wait method
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//adding condition
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#logout_sidebar_link"))));
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		
		//assertion after logOut
				String title = driver.getTitle();
				System.out.println(title);
				if (title.contains("Swag Labs")) {
					System.out.println("test pass");
				}else {
					System.out.println("test fail");
				}
				driver.quit();
//		waitMethods conditions :----
//		alertIsPresent()
//		elementSelectionStateToBe()
//		elementToBeClickable()
//		elementToBeSelected()
//		frameToBeAvaliableAndSwitchToIt()
//		invisibilityOfTheElementLocated()
//		invisibilityOfElementWithText()
//		presenceOfAllElementsLocatedBy()
//		presenceOfElementLocated()
//		textToBePresentInElement()
//		textToBePresentInElementLocated()
//		textToBePresentInElementValue()
//		titleIs()
//		titleContains()
//		visibilityOf()
//		visibilityOfAllElements()
//		visibilityOfAllElementsLocatedBy()
//		visibilityOfElementLocated()
	}

}
