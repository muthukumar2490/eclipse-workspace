package webdriversample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertTest extends runner {

	public AlertTest(WebDriver driver) {

		driver = runner.setup();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement cusid = driver.findElement(By.name("cusid"));
		cusid.sendKeys("10000");
		
		WebElement button = driver.findElement(By.name("submit"));
		button.click();
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		System.out.println(driver.getCurrentUrl());
		
		runner.teardown(driver);
		
		
	}

}
