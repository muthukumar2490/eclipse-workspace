package com.fresco.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.Select;


public class BookingDefinition{
	/*Write your code here
    You can directly use hooks.driver to perform driver operations
    ignore errors regarding hooks.driver*/
	WebDriver driver=hooks.driver;  
    @Given("I am on the booking page")
	public void i_am_on_the_booking_page()
    {    	
    	//String form = driver.findElement(By.xpath("/html/body/div/h2")).getText();
    	driver.get("C:\\Users\\KANNA\\eclipse-workspace\\webdriver\\web\\hotelbooking.html");
    	
    }
    @When("I check the page title")
	public void i_check_the_page_title() {
    	System.out.println(driver.getTitle());
    	assertEquals("Hotel Booking",driver.getTitle());
    }
    @When("I click confirm booking button")
	public void i_click_confirm_booking_button(){
    	driver.findElement(By.id("btnPayment")).click();
    }
    @When("I check for alert for first name")
	public void i_check_for_alert_for_first_name(){
    	Alert alert = driver.switchTo().alert();
    	String nameAlertMsg = alert.getText();
    	System.out.println(nameAlertMsg);
    	assertEquals("Please fill the First Name",nameAlertMsg);
    	alert.accept();
    }
    @When("I enter first name and click confirm booking")
	public void i_enter_first_name_and_click_confirm_booking(){
    	driver.findElement(By.id("txtFirstName")).sendKeys("Muthu Kumar");
    	driver.findElement(By.id("btnPayment")).click();
    }
    @When("I check for alert for last name")
	public void i_check_for_alert_for_last_name(){
    	Alert alert = driver.switchTo().alert();
    	String nameAlertMsg = alert.getText();
    	System.out.println(nameAlertMsg);
    	assertEquals("Please fill the Last Name",nameAlertMsg);
    	alert.accept();
    }
    @When("I enter last name and click confirm booking")
	public void i_enter_last_name_and_click_confirm_booking(){
    	driver.findElement(By.id("txtLastName")).sendKeys("Kannan");
    	driver.findElement(By.id("btnPayment")).click();
    }
    @When("I check for alert for email")
	public void i_check_for_alert_for_email(){
    	Alert alert = driver.switchTo().alert();
    	String mailAlertMsg = alert.getText();
    	System.out.println(mailAlertMsg);
    	assertEquals("Please fill the Email",mailAlertMsg);
    	alert.accept();
    }
    @When("I enter email and click confirm booking")
	public void i_enter_email_and_click_confirm_booking(){
    	driver.findElement(By.id("txtEmail")).sendKeys("Kannan@mail.com");
    	driver.findElement(By.id("btnPayment")).click();
    }
    @When("I check for alert for mobile number")
	public void i_check_for_alert_for_mobile_number(){
    	Alert alert = driver.switchTo().alert();
    	String phoneAlertMsg = alert.getText();
    	System.out.println(phoneAlertMsg);
    	assertEquals("Please fill the Mobile No.",phoneAlertMsg);
    	alert.accept();
    }
    
    @When("I enter invalid mobile no and click confirm booking")
	public void i_enter_invalid_mobile_no_and_click_confirm_booking(){
    	driver.findElement(By.id("txtPhone")).sendKeys("abcde");
    	driver.findElement(By.id("btnPayment")).click();
    }
    @When("I check for alert for contact no")
	public void i_check_for_alert_for_contact_no(){
    	Alert alert = driver.switchTo().alert();
    	String phoneAlertMsg = alert.getText();
    	System.out.println(phoneAlertMsg);
    	assertEquals("Please enter valid Contact no.",phoneAlertMsg);
    	alert.accept();
    }
    @When("I enter contact no and click confirm booking")
	public void i_enter_contact_no_and_click_confirm_booking(){
    	driver.findElement(By.id("txtPhone")).clear();
    	driver.findElement(By.id("txtPhone")).sendKeys("7993291597");
    	driver.findElement(By.id("btnPayment")).click();
    }
    
