package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class LoginSuccessPage extends Testbase {

	
	@FindBy(xpath="//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")
	WebElement logout;
	
	@FindBy(xpath="//h1[contains(text(),'Logged In Successfully')]")
	WebElement headerText;
	
	
	public LoginSuccessPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String verifyTitle() {
		return driver.getTitle();
		
	}
	
	//Action
	public String verifyHeader() {
		return headerText.getText();
	}
	
	//Actions
	public LoginPage logout() {
		logout.click();
		return new LoginPage();
	}
}
