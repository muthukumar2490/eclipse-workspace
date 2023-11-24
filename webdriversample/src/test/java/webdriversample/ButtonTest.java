package webdriversample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonTest extends runner {

	public ButtonTest(WebDriver driver) {
		driver = runner.setup();
		driver.get("https://formy-project.herokuapp.com/buttons");
		WebElement button = driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-lg btn-info']"));
		button.click();
		System.out.println(button.getText());
		runner.teardown(driver);
	}
}
