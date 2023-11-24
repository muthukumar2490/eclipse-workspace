package webdriversample5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click me!')]")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();

		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.dismiss();

		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		System.out.println(alert.getText());
		alert.sendKeys("Hi Kannan");
		Thread.sleep(3000);
		alert.accept();

		
		driver.quit();
	}

}
