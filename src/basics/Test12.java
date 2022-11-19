package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("input[class='err-border']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	}

}
