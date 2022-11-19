package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement plusbtn = driver.findElement(By.id("course"));
		
		Actions a = new Actions(driver);
		a.moveToElement(plusbtn).perform();	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		
		WebElement doublclk = driver.findElement(By.id("add"));
		
		a.doubleClick(doublclk).perform();
		
		
		
	}

}
