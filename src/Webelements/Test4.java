package Webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchLogin = driver.findElement(By.name("login"));
		
		Dimension size = searchLogin.getSize();
		
		System.out.println("Height of login button is: "+ size.getHeight());
		System.out.println("Width of login button is: "+ size.getWidth());
		
		driver.close();
		
	}

}
