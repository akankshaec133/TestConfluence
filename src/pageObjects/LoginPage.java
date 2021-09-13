package pageObjects;

import common.PropertiesLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

	static PropertiesLoader prop = PropertiesLoader.getInstance();

	public WebDriver driver;
	public WebDriverWait wait;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait=new WebDriverWait(driver,20);
	}

	public void enterWarriorName(String title) throws InterruptedException {
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(prop.getProperty("warriorName").trim())));
		driver.findElement(By.id(prop.getProperty("warriorName").trim())).sendKeys(title);
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("create").trim())).click();
	}

	public void clickStart() throws InterruptedException {

		driver.findElement(By.xpath(prop.getProperty("start").trim())).click();
	}

}
