package one;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9WindowHandleA {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();  
		  driver.get("http://www.webdriveruniversity.com/"); 
		  String parentWindow = driver.getWindowHandle(); 
		  System.out.println(parentWindow); 
		  driver.findElement(By.cssSelector("#contact-us")).click(); 
		   
		  Set <String> windows = driver.getWindowHandles(); 
		  for(String window:windows) { 
		   if(! window.equals(parentWindow)) { 
		    driver.switchTo().window(window); 
		    break; 
		   } 
		  } 
		   
		  System.out.println(driver.getCurrentUrl()); 
		  WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")); 
		  WebElement last_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")); 
		  WebElement email_address = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")); 
		  WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea")); 
		  WebElement submit_button =driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")); 
		   
		  first_name.sendKeys("naba"); 
		  last_name.sendKeys("raj"); 
		  email_address.sendKeys("raj@gmail.com"); 
		  message.sendKeys("I am learning selenium"); 
		  submit_button.click();   
		   
		 
		  driver.switchTo().window(parentWindow); 
		  System.out.println(driver.getCurrentUrl()); 

	}

}
