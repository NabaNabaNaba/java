package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3RegisterForm {

	public static void main(String[] args) {
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
//		
//		//Testcase 1 with valid data
//		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("John");
//		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Clinton");
//		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("john@gmail.com");
//		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Comment added.");
//		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();//submit works as click()
//		
//		//To validate weather its pass or not
//		WebElement message = driver.findElement(By.cssSelector("#contact_reply > h1"));
//		if (message.isDisplayed()) {
//			System.out.println("test pass");
//		}
//		else {
//			System.out.println("test fail");
//		}
//		driver.quit();
		
		
//		//Testcase 2 with invalid data
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
//		
//		//Testcase 2 with valid data
//		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("John");
//		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Clinton");
//		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("johngmail.com");
//		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Comment added.");
//		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).click();
//		
//		//To validate weather its pass or not
//		WebElement message1 = driver.findElement(By.cssSelector("body"));
//		if (message1.isDisplayed()) {
//			System.out.println("test pass");
//		}
//		else {
//			System.out.println("test fail");
//		}
//		driver.quit();
		
		
//		//Testcase 3 to clear all data with reset button
//				ChromeDriver driver = new ChromeDriver();
//				driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
//				
//				//Testcase 3 with valid data
//				driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("John");
//				driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Clinton");
//				driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("johngmail.com");
//				driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Comment added.");
//				driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).click();
//				
//				//To validate weather its pass or not
//				WebElement message1 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
//				
//				if (message1.isDisplayed()) {
//					System.out.println("test pass");
//				}
//				else {
//					System.out.println("test fail");
//				}
//				driver.quit();

				
		//Testcase 4 to clear all data with clear()method
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//Testcase 4 to clear all data with clear()method
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("John");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Clinton");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("johngmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Comment added.");
		
		//To validate weather its pass or not
		WebElement message1 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		
		if (message1.isDisplayed()) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		driver.quit();
	}

}
