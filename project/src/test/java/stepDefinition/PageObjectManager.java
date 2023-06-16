package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LoginPageData;
import utils.TestContextSetup;

public class LoginPage {
	LoginPageData loginpagedata;
	TestContextSetup testcontextsetup;

	public LoginPage(TestContextSetup testcontextsetup) {
		loginpagedata = new LoginPageData(testcontextsetup.driver);
		this.testcontextsetup = testcontextsetup;		
	}

	@Given("invoke the browser")
	public void invoke_the_browser() throws IOException {

	}

	@Then("navigate to Toucan URL {string}")
	public void navigate_to_toucan_url(String url) {
		testcontextsetup.driver.get(url);
	}

	@Then("verify whether User ID and Password fields are available")
	public void verify_whether_user_id_and_password_fields_are_available() {
		loginpagedata.Loginfields();
	}

	@Then("enter user ID {string} and Password {string}")
	public void enter_user_id_and_password(String UserID, String Password) {
		loginpagedata.credentials(UserID, Password);
	}

	@Then("Click on Login")
	public void click_on_login() throws InterruptedException {
		loginpagedata.login();
	}

	/*@Then("Click on Options")
	public void click_on_Options() {
		loginpagedata.Options();
	}

	@Then("Click on Logout")
	public void click_on_logout() {
		loginpagedata.Logout();
	}*/

}