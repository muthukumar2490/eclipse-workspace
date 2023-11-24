package testUtils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testIncognito {
  @Test(invocationCount =1,threadPoolSize=2)
  public void Chromeincognito() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--headless");
	  WebDriver driver = new ChromeDriver(options);
	  driver.manage().window().maximize();
	  System.out.println(Thread.currentThread().getId());
	  
	  driver.get("https://www.google.com");
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement searchbox = driver.findElement(By.name("q"));
	  searchbox.sendKeys("Java Tutorial");
	  Thread.sleep(10);
	  searchbox.submit();
	  System.err.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	  System.err.println(driver.getTitle());
	  SoftAssert softassert = new SoftAssert();
	  softassert.assertFalse(driver.getTitle().equals("title"));
	  softassert.assertAll();
	  
	  driver.quit();
  }
  @Test(invocationCount = 4, threadPoolSize=4)
  public void EdgeInPrivate() throws InterruptedException {
	  
	  WebDriverManager.edgedriver().setup();
	  EdgeOptions Eoptions = new EdgeOptions();
	  Eoptions.addArguments("InPrivate");
	  WebDriver driver = new EdgeDriver(Eoptions);
	  System.out.println(Thread.currentThread().getId());
	  
	  driver.get("https://www.bing.com");
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement searchbox = driver.findElement(By.xpath("//*[@name=\"q\"]"));
	  searchbox.sendKeys("Java Tutorial");
	  Thread.sleep(10);
	  searchbox.submit();
	  System.err.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	  System.err.println(driver.getTitle());
	  SoftAssert softassert = new SoftAssert();
	  softassert.assertFalse(driver.getTitle().equals("title"));
	  softassert.assertAll();
	  
	  driver.quit();
  }
}
