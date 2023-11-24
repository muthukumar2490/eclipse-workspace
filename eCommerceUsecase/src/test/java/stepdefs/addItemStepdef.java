package stepdefs;

import org.openqa.selenium.WebDriver;

import eCommerceUsecase.testBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class addItemStepdef {
	WebDriver driver;   
	testBase test;

	@Given("customer Logon to the website")
	public void customer_Logon_to_the_website() throws InterruptedException {
		System.out.println("setup called-on login page");
		testBase.setup();
		driver.get("https://www.google.com");
	}
	
	
//	@When("Customer add item to cart")
//	public void Customer_add_item_to_cart() {}
//    @Then("Item must be added to cart")
//    public void Item_must_be_added_to_cart() {}
//	
//	When Customer add item to cart
//    Then Item must be added to cart
//    
	
}
