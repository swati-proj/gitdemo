package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomepageTest extends Base {
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializedriver();
		//driver.get(prop.getProperty("url"));
		driver.get("http://qaclickacademy.com");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		data[0][0] = "nonrestricted@g.com";
		data[0][1] = "Test@123";
		data[0][2] = "nonrestricteduser";
		
		data[1][0] = "restricted@g.com";
		data[1][1] = "Test@456";
		data[1][2] = "restricteduser";
		
		return data;
	}
	
	
	@Test(dataProvider="getData")
	public void HomepageNav(String usn,String pswd,String text) throws IOException
	{
		driver.get("http://qaclickacademy.com");
		LandingPage l = new LandingPage(driver);
		l.Login().click();
		LoginPage lp = new LoginPage(driver);
		lp.Email().sendKeys(usn);
		lp.pwd().sendKeys(pswd);
		System.out.println(text);
		lp.go().click();
		System.out.println(lp.text().getText());
		log.info("Successfully navigated");
	
	}
	

	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
