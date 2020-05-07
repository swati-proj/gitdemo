package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

public WebDriver driver;
	
	//By signin = By.xpath("//a[contains(@href,'sign_in')]");
	By Email  = By.id("user_email");
	By pwd 	  = By.id("user_password");
	By go     = By.cssSelector("input[class*='login-button']");
	By text   = By.xpath("//div[@class='alert alert-danger']");
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	
	public WebElement pwd()
	{
		return driver.findElement(pwd);
	}
	
	public WebElement go()
	{
		return driver.findElement(go);
	}
	
	public WebElement text()
	{
		return driver.findElement(text);
	}
}
