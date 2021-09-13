package pageObjects;

import common.PropertiesLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class checkLeaderBoard {

	static PropertiesLoader prop = PropertiesLoader.getInstance();

	public WebDriver driver;
	public WebDriverWait wait;
	public checkLeaderBoard(WebDriver driver) {
		this.driver = driver;
		this.wait=new WebDriverWait(driver,20);
	}

	public void checkScore(String name) throws InterruptedException {

		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("showData")));
		List<WebElement> col = driver.findElements(By.xpath(prop.getProperty("rowUser").trim()));
		List<WebElement> rows = driver.findElements(By.xpath(prop.getProperty("colUser").trim()));
		int rowIndex=0;

	WebElement table = driver.findElement(By.id("showData"));
	List<WebElement> row1 = table.findElements(By.tagName("tr"));

		for(int i=1;i<= rows.size();i++){
			List<WebElement> cols = row1.get(i).findElements(By.tagName("td"));
			String cell1 = cols.get(1).getText();
			if(cell1.trim().equalsIgnoreCase(name)){
				System.out.println("The user created is " + cell1);
				rowIndex = i ;
				break;
			}
		}

	List<WebElement> cols = row1.get(rowIndex).findElements(By.tagName("td"));
	String cell = cols.get(2).getText();
		System.out.println("Hurrayy!!! Your score is: " + cell);
		driver.close();
}

	}