    @When("I check alert for city")
	public void i_check_alert_for_city(){
    	Alert alert = driver.switchTo().alert();
    	String cityAlertMsg = alert.getText();
    	System.out.println(cityAlertMsg);
    	assertEquals("Please select city",cityAlertMsg);
    	alert.accept();
    }
    @When("I select city and click confirm booking")
	public void i_select_city_and_click_confirm_booking(){
	    Select city = new Select(driver.findElement(By.name("city")));
		city.selectByValue("Chennai");
		driver.findElement(By.id("btnPayment")).click();
}
    @When("I check alert for state")
	public void i_check_alert_for_state(){
    	Alert alert = driver.switchTo().alert();
    	String stateAlertMsg = alert.getText();
    	System.out.println(stateAlertMsg);
    	assertEquals("Please select state",stateAlertMsg);
    	alert.accept();
    	
    }
    @When("I select state and click confirm booking")
	public void i_select_state_and_click_confirm_booking(){
    	Select state = new Select(driver.findElement(By.name("state")));
    	state.selectByValue("Tamilnadu");
    	driver.findElement(By.id("btnPayment")).click();
    }
    @When("I check alert for cardholder name")
	public void i_check_alert_for_cardholder_name(){
    	Alert alert = driver.switchTo().alert();
    	String cardAlertMsg = alert.getText();
    	System.out.println(cardAlertMsg);
    	assertEquals("Please fill the Card holder name",cardAlertMsg);
    	alert.accept();
    	
    }
    @When("I enter cardholder name and click confirm booking")
	public void i_enter_cardholder_name_and_click_confirm_booking(){
    	driver.findElement(By.id("txtCardholderName")).sendKeys("Muthu Kumar");
    	driver.findElement(By.id("btnPayment")).click();
    }
    @When("I check for alert for debit card number")
	public void i_check_for_alert_for_debit_card_number(){
    	Alert alert = driver.switchTo().alert();
    	String cardNoAlertMsg = alert.getText();
    	System.out.println(cardNoAlertMsg);
    	assertEquals("Please fill the Debit card Number",cardNoAlertMsg);
    	alert.accept();
    }
    @When("I enter card details and click confirm booking")
	public void i_enter_card_details_and_click_confirm_booking(){
    	driver.findElement(By.id("txtDebit")).sendKeys("1234");
    	driver.findElement(By.id("btnPayment")).click();
    }
    @When("I check alert for cvv")
	public void i_check_alert_for_cvv(){
    	Alert alert = driver.switchTo().alert();
    	String cvvAlertMsg = alert.getText();
    	System.out.println(cvvAlertMsg);
    	assertEquals("Please fill the CVV",cvvAlertMsg);
    	alert.accept();
    }
    @When("I enter cvv and click confirm booking")
	public void i_enter_cvv_and_click_confirm_booking(){
    	driver.findElement(By.id("txtCvv")).sendKeys("123");
    	driver.findElement(By.id("btnPayment")).click();
    }
    @When("I check alert for exp month")
	public void i_check_alert_for_exp_month(){
    	Alert alert = driver.switchTo().alert();
    	String expAlertMsg = alert.getText();
    	System.out.println(expAlertMsg);
    	assertEquals("Please fill expiration month",expAlertMsg);
    	alert.accept();
    }
    @When("I enter exp month and click confirm booking")
	public  void i_enter_exp_month_and_click_confirm_booking(){
    	driver.findElement(By.id("txtMonth")).sendKeys("12");
    	driver.findElement(By.id("btnPayment")).click();
    }
    @When("I check alert for exp year")
	public void i_check_alert_for_exp_year(){
    	Alert alert = driver.switchTo().alert();
    	String yrAlertMsg = alert.getText();
    	System.out.println(yrAlertMsg);
    	assertEquals("Please fill the expiration year",yrAlertMsg);
    	alert.accept();
    }
    @When("I enter exp year and click confirm booking")
	public void i_enter_exp_year_and_click_confirm_booking()
    {
    	driver.findElement(By.id("txtYear")).sendKeys("2023");
    	driver.findElement(By.id("btnPayment")).click();
    }
    @Then("I should go to success page")
	public void i_should_go_to_success_page(){
    	System.out.println(driver.getTitle());
    	assertEquals("Payment Details",driver.getTitle());
    }


}