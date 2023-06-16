package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageData {

	public WebDriver driver;

	By userID = By.cssSelector("[name='f1']");
	By password = By.cssSelector("[name='f2']");
	By login = By.cssSelector("[name='login1']");
	By Options = By.cssSelector("[id = profMenu]");
	By Logout = By.cssSelector("[id = logout]");

	public LoginPageData(WebDriver driver) {
		this.driver = driver;
	}

	public void Loginfields() {
		driver.findElement(userID).isDisplayed();
		driver.findElement(password).isDisplayed();
	}

	public void credentials(String UserID, String Password) {
		driver.findElement(userID).sendKeys(UserID);
		driver.findElement(password).sendKeys(Password);
	}

	public void login() throws InterruptedException {
		driver.findElement(login).click();
		Thread.sleep(3000);
	}

	public void Options() {
		driver.findElement(Options).click();
	}

	public void Logout() {
		driver.findElement(Logout).click();
	}

}