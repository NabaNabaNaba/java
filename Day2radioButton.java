package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2radioButton {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");	
		
		//input text by sendKeys()
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Rose");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Shah");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("rose@yahoo.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Hello All");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).click();
		
		WebElement message = driver.findElement(By.cssSelector("#contact_reply > h1"));
		if (message.isDisplayed()) {
			System.out.println("Test Pass.");
		}else {
			System.out .println("Test Fail.");
		}
		driver.quit();	}

}
