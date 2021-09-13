package pageObjects;

import common.PropertiesLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Office {

	static PropertiesLoader prop = PropertiesLoader.getInstance();

	public WebDriver driver;
	public WebDriverWait wait;
	public Office(WebDriver driver) {
		this.driver = driver;
		this.wait=new WebDriverWait(driver,20);
	}	

	public void selectOffice() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(prop.getProperty("goToOffice").trim())));
		driver.findElement(By.id(prop.getProperty("goToOffice").trim())).click();
		Thread.sleep(2000);
		driver.findElement(By.id(prop.getProperty("startGame").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("officeAnswer1").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("leadershipContinue").trim())).click();
		Thread.sleep(1000);
	}



}
