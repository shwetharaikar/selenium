package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dropDown);
		s.selectByIndex(5);
		Thread.sleep(2000);
		
		s.selectByValue("search-alias=office-products");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Software");
		
		

		
		
	}

}
