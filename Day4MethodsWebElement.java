package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4MethodsWebElement {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//WebElement methods:
		//getText()
		WebElement get1 = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		System.out.println(get1.getText());
		
		//getTagName()
		WebElement get2 = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		System.out.println(get2.getTagName());
		
		//getAtribute()
		WebElement get3 = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		System.out.println(get3.getAttribute("class"));
		
		//getSize() /stores in Dimension /font height and weight
		WebElement get4 = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		System.out.println(get4.getSize());
		
		//getCssValue()/fontSize/color/need to pass value
		WebElement get5 = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		System.out.println(get5.getCssValue("font-size"));//size of element text
		System.out.println(get5.getCssValue("color"));//color of element text
		System.out.println(get5.getCssValue("font-family"));//type of element text
		System.out.println(get5.getCssValue("font-style"));//style of element text
		
		//getLocation()/returns Point/what location on the page of element
		WebElement get6 = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		System.out.println(get6.getLocation());
		
		driver.quit();

	}

}
