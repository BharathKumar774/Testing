package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		 //features = "src/test/java/features/login.feature",
		features = "src/test/java/features/A01.feature",
		glue = "stepDefinitions",monochrome=true,tags="@Transactions")

public class TestsExecution extends AbstractTestNGCucumberTests{
	
}