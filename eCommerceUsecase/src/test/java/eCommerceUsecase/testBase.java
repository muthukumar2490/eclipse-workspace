package eCommerceUsecase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {
public static WebDriver driver;

public static void setup() throws InterruptedException
{
//WebDriverManager.chromedriver().setup();
WebDriverManager.edgedriver().setup();
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\KANNA\\Downloads\\chromedriver_win32\\chromedriver.exe");
System.out.println("setup called");
driver = new EdgeDriver();

driver.manage().window().maximize();
//Thread.sleep(1000);
driver.get("https://www.demoblaze.com/");
//Thread.sleep(10000);
}


//public void closeBrowser()
//{driver.close();}
}
