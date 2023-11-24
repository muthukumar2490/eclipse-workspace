import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class groupsTestNG {
	WebDriver driver;

	@Test(groups = {"feature1"})
	public void automationbookstore() throws InterruptedException {

		// explicitly wait
		driver.get("https://automationbookstore.dev/");
		driver.findElement(By.id("searchBar")).sendKeys("test automation" + Keys.ENTER);
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("inside automationbookstore");

		Thread.sleep(2000);

	}
//<!-- <?xml version="1.0" encoding="UTF-8"?> -->
	
	@Test(groups = {"feature1"})
	public void googleTitleAssert() throws InterruptedException {
		System.out.println("inside googleTitleAssert");
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, "title");
		System.out.println("after assertion -inside google");// does not execute as assertion fails
	}

	@Test(groups = {"feature1"})
	public void google() throws InterruptedException {
		System.out.println("inside google");
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("after assertion -inside google");
	}

	@Test(groups = {"feature2"})
	public void javasearchgoogle() throws InterruptedException {

		System.out.println("inside java search");// does not execute as assertion fails
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("java search");
		searchbox.submit();
		Thread.sleep(2000);

	}

	@Test(groups = {"feature2"})
	public void seleniumsearchbing() throws InterruptedException {

		driver.get("https://www.bing.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		System.out.println("inside seleniumsearchbing");
		Thread.sleep(2000);

	}

	@Test(groups = {"feature2"})
	public void bingTitleAssertss() throws InterruptedException {

		driver.get("https://www.bing.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, "title");
		System.out.println("inside bing");
	}

	@Test(groups = {"feature3"})
	public void ultimatix() throws InterruptedException {

		driver.get("https://www.ultimatix.net");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("inside ultimatix");
	}

	@Test(groups = {"feature3"})
	public void facebook() throws InterruptedException {

		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("inside facebook");
	}

	@Test(groups = {"feature3"})
	public void twitter() throws InterruptedException {

		driver.get("https://www.twitter.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("inside twitter");
	}

	@BeforeTest(alwaysRun=true)
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@AfterTest(alwaysRun=true)
	public void afterTest() {
		driver.quit();
	}

}
