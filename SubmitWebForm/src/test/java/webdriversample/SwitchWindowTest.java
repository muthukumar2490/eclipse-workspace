package webdriversample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchWindowTest extends runner {

	public SwitchWindowTest(WebDriver driver) throws InterruptedException {
		driver = runner.setup();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		WebElement newtab = driver.findElement(By.id("new-tab-button"));
		
		System.out.println(driver.getTitle());
		String currentwindow = driver.getWindowHandle();
		System.out.println(currentwindow);
		newtab.click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		String childwindow;
		while (it.hasNext()) {
			System.out.println(it.next());
			childwindow = it.next();
			if (!(currentwindow.equalsIgnoreCase(childwindow))) {
				Thread.sleep(3000);
				driver.switchTo().window(childwindow);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(currentwindow);
		Thread.sleep(3000);
		WebElement alertbtn = driver.findElement(By.id("alert-button"));
		Thread.sleep(3000);
		alertbtn.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		String alertText = alert.getText();
		System.out.println(alertText);
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		
		runner.teardown(driver);
		

	}

}
