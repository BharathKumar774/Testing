package Selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Reversal {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cp);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://unittest.dev.toucanus.net/#/");
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.findElement(By.name("f1")).sendKeys("bharath");
		driver.findElement(By.name("f2")).sendKeys("Bharath@123");
		driver.findElement(By.name("login1")).click();
		Thread.sleep(500);
		
	}

}
