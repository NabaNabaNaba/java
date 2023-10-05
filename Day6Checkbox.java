package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6Checkbox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");		
		
		//finding the elements in list
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		//looping to check all checkboxes
		for (WebElement checkbox : checkboxes) {
			if(!checkbox.isSelected()) {
				checkbox.click();
			System.out.println(checkbox.isSelected());
			}	
		}
		//looping to uncheck all checkboxes
		for (WebElement checkbox : checkboxes) {
			checkbox.click();
			System.out.println(checkbox.isSelected());
		}

	}

}
