package pageObjects;

import common.PropertiesLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AreYouGame {

	static PropertiesLoader prop = PropertiesLoader.getInstance();

	public WebDriver driver;
	public WebDriverWait wait;
	public AreYouGame(WebDriver driver) {
		this.driver = driver;
		this.wait=new WebDriverWait(driver,20);
	}	

	public void selectAreUGame() throws InterruptedException {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(prop.getProperty("areUGame").trim())));
		driver.findElement(By.id(prop.getProperty("areUGame").trim())).click();
		Thread.sleep(2000);
		driver.findElement(By.id(prop.getProperty("startGame").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("answer1").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("continue").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("answer1").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("continue").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("answer1").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("continue").trim())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(prop.getProperty("leadershipContinue").trim())).click();
	}



}
