package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement from = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span"));
		from.sendKeys("New York");
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
		
		if (from.equals("fromCity")) {
			System.out.println("Test Pass 1");
		}else {
			System.out.println("Test Fail 1");
		}
		
		WebElement to =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/label/span"));
		to.sendKeys("Kathmandu");
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
		
		if (to.equals("toCity")) {
			System.out.println("Test Pass 2");
		}else {
			System.out.println("Test Fail 2");
		}
		
		WebElement departure = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/label"));
		departure.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[5]")).click();
	
		if (departure.equals("departure")) {
			System.out.println("Test Pass 3");
		}else {
			System.out.println("Test Fail 3");
		}
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a")).click();
		System.out.println(driver.getTitle());
	}

}
