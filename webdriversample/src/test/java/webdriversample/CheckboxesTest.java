package webdriversample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxesTest extends runner {
	CheckboxesTest(WebDriver driver) {
		
		driver = runner.setup();
		driver.get("https://formy-project.herokuapp.com/checkbox");
		WebElement checkbox=driver.findElement(By.id("checkbox-2"));
		checkbox.click();
		System.out.println(checkbox.getTagName());
		runner.teardown(driver);
	}

}
