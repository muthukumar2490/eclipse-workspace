import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paralleltest {
	WebDriver driver;


	@Test()
	public void EdgeTest() throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("inside facebook");
		System.out.println(Thread.currentThread().getId());
		driver.quit();
	}

	@Test()
	public void ChromeTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("inside facebook");
		System.out.println(Thread.currentThread().getId());
		driver.quit();
	}

}
