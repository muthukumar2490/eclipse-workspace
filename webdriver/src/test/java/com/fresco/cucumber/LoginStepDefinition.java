package com.fresco.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

import java.util.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;


public class LoginStepDefinition {
	/*Write your code here
    You can directly use hooks.driver to perform driver operations
    ignore errors regarding hooks.driver*/
	WebDriver driver=hooks.driver;   

	@Given("I am on the login page")
	public void i_am_on_the_login_page(){
		driver.get("C:\\Users\\KANNA\\eclipse-workspace\\webdriver\\web\\login.html");}
	
	@When("I check page title")
	public void i_check_page_title()
	{String title = driver.getTitle();
      assertEquals("Login", title);}

	@When("I enter username only")
	public void i_enter_username_only()
	{ driver.findElement(By.name("userName")).sendKeys("admin");
    }
	@When("I click on Login button1")
	public void i_click_on_Login_button1()
	{ driver.findElement(By.className("btn")).click();
    }
	@When("I check for error message")
	public void i_check_for_error_message()
	{
		String pwdErrMsg = driver.findElement(By.id("pwdErrMsg")).getText();
		assertEquals("* Please enter password.", pwdErrMsg);
	}
	@When("I enter wrong password")
	public void i_enter_wrong_password()
	{driver.findElement(By.name("userPwd")).sendKeys("admin1");
	}
    @When("I click on Login button2")
	public void i_click_on_Login_button2()
	{driver.findElement(By.className("btn")).click();
	}
    @When("I check for alert")
	public void i_check_for_alert()
	{
    	Alert alert = driver.switchTo().alert();
    	String alertMsg = alert.getText();
    	System.out.println("alertMsg");
    	
    	driver.switchTo().alert().accept();	
	}
    @When("I enter correct details")
	public void i_enter_correct_details()
	{
    	driver.findElement(By.name("userName")).clear();
    	driver.findElement(By.name("userName")).sendKeys("admin");
    	driver.findElement(By.name("userPwd")).clear();
    	driver.findElement(By.name("userPwd")).sendKeys("admin");
    	
    	
	}
    @When("I click on Login Button3")
	public void i_click_on_Login_Button3()
	{
    	driver.findElement(By.className("btn")).click();   	
	}
    @Then("I expect to go to next page")
	public void i_expect_to_go_to_next_page()
	{
    	System.out.println(driver.getTitle());
    	assertEquals("Hotel Booking",driver.getTitle());
	}
}