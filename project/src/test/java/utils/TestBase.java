package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;	
}

	public WebDriver getDriver() {
		return driver;
	}
}