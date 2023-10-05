package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day6Test {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
//		1)Validate title of page 
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		String expectedTitle="WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)";
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		if(titleOfPage.equals(expectedTitle)) {
		System.out.println("Test title passed.");
		}else {
			System.out.println("test title fail");
		}
		
//		2)Select all the check boxes and assert whether they are checked
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox1 = driver.findElement(By.cssSelector("input[value=\"option-1\"]"));
		WebElement checkbox2 = driver.findElement(By.cssSelector("input[value=\"option-2\"]"));
		//driver.findElement(By.cssSelector("")).click();
		WebElement checkbox4 = driver.findElement(By.cssSelector("input[value=\"option-4\"]"));
		checkbox1.click();
		checkbox2.click();
		checkbox4.click();
		boolean a1 = checkbox1.isSelected();
		boolean a2 = checkbox2.isSelected();
		boolean a3 = checkbox4.isSelected();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
//		List<WebElement> checkbox = driver.findElements(By.cssSelector("#checkboxes"));
//		for (WebElement checkboxes : checkbox) {
//			if (checkboxes.equals(checkbox)) {
//				checkboxes.click();
//				System.out.println("checkbox pass.");
//			}else {
//				System.out.println("checkbox fail.");
//			}
//		}
		//try this code
//		for(int i=0; i<checkbox.size(); i++)        
//	    {   
//	String value = checkbox.get(i).getAttribute("checkbox");
//	 
//	if (value.equalsIgnoreCase("option-4"))
//	   
//	{       
//	 //perform action on checkbox which have value as orange
//	 break;
//	}}
		
		
//		3)Select orange a radio button and asset whether it is checked
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButton = driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(7)"));
		radioButton.click();
		if(radioButton.isSelected()) {
			System.out.println("test click pass");
		}
		else {
			System.out.println("test click fail");
		}
		
//		4)From first Drop down select python and assert
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		Select select  = new Select(driver.findElement(By.cssSelector("#dropdowm-menu-1")));
		select.selectByVisibleText("Python");
		
		String selectPython = select.getFirstSelectedOption().getText();
		if (selectPython.equals("Python")) {
			System.out.println("test dropdown pass ");
		}else {
			System.out.println("test dropdown fail");
		}
		
//		5)Validate the heading of the page
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement head = driver.findElement(By.cssSelector("#main-header > h1"));
		String titleHead = head.getText();
		if (titleHead.equals(head.getText())) {
			System.out.println("test heading pass");
		}else {
			System.out.println("test heading fail");
		
	}

}
}