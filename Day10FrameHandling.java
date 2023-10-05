package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10FrameHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		//WebElement eleFrame = driver.findElement(By.cssSelector("#frame"));
		
		//handling method for iframe 
		driver.switchTo().frame(0);
		WebElement eleFrame = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a"));
		System.out.println(eleFrame.isDisplayed());
		
		if(driver.getTitle().equals("WebDriver | IFrame")) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		//code by chinmay
		/*
		 // visiting the url
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		
		// Iframe
//		WebElement ele = driver.findElement(By.cssSelector("#frame"));
//		driver.switchTo().frame(ele);
		
		// Switch to iframe by index
		driver.switchTo().frame(0);
		WebElement ele2 = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a"));		
		System.out.println(ele2.isDisplayed());
		
		
		// Switching back to main content
		driver.switchTo().defaultContent();
		// finding element in main content
		driver.findElement(By.cssSelector("#nav-title")).isDisplayed();
		
		
		// validaing the title of main content
		if(driver.getTitle().equals("WebDriver | IFrame")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
			
		// closing the browser
		driver.close();
		 */
	}

}
