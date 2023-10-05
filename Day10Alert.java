package one;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10Alert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//program 1 
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		//handling alert and storing in variable for assertion
		String alert1 = driver.switchTo().alert().getText();
		//assert alert
		if (alert1.equals("I am a JS Alert")) {
			System.out.println("test pass 1.");
		}
		//handling alert 
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());
		//assertion after handling alert
		if (driver.getTitle().equals("The Internet")) {
			System.out.println("test pass 1");
		}
		
		//program 2 for click ok
				driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
				//handling alert and storing in variable for assertion
				String alert2 = driver.switchTo().alert().getText();
				//assert alert
				if (alert2.equals("I am a JS Confirm")) {
					System.out.println("test pass 2.");
				}
				//handling alert 
				driver.switchTo().alert().accept();
				System.out.println(driver.getTitle());
				//assertion after handling alert
				if (driver.getTitle().equals("The Internet")) {
					System.out.println("test pass 2");
				}
				
		//program  3 for click cancell
				driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
				//handling alert and storing in variable for assertion
				String alert3 = driver.switchTo().alert().getText();
				//assert alert
				if (alert3.equals("I am a JS Confirm")) {
					System.out.println("test pass 3.");
				}
				//handling alert 
				driver.switchTo().alert().dismiss();
				System.out.println(driver.getTitle());
				//assertion after handling alert
				if (driver.getTitle().equals("The Internet")) {
					System.out.println("test pass 3");
				}
			
		//program  4 for sendkeys and click ok
				driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
				//handling alert and storing in variable for assertion
				String alert4 = driver.switchTo().alert().getText();
				//assert alert
				if (alert4.equals("I am a JS prompt")) {
					System.out.println("test pass 4.");
				}
				//handling alert 
				driver.switchTo().alert().sendKeys("text");
				driver.switchTo().alert().accept();
				System.out.println(driver.getTitle());
				//assertion after handling alert
				if (driver.getTitle().equals("The Internet")) {
					System.out.println("test pass 4");
				}
		
		//program  5 for click cancell
				driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
				//handling alert and storing in variable for assertion
				String alert5 = driver.switchTo().alert().getText();
				//assert alert
				if (alert5.equals("I am a JS prompt")) {
					System.out.println("test pass 5.");
				}
				//handling alert 
				driver.switchTo().alert().dismiss();
				System.out.println(driver.getTitle());
				//assertion after handling alert
				if (driver.getTitle().equals("The Internet")) {
					System.out.println("test pass 5");
				}
	}

}
