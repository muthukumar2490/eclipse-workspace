package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class LoginPage extends Testbase {

		//page factory or object repo
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement submit;
	
	@FindBy(linkText = "Practice")
	WebElement PracticeLink;
	
	@FindBy(xpath = "//*[@id=\"site-title\"]/a/img")
	WebElement logo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String verifyTitle() {
		
		return driver.getTitle();
		
	}
	
	public boolean verifyLogo() {
		 return logo.isDisplayed();
	}
	
	public LoginSuccessPage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		submit.click();
		
		return new LoginSuccessPage();
		
	
	}
	
	
}
