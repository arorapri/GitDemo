package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	 public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver = driver;
	}

	

	//By signin = By.cssSelector("a[href* ='sign_in']");
	By signin = By.cssSelector("i[class*='fa fa-lock fa-lg']");
	//fa fa-lock fa-lg
	
	By Title = By.xpath("//div[@class='text-center']");
	By Navigation = By.xpath("//ul[contains(@class,'navbar-right')]");
	
	public WebElement getlogin() 
	{
       return driver.findElement(signin);
   
    
	}
	
	public WebElement gettitle() 
	{
       return driver.findElement(Title);
   
    
	}
	
	public WebElement getNavigationbar() 
	{
       return driver.findElement(Navigation);
   
    
	}

}