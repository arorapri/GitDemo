package Academy;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


public class Homepage extends Base{

	private static Logger log = LogManager.getLogger(Base.class.getName());
	@Test(dataProvider="getdata")
	public void basePageNavigation(String email,String paswd,String text) throws IOException 
	
	{
		// TODO Auto-generated method stub
		
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		//Assert.assertEquals(lp.gettitle(), "Featured Courses");
		lp.getlogin().click();
		LoginPage lo = new LoginPage(driver);
		lo.getemail().clear();
		lo.getemail().sendKeys(email);
		lo.getpaswd().clear();
		lo.getpaswd().sendKeys(paswd);
		//System.out.println(text);
		log.info(text);
		lo.login().click();

	}
	

	@BeforeTest
	public void prerequisite() throws IOException
	{
		
		driver = InitializeDriver();
		
		
	}
	
	@AfterTest
	public void tear() {
		driver.close();
		driver=null;
		
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] ds = new Object[2][3];
		ds[0][0] = "arora.priyanka2014@gmail.com";
		ds[0][1]= "1234";
		ds[0][2]="Restricted User";
				
		ds[1][0] = "nonrestricteduser@gmail.com";
		ds[1][1]= "526634";
		ds[1][2]="Non Restricted User";
		return ds;
		
	}

}
