package Webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/welcome-to-myntra");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement btn = driver.findElement(By.cssSelector("div[class='submitBottomOption']"));
		
		if(btn.isEnabled())
		{
			System.out.println("Pass: continue button is enabled"); //first checking
			btn.click();  // then performing
		}
		
		else
			System.out.println("Fail: Continue button is not enabled");

	}

}
