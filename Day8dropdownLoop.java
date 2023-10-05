package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day8dropdownLoop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// program 1
		WebElement selectDrop = driver.findElement(By.cssSelector("#dropdowm-menu-2"));
		Select dropdown = new Select(selectDrop);
		dropdown.selectByIndex(1);// it will get 1 index
		dropdown.selectByVisibleText("Maven");// it will get by text
		dropdown.selectByValue("testng");// it will get by value

		// program2
		// loop dropdown and select all elements
		List<WebElement> drop = dropdown.getOptions();
		for (int i = 0; i < drop.size(); i++) {
			dropdown.selectByIndex(i);
		}

		// program3
		WebElement selectDrop2 = driver.findElement(By.cssSelector("#dropdowm-menu-3"));
		// creating object with select class for dropdown list
		Select dropdown2 = new Select(selectDrop2);
		List<WebElement> drop2 = dropdown2.getOptions();
		for (int i = 0; i < drop2.size(); i++) {
			dropdown2.selectByIndex(i);
		}

		// program 4
		WebElement selectDrop3 = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		Select dropdown3 = new Select(selectDrop3);
		List<WebElement> drop3 = dropdown3.getOptions();
		for (int i = 0; i < drop3.size(); i++) {
			dropdown3.selectByIndex(i);
		}
		

		// this script works for if condition below
		List<WebElement> drop1 = dropdown.getOptions();
		for (int i = 0; i < drop1.size(); i++) {
			if (drop1.get(i).getText().startsWith("M")) {
				dropdown.selectByVisibleText(drop1.get(i).getText());
			}
		}


	}

}
