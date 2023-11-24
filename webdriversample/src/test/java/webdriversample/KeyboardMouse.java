package webdriversample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouse extends runner{

	public KeyboardMouse (WebDriver driver) {
		driver = runner.setup();
		
		driver.get("https://formy-project.herokuapp.com/keypress");
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(name).click().sendKeys("Ashvik Ram").build().perform();
		WebElement button = driver.findElement(By.xpath("//button[@id='button']"));
		button.click();
		
		System.out.println(driver.getCurrentUrl());
		
		runner.teardown(driver);
		
	}

}
