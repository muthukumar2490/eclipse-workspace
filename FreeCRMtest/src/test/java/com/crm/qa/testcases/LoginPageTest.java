package com.crm.qa.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.LoginSuccessPage;
import com.crm.qa.utils.TakeScreenshotUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest extends Testbase{
	LoginPage loginpage ;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		
		
	}
	
	
	
	@Test(priority=1)
	public void LoginPageTitleTest() throws IOException {
		String title = loginpage.verifyTitle();
		Assert.assertEquals(title, "Test Login | Practice Test Automation");
//		String m=Thread.currentThread().getStackTrace()[1].getMethodName();
//		TakeScreenshotUtil.takeScreenshot(m);
//		TakeScreenshotUtil.takeScreenshot();
	}
	@Test(priority=2)
	public void LogoTest() {
		boolean flag = loginpage.verifyLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void LoginTest() {
		LoginSuccessPage LoginSucessPageObj = loginpage.login(prop.getProperty("username")
				, prop.getProperty("password"));
		Assert.assertEquals(LoginSucessPageObj, (LoginSucessPageObj));
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
