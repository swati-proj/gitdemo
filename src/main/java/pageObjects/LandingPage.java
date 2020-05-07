package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;
	
	By signin = By.xpath("//a[contains(@href,'sign_in')]");
	By Email  = By.id("user_email");
	By pwd 	  = By.id("user_password");
	By go     = By.cssSelector("input[class*='login-button']");
	By txt    = By.xpath("//*[@id=\"content\"]/div/div/h2");
	By course = By.xpath("//a[contains(@href,'rahulshetty')]");
	
	By tt    = By.cssSelector("div[class*='video-banner'] p");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement Login()
	{
		return driver.findElement(signin);
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
	
	public WebElement txt()
	{
		return driver.findElement(txt);
	}
	
	public WebElement getcourse()
	{
		return driver.findElement(course);
	}
	
	
	public WebElement gettt()
	{
		return driver.findElement(tt);
	}
	
	
	
}
