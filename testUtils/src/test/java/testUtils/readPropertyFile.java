package testUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readPropertyFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		System.out.println("started");
		Properties prop = new Properties();
//		FileInputStream fis =  new FileInputStream("\\testUtils\\src\\test\\resources\\config.properties");

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\KANNA\\eclipse-workspace\\testUtils\\src\\" + "test\\resources\\config.properties");

		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("browser"));
		String browser = prop.getProperty("browser");

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

//			driver.quit();

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

//			driver.close();
		}

		else
			System.out.println("no matching browser");

		driver.get(prop.getProperty("url"));
	
		System.out.println(prop.getProperty("url") +" "		+prop.getProperty("username")+	" "+	prop.getProperty("password"));
		driver.quit();

	}

}
