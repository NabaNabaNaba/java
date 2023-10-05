package one;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9WindowHandleIteratr {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//program1
		
		driver.findElement(By.cssSelector("#newWindowBtn")).click();
		//handling main window
		String parentWin = driver.getWindowHandle();
		//handling multiple windows
		Set<String> windows = driver.getWindowHandles();
		Iterator <String> handle = windows.iterator();
		
		//String childWin = handle.next();
		
		if(driver.getTitle().equals("Window Handles Practice - H Y R Tutorials")) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		//program 2
		driver.switchTo().window(parentWin);
		driver.findElement(By.cssSelector("#newWindowBtn")).click();
		driver.findElement(By.cssSelector("#newTabBtn")).click();
		driver.findElement(By.cssSelector("#newWindowsBtn")).click();
		driver.findElement(By.cssSelector("#newTabsBtn")).click();
		driver.findElement(By.cssSelector("#newTabsWindowsBtn")).click();
		
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> itr = allWindow.iterator();
		
		while(itr.hasNext()) {
			String windowId = itr.next();
			driver.switchTo().window(windowId);
			if(driver.getTitle().equals("Window Handles Practice - H Y R Tutorials")) {
				System.out.println(driver.getTitle());
				System.out.println("Test case  pass");
				break;
			}
			
		}
			
		}
	}


