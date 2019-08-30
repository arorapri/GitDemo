
package Academy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pageObjects.LandingPage;

import resources.Base;

public class ValidateTitle extends Base{
	
	private static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void prerequisite() throws IOException
	{
		driver = InitializeDriver();
		log.info("driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to home page");
		
	}

	@Test
	public void baseValidation() throws IOException 
	
	{
		// TODO Auto-generated method stub
		
		log.info("driver is initialize");
		LandingPage lp = new LandingPage(driver);
		//Assert.assertEquals(lp.gettext(), "Featured Courses");
		
		//compare the text from browser with actual value
		Assert.assertEquals(lp.gettitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated text msg");
		Assert.assertTrue(lp.getNavigationbar().isDisplayed());
	
	}
	
	@AfterTest
	public void tear() {
		driver.close();
		driver = null;
		
	}
	

}
