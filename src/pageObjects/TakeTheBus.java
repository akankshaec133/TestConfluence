package pageObjects;

import common.PropertiesLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeTheBus {

	static PropertiesLoader prop = PropertiesLoader.getInstance();

	public WebDriver driver;
	public WebDriverWait wait;
	public TakeTheBus(WebDriver driver) {
		this.driver = driver;
		this.wait=new WebDriverWait(driver,20);
	}

	public void selectTakeTheBus() throws InterruptedException {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(prop.getProperty("bus").trim())));
		driver.findElement(By.id(prop.getProperty("bus").trim())).click();
		Thread.sleep(2000);
		driver.findElement(By.id(prop.getProperty("startBusGame").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("busAnswer1").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("leadershipContinue").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("leadershipContinue").trim())).click();
	}



}
