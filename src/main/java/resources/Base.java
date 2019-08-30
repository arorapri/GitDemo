package resources;


import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public  WebDriver driver;
	public Properties prop;

	public WebDriver InitializeDriver() throws IOException {
		
	    prop = new Properties();
		FileInputStream file = new FileInputStream("//Users//priyanka//MavenProject1//src//main//java//resources//Data.properties");
		prop.load(file);
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
			driver = new ChromeDriver();

		}

		else if (browsername.equalsIgnoreCase("internet explorer")){
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/edgedriver");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		return driver;

	
	}
	
	public void getscreenshot() throws IOException {
		
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


	FileUtils.copyFile(src, new File("//Users//Priyanka//listeners" + result +"//Maven.png "));
	
	}

}
