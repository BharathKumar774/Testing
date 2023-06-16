package Selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Upi {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cp);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://merchant.dev.toucanus.net/#/auth/extlogin");
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.findElement(By.id("user-button")).click();
        driver.findElement(By.id("mat-input-1")).sendKeys("veoge6pfat");
        driver.findElement(By.id("mat-input-2")).sendKeys("Password@1234");
        driver.findElement(By.id("log")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("checkout")).click();
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.name("terminalid")).click();	
        driver.findElement(By.id("sinput")).sendKeys("49127560");
        driver.findElement(By.id("searchbtn")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("selectOne")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("testPymt")).click();
        driver.findElement(By.id("mat-input-3")).sendKeys("850");
        driver.findElement(By.name("payBtn")).click();
        driver.findElement(By.id("mat-tab-label-0-1")).click();
        driver.findElement(By.id("mat-input-4")).sendKeys("abc@ybl");
        driver.findElement(By.name("upipayBtn")).click();
        Thread.sleep(6000);
        String rrn=driver.findElement(By.xpath("/html/body/app-root/div/div[2]/div/mat-sidenav-container/mat-sidenav-content/app-shopping-cart/section/div/div/div[6]/div[1]/p[2]")).getText();
        Thread.sleep(500);
        System.out.println(rrn);
        Thread.sleep(500);
        driver.navigate().refresh();
        driver.close();
        
	}

}
