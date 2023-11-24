package webdriversample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown extends runner {

	public Dropdown(WebDriver driver) throws InterruptedException {
		driver = runner.setup();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.name("country"));
//		country.click();

		Select select = new Select(country);
		select.selectByVisibleText("ARMENIA");
		Thread.sleep(2000);

		System.out.println(driver.getCurrentUrl());
		runner.teardown(driver);
	}

}
