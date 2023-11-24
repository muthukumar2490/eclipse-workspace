package eCommerceUsecase;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
 features="src//test//resources//features//addItem.feature", 
 glue={"stepdefs"})
public class eComRunner extends AbstractTestNGCucumberTests{
}