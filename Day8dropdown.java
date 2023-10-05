package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day8dropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nepalemarket.com/collections/nepali-food");
		WebElement hover = driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/section/nav/div/div/ul/li[1]/a"));
		//hover over method
		//intantiate the action class
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		
		driver.findElement(By.cssSelector("#desktop-menu-0-1 > li:nth-child(3) > a")).click();
		driver.quit();
	}

}
