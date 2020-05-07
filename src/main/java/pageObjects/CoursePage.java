package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoursePage {
	private static final int List = 0;

	private static final int WebElement = 0;

	public WebDriver driver;

	By allcourse = By.cssSelector("nav[class*='main']");

	public CoursePage(WebDriver driver) 
	{	
		this.driver = driver;
	}
	
	public java.util.List<org.openqa.selenium.WebElement> getAllCourse()
	{
		return  driver.findElements(allcourse);
	}
	
	
	
	
}
