package webdriversample4;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownTest {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select singlesel = new Select(driver.findElement(By.id("select-demo")));
		singlesel.selectByValue("Sunday");
		Thread.sleep(2000);
		WebElement multiselid = driver.findElement(By.id("multi-select"));
		Select multisel = new Select(multiselid);
		if (multisel.isMultiple()) {
			multisel.selectByIndex(2);
			multisel.selectByValue("New York");
			multisel.selectByVisibleText("Texas");
		}

		List<WebElement> states = multisel.getAllSelectedOptions();
		states.size();
		//for (i=0;i<states.size();i++) {
			System.out.println(states.size());
	//	}
			for (int i=0;i<states.size();i++) {
			System.out.println(states.get(i).getText());
		}
			List<WebElement> allstates = multisel.getOptions();
			System.out.println(allstates.size());
			for (WebElement element:allstates) {
				System.out.println(element.getText());
			}
				
		Thread.sleep(5000);
		driver.quit();

	}

}
