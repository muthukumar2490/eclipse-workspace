package webdriversample5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		Actions action = new Actions(driver);

		WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'Components')]"));
		WebElement monitor = driver.findElement(By.xpath("//a[contains(text(),'Monitors')]"));

		action.click(menu).perform();
		action.click(monitor).perform();

		WebElement appletv = driver.findElement(By.linkText("Apple Cinema 30\""));
		Thread.sleep(2000);
		action.doubleClick(appletv);
		Thread.sleep(3000);
		driver.quit();
		System.out.println("build success");
	}

}
