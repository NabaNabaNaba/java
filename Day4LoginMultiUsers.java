package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4LoginMultiUsers {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//creating arr for multiple user and password
		String arr[][]= { {"standard_user","performance_glitch_user","problem_user","locked_out_user"} , 
				{"secret_sauce","secret_sauce","secret_sauce","secret_sauce"} };

		//Then write code and logout current login user:-

		for(int i=0; i<arr.length-1 ; i++){

		for(int j=0;j<arr.length;j++) {
		
		

		//Find Login button     
			
			driver.findElement(By.cssSelector("#user-name")).sendKeys(arr[i][j]);

			driver.findElement(By.cssSelector("#password")).sendKeys(arr[i+1][j]);

		//Click on Submit button
			driver.findElement(By.cssSelector("#login-button")).click();

		//Log out
		driver.findElement(By.cssSelector("#react-burger-menu-btn")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click(); 
			
		        }    
		    }
		System.out.println("Test pass");
	}

}
