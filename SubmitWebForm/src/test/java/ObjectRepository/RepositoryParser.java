package ObjectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class RepositoryParser {

	Properties prop;

	public RepositoryParser() throws IOException {
		String path = "C:\\Users\\KANNA\\eclipse-workspace\\SubmitWebForm"
				+ "\\src\\test\\java\\ObjectRepository\\ObjectRepository.property";
		prop = new Properties();
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
	}

	public By getLocatorTypeValue(String Element) {
		String locatorProperty = prop.getProperty(Element);
		String LocatorType = locatorProperty.split(":")[0];
		String LocatorValue = locatorProperty.split(":")[1];
		System.out.println(LocatorType);
		System.out.println(LocatorValue);

		By locator = null;

		switch (LocatorType) {
		case "id":
			locator = By.id(LocatorValue);
			break;
		case "xpath":
			locator = By.xpath(LocatorValue);
			break;

		}
		return locator;
	}

}
