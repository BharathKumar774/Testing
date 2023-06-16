package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPageData;
import utils.TestBase;
import utils.TestContextSetup;

public class LoginPage {
	LoginPageData ld;
	TestContextSetup tc;
	public LoginPage(TestContextSetup tc) {
		ld = new LoginPageData(tc.driver);
		this.tc = tc;

	}

	

	@Given("invoke browser")
	public void invoke_browser() throws IOException {
		
	}

	@When("navigate into url {string}")
	public void navigate_into_url(String url) {
		tc.driver.get(url);
	}

	@Then("verify vether userid and password fields are available")
	public void verify_vether_user_id_and_password_fields_are_available() {
		ld.Loginfields();
	}

	@Then("enter userid {string} and password {string}")
	public void enter_userid_and_password(String Userid, String Password) {
		ld.Loginid(Userid, Password);
	}

	@Then("click on login")
	public void click_on_login() {
		ld.Login();
	}

	@Then("click on search")
	public void click_on_search() throws InterruptedException {
		ld.Search();
		Thread.sleep(3000);
	}

	@Then("click on id")
	public void click_on_id() {
		ld.Id();
	}

	@Then("click on logout")
	public void click_on_logout() {
		ld.Logout();
	}
}
