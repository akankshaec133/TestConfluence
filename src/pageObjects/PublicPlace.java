package pageObjects;

import common.PropertiesLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PublicPlace {

	static PropertiesLoader prop = PropertiesLoader.getInstance();

	public WebDriver driver;
	public WebDriverWait wait;
	public PublicPlace(WebDriver driver) {
		this.driver = driver;
		this.wait=new WebDriverWait(driver,20);
	}	

	public void selectPublicPlace() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(prop.getProperty("publicPlace").trim())));
		driver.findElement(By.id(prop.getProperty("publicPlace").trim())).click();
		Thread.sleep(2000);
		driver.findElement(By.id(prop.getProperty("startPublicPlace").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("publicAnswer1").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("leadershipContinue").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("leadershipContinue").trim())).click();
	}



}
