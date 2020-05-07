package Academy;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.Base;
import pageObjects.CoursePage;
import pageObjects.LandingPage;

public class ValidateCourseTest extends Base {
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializedriver();
		
		//driver.get(prop.getProperty("url"));
		driver.get("http://qaclickacademy.com");
		
	}
	
	
	@Test
	public void validateCourse()
	{
		LandingPage l = new LandingPage(driver);
		l.getcourse().click();
		CoursePage c = new CoursePage(driver);
		List<WebElement> total = c.getAllCourse();
		System.out.println(total);
		
	}
	
	


	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}

}
