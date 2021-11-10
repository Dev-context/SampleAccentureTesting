package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BaseClases {
	
	public String userdir;
	public static WebDriver driver;
	
	
	public void setDriver() {
		userdir=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",userdir+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
	}
	
	
	public void navegateTo() {
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		
		
   
	}
	
	
	public void closeDriver() {
		driver.close();
	}

}
