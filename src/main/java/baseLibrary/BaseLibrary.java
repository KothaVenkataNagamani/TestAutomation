package baseLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseLibrary {

	public WebDriver driver;
	public Properties prop;
	
	@BeforeSuite
	public void invokeBrowser() throws Throwable {
		readProperties();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void readProperties() throws Throwable {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\sbatchu1\\eclipse-workspace\\TobeDeleted\\TestAutomation\\Properties.properties"));
		prop = new Properties();
		prop.load(fis);
	}
}
