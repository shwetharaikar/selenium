package autoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb = driver.findElement(By.cssSelector("input[class='desktop-searchBar']"));
		
		searchtb.sendKeys("handbag");
		
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.xpath("//li[contains(@class, 'desktop-suggestion')]"));
		System.out.println(options.size());
		
		for(WebElement x :options)
		{
			System.out.println(x.getText());
		}

	}

}
