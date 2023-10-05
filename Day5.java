package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
	
		//getTitle 
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("test 1 pass");
		}else {
			System.out.println("test 1 fail");
		}
		
		//getCurrentUrl
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement title = driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div"));
		
		if(title.isDisplayed()) {
			System.out.println("Test 2 Pass");
		}else {
			System.out.println("Test  2Fail");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//findElement
		driver.get("https://www.saucedemo.com/");
		
		String expectedElement ="#item_4_title_link";
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		boolean actualElement = driver.equals(expectedElement);
		if (expectedElement.equals(actualElement)) {
			System.out.println("test 3 pass");
		}else {
			System.out.println("test 3 fail");
		}
		
		//findElements
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement> totalItems = driver.findElements(By.cssSelector("#item_4_title_link > div"));

		for(int i = 0 ; i < totalItems.size() ; i++) {
			System.out.println(totalItems);
			}
//		for (WebElement items : totalItems) {
//			System.out.println("total:"+items.getText());
//		}
		
	}

}
