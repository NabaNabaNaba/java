package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Checkbox {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");	
		 
		//driver.findElement(By.cssSelector("")).click();
		
		List<WebElement> checkbox = driver.findElements(By.cssSelector("#checkboxes"));
//		for ( WebElement checkboxes : checkbox) {
//			checkboxes.click();
		for(int i=0; i<checkbox.size(); i++)
		{
			if(checkbox.get(i).isDisplayed()&& checkbox.get(i).isEnabled())
			{
                   System.out.println("Checkbox is displayed at index");
                        checkbox.get(i).click();
			}
		}	
			
		}
		
	}


