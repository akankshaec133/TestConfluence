package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverLoader {

	static PropertiesLoader prop = PropertiesLoader.getInstance();

	public static WebDriver driver;
	public static WebDriverWait wait;

	public  void launchBrowser(String url){

		String driverPath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
		System.out.println("current chrome driver dir = " + driverPath);

		System.setProperty("webdriver.chrome.driver",driverPath);  
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
	}

	public WebDriver returnDriver(){
		return driver;
	}

}
