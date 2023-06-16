package Selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Refund {

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
		driver.findElement(By.id("j01")).click();
		driver.findElement(By.name("cardnumber1")).sendKeys("6521540000000000"); //5123450000000000//4018180000000000//6521540000000000
		driver.findElement(By.name("recardnumber1")).sendKeys("6521540000000000");
		driver.findElement(By.name("cardExpiry1")).sendKeys("1023");
		driver.findElement(By.name("DE03account1")).sendKeys("00");
		driver.findElement(By.name("DE03Toaccount1")).sendKeys("00");
		driver.findElement(By.name("cardbin")).sendKeys("652154");
		driver.findElement(By.name("last4digits")).sendKeys("0000");
		driver.findElement(By.name("tid")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("sInput")).sendKeys("6335571");
		driver.findElement(By.name("searchData")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("selectOne")).click();
		driver.findElement(By.id("mat-select-value-3")).click();
		driver.findElement(By.id("mat-option-0")).click();
		driver.findElement(By.id("mat-select-value-5")).click();
		driver.findElement(By.id("mat-option-15")).click();
		driver.findElement(By.id("mat-select-value-7")).click();
		driver.findElement(By.id("mat-option-30")).click();
		driver.findElement(By.name("txnAmt")).sendKeys("700");
		driver.findElement(By.name("reasoncode")).sendKeys("8520");
		driver.findElement(By.name("reasonDesc")).sendKeys("2345");
		driver.findElement(By.name("orgrrn")).sendKeys("686218106933");
		driver.findElement(By.name("invoicenumber")).sendKeys("9630");
		driver.findElement(By.name("orgInvoicenumber")).sendKeys("7410");
		jse.executeScript("window.scrollBy(0,-1500)");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(5000);
        String rrn=driver.findElement(By.id("RRN")).getText();
        System.out.println(rrn);
        Thread.sleep(500);
        driver.navigate().refresh();
        driver.close();
	}

}
