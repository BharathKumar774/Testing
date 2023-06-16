package Unsettle.transactions;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Data {

	public static void main(String[] args) throws Exception {
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 DesiredCapabilities cp = new DesiredCapabilities();
		 cp.setCapability(ChromeOptions.CAPABILITY, options);
		 options.merge(cp);
		 WebDriver driver = new ChromeDriver(options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 driver.get("https://ops.dev.toucanus.net/#/");
		Thread.sleep(1000);
		FileInputStream file = new FileInputStream("/home/bharat/Documents/Sample reader.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		 XSSFSheet s = wb.getSheet("Sample reader");
		 int row = s.getLastRowNum();
		 int column = s.getRow(0).getLastCellNum();
		 for (int rownum = 1; rownum <= row; rownum++) {
			 XSSFRow currentrow = s.getRow(rownum);
			 String ID = currentrow.getCell(0).getStringCellValue();
			 String Password = currentrow.getCell(1).getStringCellValue();
			 driver.findElement(By.name("f1")).sendKeys(ID);
			 driver.findElement(By.name("f2")).sendKeys(Password);
			 driver.findElement(By.name("login1")).click();
	}
	}
}
