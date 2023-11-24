package webdriversample2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Java Tutorials");
		searchbox.submit();		
		System.out.println(driver.getTitle());
		WebElement link  = driver.findElement(By.xpath("/html/body/div[5]/div/div[10]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div/span/a/h3"));
		link.click();
		System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.google.com");
		searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("selenium java");
		searchbox.submit();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit();
	}

}
