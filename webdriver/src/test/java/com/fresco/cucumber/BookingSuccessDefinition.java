package com.fresco.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;

import static org.junit.Assert.assertEquals;

import java.util.*;

public class BookingSuccessDefinition{

	/*Write your code here
    You can directly use hooks.driver to perform driver operations
    ignore errors regarding hooks.driver*/
	WebDriver driver = hooks.driver;
    @Given("I am on Success page")
	public void i_am_on_Success_page(){
    	driver.get("C:\\Users\\KANNA\\eclipse-workspace\\webdriver\\web\\success.html");
    }
    @When("i check page title")
	public void i_check_page_title(){
    	
    	System.out.println(driver.getTitle());
    	assertEquals("Payment Details",driver.getTitle());
    	
    }
    @Then("close the browser")
	public void close_the_browser(){
    	driver.close();
    }
}