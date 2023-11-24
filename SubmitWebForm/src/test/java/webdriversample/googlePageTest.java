package webdriversample;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googlePageTest {

	googlePageTest(WebDriver driver) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\KANNA\\Downloads\\chromedriver_win32\\chromdriver.exe");
		driver = runner.setup();
		driver.get("https://www.google.com/");
		Thread.sleep(10); // Let the user actually see something!
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		searchBox.submit();
		Thread.sleep(100); // Let the user actually see something!
		runner.teardown(driver);
	}

}
