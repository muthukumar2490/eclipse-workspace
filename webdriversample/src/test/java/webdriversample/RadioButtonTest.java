package webdriversample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonTest extends runner {

	public RadioButtonTest(WebDriver driver) throws InterruptedException {

		driver = runner.setup();

		driver.get("https://formy-project.herokuapp.com/radiobutton");
		WebElement radiobtn = driver.findElement(By.xpath("//*[@value='option2']"));
		radiobtn.click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		
		runner.teardown(driver);
	}

}
