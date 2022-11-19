package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://app.honeypot.io/users/login");
		
		driver.findElement(By.id("user_email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("Honeypot");
		driver.findElement(By.cssSelector("button[title='Log in']")).click();
		
		

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(actualTitle.equals("Honeypot - The Developer-Focused Job Platform"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.close();

	}

}
