package Webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement emailField = driver.findElement(By.id("email"));
		
		Point getLoc = emailField.getLocation();
		
		System.out.println("X Co-ordinate is: " + getLoc.getX());
		System.out.println("Y Co-ordinate is: " + getLoc.getY());
		
		driver.close();


	}

}
