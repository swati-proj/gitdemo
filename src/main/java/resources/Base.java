package resources;

import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Base {
	public static WebDriver driver; 
	public Properties prop;
	public WebDriver initializedriver() throws IOException
	{
		 prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browsername= prop.getProperty("browser");
		System.out.println(browsername);
		if(browsername.equals("chrome"))
		{
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32_80v\\chromedriver.exe");
		  driver= new ChromeDriver();
		}
		else
		{
		  System.setProperty("webdriver.chrome.driver","C:\\IEDriverServer_win64\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

	
	public void getScreenshot(String result) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Screenshots\\"+result+"screenshot.png"));

	}
}
