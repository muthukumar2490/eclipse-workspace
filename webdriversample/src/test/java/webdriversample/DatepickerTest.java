package webdriversample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatepickerTest {

	public DatepickerTest(WebDriver driver) {
			driver = runner.setup();
			driver.get("https://formy-project.herokuapp.com/datepicker");
			WebElement datepicker = driver.findElement(By.id("datepicker"));
			datepicker.sendKeys("11/24/2023");
			System.out.println(driver.getTitle());
			runner.teardown(driver);
		
	}

}
