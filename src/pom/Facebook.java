package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	
	//declaration
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	//initialization
	
	public Facebook(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public void userName(String un) {
		username.sendKeys(un);
	}
	
	public void pass(String ps) {
		password.sendKeys(ps);
	}
	
	public void loginmethod() {
		login.click();
	}
	
	

}
