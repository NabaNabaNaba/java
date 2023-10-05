package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2A {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");	
		
	
		//driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(1)")).click();
		
		 List<WebElement> radioButtons = driver.findElements(By.name("color"));

	        // Click each radio button
	        for (WebElement radioButton : radioButtons) {
	            radioButton.click();
	            System.out.println(radioButton.getAttribute("value"));
	        }
	        driver.quit();
		}
		}
	


