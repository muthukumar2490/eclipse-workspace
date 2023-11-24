import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class sameTestMultiTimes {
	WebDriver driver;
  @Test(threadPoolSize = 4, invocationCount = 4, timeOut = 20000)
  public void f() {
	  driver.get("https://www.google.com");
	  System.out.println(Thread.currentThread().getId());
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
