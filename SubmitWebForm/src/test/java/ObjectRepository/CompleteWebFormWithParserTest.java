package ObjectRepository;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import webdriversample.runner;

public class CompleteWebFormWithParserTest extends runner {

	public CompleteWebFormWithParserTest(WebDriver driver) throws InterruptedException, IOException {
		driver = runner.setup();
		
		driver.get("https://formy-project.herokuapp.com/form");
		//initialize web elements
		RepositoryParser repositoryParser = new  RepositoryParser();
		Thread.sleep(1000);
		WebElement fn = driver.findElement(repositoryParser.getLocatorTypeValue("fn"));
		Thread.sleep(1000);
		WebElement ln = driver.findElement(repositoryParser.getLocatorTypeValue("ln"));
		Thread.sleep(1000);
		WebElement JobTitle = driver.findElement(repositoryParser.getLocatorTypeValue("JobTitle"));
		WebElement education = driver.findElement(repositoryParser.getLocatorTypeValue("education"));
		WebElement gender = driver.findElement(repositoryParser.getLocatorTypeValue("gender"));
		WebElement exp = driver.findElement(repositoryParser.getLocatorTypeValue("exp"));
		WebElement date = driver.findElement(repositoryParser.getLocatorTypeValue("date"));
		WebElement submitbtn = driver.findElement(repositoryParser.getLocatorTypeValue("submitbtn"));
		
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
