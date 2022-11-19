package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step1: Typecasting
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//Step2: access the method
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Step3: specify the location
		File dest = new File("./photo/skillrary.png");
		
		//Step4: copy paste from src to dst
		FileUtils.copyFile(src, dest);
		
		driver.close();
		
		
	}
	
	

}
