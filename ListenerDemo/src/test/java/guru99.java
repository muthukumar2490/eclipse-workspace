import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

@Listeners(ItestListenerTest.class)
public class guru99 {
	
	WebDriver driver;
  @Test
  @Parameters({"uid","pwd"})
  public void guruLogin(String username, String password) {
	 
	  driver.get("http://demo.guru99.com/V4");
//	  Access details to demo site.
//	  User ID :	mngr538257
//	  Password :	bagYpAj
//	  This access is valid only for 20 days.
	  
	  WebElement uid = driver.findElement(By.name("uid"));
	  WebElement pwd = driver.findElement(By.name("password"));
	  WebElement btn = driver.findElement(By.name("btnLogin"));
	  uid.sendKeys(username);
	  Reporter.log("username entered", true);
	  pwd.sendKeys(password);
	  Reporter.log("password entered", true);
	  btn.click();
	  
	  
  }
  @Test		
  public void TestToFail()				
  {		
      System.out.println("This method to test fail");					
      Assert.assertTrue(false);			
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
