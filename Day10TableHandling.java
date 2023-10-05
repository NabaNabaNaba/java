package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10TableHandling {

	public static void main(String[] args) {
		
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
			//finding total number of tables
			List<WebElement> tables =driver.findElements(By.xpath("//*[table]"));
			System.out.println(tables.size());
			
			//finding total number of rows
			
			List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
			int r = rows.size();
			System.out.println(r);
			
			//finding total number of columns
			
			List<WebElement> columns= driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr/th"));
			int c = columns.size();
			System.out.println(c);
			
			for (WebElement eleT : columns) {
				System.out.println(eleT.getText());
			}
			
			//try program 2
			int row = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr")).size();
			int column= driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr/th")).size();
			for (int i =0;i<=row;i++) {
				for (int j = 0;j<=column;j++) {
					WebElement abc = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[3]/td[3]"));
					System.out.println(abc.getText());
					break;
				}
			}
	}

}
