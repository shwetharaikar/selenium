package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.de/-/en/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Thread.sleep(5000);
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dropDown);
		
		List<WebElement> allList = s.getOptions();
		System.out.println(allList.size());
		
		for(WebElement x:allList)
		{
			System.out.println(x.getText());
		}

	}

}
