package one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11PropertiesFile {

	public static void main(String[] args){
		
		//creating object of properties
		Properties prop1 = new Properties();
		//getting path form config.properties file
		String filePath = "/Users/nabarajkhatiwada/Desktop/sandeep qa folder/SeleniumQA12/src/one/config.properties";
		
		//creating try catch 
		try {
			FileInputStream fileInput = new FileInputStream(filePath);
			//loading the file from config.properties
			prop1.load(fileInput);
			//storing in variable of all getting data from config.properties
			String url = prop1.getProperty("baseUrl");
			String browser =prop1.getProperty("browser");
			String uName = prop1.getProperty("userName");
			String pass = prop1.getProperty("password");
			
			//script for writing key and value in config.properties file according to requirement
						prop1.put("email", "email@gmail.com");
						FileOutputStream outputStrem = new FileOutputStream(filePath);
						// Storing the properties file
						prop1.store(outputStrem, "This is a sample properties file");
						
			
			//script for login functionality in if else block
			if (browser.equals("chrome")) {
				ChromeDriver driver = new ChromeDriver();
				driver.get(url);
				driver.findElement(By.cssSelector("#user-name")).sendKeys(uName);
				driver.findElement(By.cssSelector("#password")).sendKeys(pass);
				driver.findElement(By.cssSelector("#login-button")).click();
				
			//assertion for login functionality
				if (driver.getCurrentUrl().contains("inventory")) {
					System.out.println("test pass for login");
				}
				else {
					System.out.println("test fail for login");
				}
			}
			else if (browser.equals("firefox")) {
				//we have to setup browser like chrome -:FirefoxDriver driver = new FirefoxDriver();
			}
			else if(browser.equals("edge")) {
				//we have to setup browser like chrome -:EdgeDriver driver = new EdgeDriver();
			}
				
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {

			e.printStackTrace();
	}

}
}
