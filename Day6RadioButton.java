package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");		
		
		//finding the elements in list
		List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name='color']"));
		//looping all radio button to click
		for (WebElement radioButton :radioButtons) {
			
				radioButton.click();
			//asserting radiobutton clicked or not	
				System.out.println(radioButton.isSelected());
			
		
		
		}
	}

}
