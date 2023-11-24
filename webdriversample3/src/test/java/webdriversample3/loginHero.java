package webdriversample3;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginHero {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");
		WebElement loginButton = driver.findElement(By.className("radius"));
		loginButton.click();
		WebElement msg = driver.findElement(By.id("flash"));
		System.out.println(msg.getText());
		Thread.sleep(2000);
		String subheader = driver.findElement(By.xpath("//h4[@class='subheader']")).getText();
		System.out.println(subheader);

		driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();

		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
