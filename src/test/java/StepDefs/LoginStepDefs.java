package StepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepDefs {
	
	WebDriver driver = Hooks.driver;
	
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		
		driver.get("https://www.simplilearn.com/");   
	}

	@Given("I have clicked on login link")
	public void i_have_clicked_on_login_link() {
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	}

	@When("I enter username")
	public void i_enter_username() {
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys("abc@xyz.com");
	}

	@When("I enter password")
	public void i_enter_password() {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Abc@1234");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		WebElement login_button = driver.findElement(By.name("btn_login"));
		login_button.click();
	}

	@Then("I should land on home page")
	public void i_should_land_on_home_page() {
	    

	}

	@Then("I should get the error message")
	public void i_should_get_the_error_message() {
		WebElement error = driver.findElement(By.className("error_msg"));
		String ActError = error.getText();
		String ExpError = "The email or password you have entered is invalid.";
		
		Assert.assertEquals(ActError, ExpError); 
	}
	
	@When("I enter username as {string}")
	public void i_enter_username_as(String userNameVal) {
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys(userNameVal);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String passVal) {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(passVal);
	 
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String expError) {
		WebElement error = driver.findElement(By.className("error_msg"));
		String ActError = error.getText();
		Assert.assertEquals(ActError, expError);  

	}




}
