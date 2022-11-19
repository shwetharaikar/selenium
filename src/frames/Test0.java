package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		WebElement mousehover = driver.findElement(By.xpath("//div[@class='accountInner']"));
		
		Actions  a= new Actions(driver);
		a.moveToElement(mousehover).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("userName")).sendKeys("1234567890");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@style='color: #cdcece;']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("keyword")).sendKeys("phone");
	

	}

}
