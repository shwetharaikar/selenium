package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {

		// Open the browser
		WebDriver driver =  new ChromeDriver();
				
		//maximize the browser
		driver.manage().window().maximize();
			
		//Go to the url
		driver.get("https://demoapp.skillrary.com/");
		
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.id("last")).click();
		
	
		
	}

}
