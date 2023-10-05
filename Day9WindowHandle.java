package one;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9WindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//window handle for parent window 
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		driver.findElement(By.cssSelector("#newWindowBtn")).click();
		
		
		//after opening new window : window handles () method for multi window
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(driver.getCurrentUrl());
		//switching to child window with for each loop
		for (String winHandle : childWindow) {
			System.out.println(winHandle);
			if(!winHandle.equals(childWindow)) {
				driver.switchTo().window(winHandle);
		
			}}
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				//fill up the form for child window
		driver.findElement(By.cssSelector("#firstName")).sendKeys("George");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Kim");
		driver.findElement(By.cssSelector("#email")).sendKeys("kim@yahoo.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("kim123");
		driver.findElement(By.cssSelector("#registerbtn")).click();
		
		//switching back to parent window
			driver.switchTo().window(parentWindow)		;
			System.out.println(driver.getCurrentUrl());
		}
	}
