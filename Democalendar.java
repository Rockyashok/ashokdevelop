package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democalendar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Downloads\\senelium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		WebElement calen=driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']"));
		calen.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[text()='21']")).click();
		Thread.sleep(1000);
		WebElement from=driver.findElement(By.xpath("//input[@id='src']"));
		from.sendKeys("Chennai");
		Thread.sleep(1000);
		WebElement to=driver.findElement(By.xpath("//input[@id='dest']"));
		to.sendKeys("Kumbakonam");
		Thread.sleep(1000);
		driver.findElement(By.id("search_btn")).click();
		driver.quit();
	}

}
