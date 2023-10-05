package one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7ImplicitWait {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//wait method implicitWait which is dynamic 
		//it will wait until element is not found of timeUnit
		//if it found element in 2 seconds is doesn't wait for 10 secs and go for another elements
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();
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
	}

}
