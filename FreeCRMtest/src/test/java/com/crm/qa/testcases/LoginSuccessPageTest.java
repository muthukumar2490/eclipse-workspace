package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.LoginSuccessPage;

public class LoginSuccessPageTest extends Testbase {
	LoginPage loginpage;
	LoginSuccessPage LoginSuccessPageobj;

	public LoginSuccessPageTest() {
		super();
		System.out.println("LoginSuccessPageTest constructor");
		

	}

	//test case should be separated
	//before each test case browser should be launched
	//@Test
	//after each test case browser should be closed.
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();		
		LoginSuccessPageobj = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}
	@Test(priority=1,enabled=true)
	public void verifyTitleTest() {
		String pagetitle = LoginSuccessPageobj.verifyTitle();
		Assert.assertEquals(pagetitle, "Logged In Successfully | Practice Test Automation");
	}
	
	@Test(priority=2,enabled=true)
	public void verifyHeaderTest() {
		String header = LoginSuccessPageobj.verifyHeader();
		Assert.assertEquals(header, "Logged In Successfully");
	}
	
	@Test(priority=3)
	public void logoutTest() {
		LoginPage loginpage = LoginSuccessPageobj.logout();
		Assert.assertEquals(loginpage, loginpage);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
}
