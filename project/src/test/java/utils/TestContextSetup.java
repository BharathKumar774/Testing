package utils;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	TestBase testbase;
	PageObjectManager pageobjectmanager;
	public WebDriver driver;
	public TestContextSetup() throws IOException {	
		testbase = new TestBase();
		pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());
		driver = testbase.getDriver();
	}
	
	
}