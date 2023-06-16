package Pricing.Creation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Creation {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://ops.dev.toucanus.net/#/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.findElement(By.name("f1")).sendKeys("bharath");
		driver.findElement(By.name("f2")).sendKeys("Bharath@123");
		driver.findElement(By.name("login1")).click();
		Thread.sleep(500);
		driver.findElement(By.id("merMgmtMenu")).click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[3]/div/mat-sidenav-container/mat-sidenav-content/app-home/div/div/div/div[1]/div/div[1]/div[2]/div[1]/mat-card/div/div[2]/p[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[3]/div/mat-sidenav-container/mat-sidenav-content/app-home/div/div/div[1]/div/div/div[2]/mat-card/div/div[2]/p[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[3]/div/mat-sidenav-container/mat-sidenav-content/app-home/div/div/div[1]/div/div/div[3]/mat-card/div/div[2]/p[1]"))
				.click();
	//	driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[3]/div/mat-sidenav-container/mat-sidenav-content/tou-common-table-search-view/section/div/div[1]/div/button[2]"))
				.click();
		driver.findElement(By.id("mat-input-3")).sendKeys("one");
	}

}
