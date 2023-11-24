package webdriversample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageScrollTest extends runner {

	public PageScrollTest(WebDriver driver) throws InterruptedException {
		driver = runner.setup();
		driver.get("https://formy-project.herokuapp.com/scroll");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,50);", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,50);", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,50);", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,50);", "");
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].scrollIntoView();", name);
		Thread.sleep(2000);
		
		
		
		
		runner.teardown(driver);
	}

}
