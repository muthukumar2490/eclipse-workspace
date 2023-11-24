package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.crm.qa.utils.waitParm;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Testbase {

	public static WebDriver driver;
	public static Properties prop;
	

	public Testbase() {
		prop = new Properties();
		try {

			FileInputStream fis = new FileInputStream("C:\\Users\\KANNA\\eclipse-workspace\\"
					+ "FreeCRMtest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static void initialization() {
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(waitParm.pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitParm.implicitWait));
				
		driver.get(prop.getProperty("url"));
		
		
	}
	

}
