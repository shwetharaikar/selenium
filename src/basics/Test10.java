package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[contains(@class, '_2KpZ6l _2doB4z')]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 13 (Blue, 128 GB)')]")).click();
		
		Thread.sleep(5000);
		System.out.println("aaaaaaaaaaaaaaaaaaaa");
		/*String price = driver.findElement(By.xpath("//span[@class='B_NuCI']/../../../div[4]/div[1]/div[1]/div[1]")).getText();
		System.out.println(price);
		
		if(price.equals("₹73,999"))
			System.out.println("Pass");*/
		
		 WebElement price = driver.findElement(By.xpath("//div[@class='aMaAEs']//div[4]//div[1]/div[1]/div[1]"));
		String dis = price.getText();
		System.out.println(dis);
		
		if(price.equals("73,999")) {
			System.out.println("Pass");
		}
		else
			System.out.println("fail");
		
		
		driver.close();
	}

}
