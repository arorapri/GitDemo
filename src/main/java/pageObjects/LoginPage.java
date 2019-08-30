package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LoginPage {

	
	WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By emailid = By.id("user_email");
	By password = By.cssSelector("input[type='password']");
	By login = By.cssSelector("input[name='commit']");
	
	public WebElement getemail() {
		return driver.findElement(emailid);
	}
	public WebElement getpaswd() {
		return driver.findElement(password);
	}

	public WebElement login() {
		return driver.findElement(login);
	}
	

}
