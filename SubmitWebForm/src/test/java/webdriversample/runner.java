package webdriversample;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.CompleteWebFormWithParserTest;

public class runner {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

//		googlePageTest googlepagetest = new googlePageTest(driver);
//		ButtonTest buttontest = new ButtonTest(driver);
//		CheckboxesTest checkbox = new CheckboxesTest(driver);
//		DatepickerTest datepicker = new DatepickerTest(driver);
//		DragAndDropTest draganddrop = new DragAndDropTest(driver);
//		Dropdown dropdown = new Dropdown(driver);
//		KeyboardMouse keyoard = new KeyboardMouse(driver);
//		AlertTest alerttest = new AlertTest(driver);
		
//		PageScrollTest pagescrolltest = new PageScrollTest(driver);
		
//		RadioButtonTest radioButtonTest  = new RadioButtonTest(driver);
//		SwitchWindowTest switchWindowTest = new SwitchWindowTest(driver);
		
//		completeWebFormTest completewebFormTest = new completeWebFormTest(driver);
		CompleteWebFormWithParserTest completeWebFormWithParserTest = new CompleteWebFormWithParserTest(driver);
		
	}

	public static WebDriver setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		return driver;
	}

	public static void teardown(WebDriver driver) {
		driver.quit();
	}

}
