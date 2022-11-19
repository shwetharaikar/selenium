package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement dateDropd = driver.findElement(By.id("day"));	
		Select s = new Select(dateDropd);
		s.selectByValue("20");
		
		WebElement monthDropd = driver.findElement(By.id("month"));		
		Select s1 = new Select(monthDropd);
		s1.selectByVisibleText("Apr");
		
		WebElement yearDropd = driver.findElement(By.id("year"));		
		Select s2 = new Select(yearDropd);
		s2.selectByVisibleText("1994");
		
		
		
	}

}
