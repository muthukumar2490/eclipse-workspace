import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTestNG {
	WebDriver driver;

	@Test(priority = 2)
	public void automationbookstore() throws InterruptedException {

		// explicitly wait
		driver.get("https://automationbookstore.dev/");
		driver.findElement(By.id("searchBar")).sendKeys("test automation" + Keys.ENTER);
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("inside automationbookstore");

		Thread.sleep(2000);

	}

	@Test(priority = 5)
	public void googleTitleAssert() throws InterruptedException {
		System.out.println("inside googleTitleAssert");
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, "title");
		System.out.println("after assertion -inside google");// does not execute as assertion fails
	}
	@Test(priority = 6)
	public void google() throws InterruptedException {
		System.out.println("inside google");
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("after assertion -inside google");
	}

	@Test(priority = 7, dependsOnMethods = "google")
	public void javasearchgoogle() throws InterruptedException {

		System.out.println("inside java search");// does not execute as assertion fails
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("java search");
		searchbox.submit();
		Thread.sleep(2000);

	}
	@Test(priority = 8, dependsOnMethods = "bing",alwaysRun = true)
	public void seleniumsearchbing() throws InterruptedException {

		driver.get("https://www.bing.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		System.out.println("inside seleniumsearchbing");
		Thread.sleep(2000);

	}
	@Test(priority = 1)
	public void bing() throws InterruptedException {

		driver.get("https://www.bing.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, "title");
		System.out.println("inside bing");
	}

	@Test(priority = 2, enabled = false)
	public void ultimatix() throws InterruptedException {

		driver.get("https://www.ultimatix.net");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("inside ultimatix");
	}

	@Test(priority = 3, alwaysRun = true)
	public void facebook() throws InterruptedException {

		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("inside facebook");
	}

	@Test(priority = 4, enabled = false, alwaysRun = true)//this test does not enable =false tag take precedence
	
	public void twitter() throws InterruptedException {

		driver.get("https://www.twitter.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("inside twitter");
	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
