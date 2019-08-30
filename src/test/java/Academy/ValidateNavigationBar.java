
package Academy;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
import java.io.IOException;

import pageObjects.LandingPage;

import resources.Base;

public class ValidateNavigationBar extends Base{
	
	private static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void prerequisite() throws IOException
	{
		driver = InitializeDriver();
		
		driver.get(prop.getProperty("url"));
		
	}

	@Test
	public void baseValidation() throws IOException 
	
	{
		// TODO Auto-generated method stub
		
		//Assert.assertEquals(lp.gettext(), "Featured Courses");
		LandingPage lp = new LandingPage(driver);
	
		//compare the text from browser with actual value
	
		AssertJUnit.assertTrue(lp.getNavigationbar().isDisplayed());
		log.info("Navigation bar is displayed");
		AssertJUnit.assertFalse(false);
	}
	
	@AfterTest
	public void tear() {
		driver.close();
		driver = null;
		
	}
	

}
