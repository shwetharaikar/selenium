package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)");
		
		
		
		driver.findElement(By.name("B3")).click();
		//driver.findElement(By.xpath("//input[@value='Click here for output>>']")).click();
		Thread.sleep(5000);
		Alert al = driver.switchTo().alert();
		
		Thread.sleep(5000);
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(5000);
		al.accept();
		
		
		
		
		
		
	}

}
