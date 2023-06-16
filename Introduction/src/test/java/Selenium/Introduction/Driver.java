package Selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cp);
        WebDriver driver = new ChromeDriver(options);
        //driver.get("https://www.facebook.com/login/");
        //driver.get("https://web.whatsapp.com/");
        //driver.get("https://www.instagram.com/accounts/login/");
        driver.get("https://unittest.dev.toucanus.net/#/");
        //System.out.println(driver.getTitle());
       // System.out.println(driver.getCurrentUrl());
        //driver.close();
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.findElement(By.name("f1")).sendKeys("bharath");
		driver.findElement(By.name("f2")).sendKeys("Bharath@123");
		driver.findElement(By.name("login1")).click();
		Thread.sleep(500);

		//driver.findElement(By.id("a01")).click();
		for (int i=0;i<=0;i++)
		{
			driver.get(
					"https://unittest.dev.toucanus.net/#/simulation/details?authType=Normal%20Authorization%20-%20Swipe%20and%20signature&screenIdDisplay=1&authCode=A01");
		driver.findElement(By.name("cardnumber")).sendKeys("5123450000000000"); //5123450000000000//4018180000000000//6521540000000000
		driver.findElement(By.name("recardnumber")).sendKeys("5123450000000000");
		driver.findElement(By.name("cardExpiry")).sendKeys("1023");
		driver.findElement(By.name("DE03account")).sendKeys("00");
		driver.findElement(By.name("DE03Toaccount")).sendKeys("00");
		driver.findElement(By.name("cvctrack")).sendKeys("123");
		driver.findElement(By.name("terminalid")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("sinput")).sendKeys("6335571");
		driver.findElement(By.id("searchbtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("selectBtn")).click();
		driver.findElement(By.name("encryptionInd")).sendKeys("03");
		driver.findElement(By.name("txnAmt")).sendKeys("700");
		driver.findElement(By.name("invoicenumber")).sendKeys("7410");
		jse.executeScript("window.scrollBy(0,-1500)");
		driver.findElement(By.id("submitBtn")).click();
        Thread.sleep(5000);
        String rrn=driver.findElement(By.id("RRN")).getText();
        System.out.println(rrn);
        Thread.sleep(500);
        driver.navigate().refresh();
        driver.close();
		}

		//driver.findElement(By.id("theme")).click();
		//driver.findElement(By.xpath("//span[normalize-space()='dark_mode']")).click();
		//driver.findElement(By.xpath("/html/body/app-root/div/div[3]/div/mat-sidenav-container/mat-sidenav/div/app-sidenav/div/mat-selection-list/mat-list-option[13]")).click();
		//driver.findElement(By.xpath("/html/body/app-root/div/div[3]/div/mat-sidenav-container/mat-sidenav/div/app-sidenav/div/mat-selection-list/mat-list-option[14]")).click();
	//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-logout-confirm-dailog/mat-dialog-actions/button[1]")).click();
		

	}

}
