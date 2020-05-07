package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ValidateTest extends Base {
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializedriver();
		log.info("driver is initialized");
		//driver.get(prop.getProperty("url"));
		driver.get("http://qaclickacademy.com");
		log.info("driver is navigated to home page");
	}

	
	@Test
	public void HomepageNav() throws IOException
	{
		
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.txt().getText(), "FEATURED COURSES");
		
		System.out.println("Pass");
		log.info("Successfully navigated");
		
		System.out.println(l.gettt().getText());
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
