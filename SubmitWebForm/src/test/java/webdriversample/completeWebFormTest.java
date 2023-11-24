package webdriversample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class completeWebFormTest extends runner {

	public completeWebFormTest(WebDriver driver) throws InterruptedException {
		driver = runner.setup();
		
		driver.get("https://formy-project.herokuapp.com/form");
		//initialize web elements
		WebElement fn = driver.findElement(By.id("first-name"));
		WebElement ln = driver.findElement(By.id("last-name"));
		WebElement JobTitle = driver.findElement(By.id("job-title"));
		WebElement education = driver.findElement(By.id("radio-button-1"));
		WebElement gender = driver.findElement(By.id("checkbox-1"));
		WebElement exp = driver.findElement(By.id("select-menu"));
		WebElement date = driver.findElement(By.id("datepicker"));
		WebElement submitbtn = driver.findElement(By.xpath("//a[contains(text(),'Submit')]"));
		
		Thread.sleep(1000);
		fn.sendKeys("Ashvik Ram");
		Thread.sleep(1000);
		ln.sendKeys("Muthukumar");
		Thread.sleep(1000);
		JobTitle.sendKeys("Junior Student");
		Thread.sleep(1000);
		education.click();
		Thread.sleep(1000);
		gender.click();
		Thread.sleep(1000);
		
		Select ex = new Select(exp);
		ex.selectByIndex(1);
		Thread.sleep(1000);
		
		date.sendKeys("25/11/23");
		Thread.sleep(1000);
		submitbtn.click();
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		
		runner.teardown(driver);
		
		
	}

}
