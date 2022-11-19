package actions;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

	
		  ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications"); 
		 options.addArguments("disable-extensions");
		  options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blockings"));
		  WebDriver driver = new ChromeDriver(options);
		 

		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement mouseHovr = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));

		Actions a = new Actions(driver);
		a.moveToElement(mouseHovr).perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath("(//a[text()='Ethnic Wear'])[1]")).click();

	}

}
