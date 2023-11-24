package webdriversample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest extends runner {

	public DragAndDropTest(WebDriver driver) {
		driver = runner.setup();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		WebElement image = driver.findElement(By.id("image"));
		WebElement box = driver.findElement(By.id("box"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(image, box).build().perform();
		System.out.println(driver.getCurrentUrl());
		runner.teardown(driver);

	}

}
