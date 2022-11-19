package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sso.godaddy.com/");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mylogin");
		driver.findElement(By.xpath("(//input[@aria-required='true'])[2]")).sendKeys("dsd");
		
		driver.findElement(By.id("submitBtn")).click();
		
		
	
		if((driver.getTitle()).equals("Sign In")) 
				System.out.println("Pass: Correct Title");
		else 
			System.out.println("Fail: Wrong title");
		
		if((driver.getCurrentUrl()).equals("https://sso.godaddy.com/"))
				System.out.println("Pass: Correct Url");
		else
			System.out.println("Fail: Wrong Url");
		
		driver.close();
		
	}

}
