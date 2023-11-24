import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ChromeTest {
	WebDriver driver;

	@Test
	public void f() {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Java tutorials");
		searchbox.submit();
		System.out.println(Thread.currentThread().getId());
	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(Thread.currentThread().getId());
	}

	@AfterTest
	public void afterTest() {
		System.out.println(Thread.currentThread().getId());
		driver.quit();
	}

}
