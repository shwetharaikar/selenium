package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Open the browser
		WebDriver driver =  new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Go to the url
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("123456");
		driver.findElement(By.id("did_submit")).click();
		
		
	}

}
