package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in/");
			
			WebElement textbox = driver.findElement(By.id("twotabsearchtextbox"));
			
			textbox.sendKeys("books");
			
			Thread.sleep(3000);
			
			List<WebElement> textOptions = driver.findElements(By.xpath("//span[contains(@class, 's-heavy')]"));	
			
			System.out.println("Total numbers: " +textOptions.size());
			
			for(WebElement x :textOptions)
			{
				System.out.println(x.getText());
			}
			
			
			

	}

}
