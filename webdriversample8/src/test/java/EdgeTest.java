import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class EdgeTest {
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
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("https://www.google.com");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
