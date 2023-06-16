package Unsettle.transactions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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

public class Unsettlereader {

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
        Thread.sleep(2000);
        FileInputStream file = new FileInputStream("/home/bharat/Documents/DEfault.xlsx");
                                                   // Creating an object for file and Giving the location of the file
        XSSFWorkbook wb = new XSSFWorkbook(file);  // Creating object for workbook and mapping the workbook into the file
        XSSFSheet s = wb.getSheet("Sheet1");    // Creating object for sheet and mapping the sheet into the workbook
        int row = s.getLastRowNum();               // Initializing the row and getting the last row number from the sheet
//        System.out.println("Last row number is " + s.getLastRowNum());
        int column = s.getRow(0).getLastCellNum(); // Initializing the column and getting the value from row index "0"
//        System.out.println("Last cell number is " + s.getRow(0).getLastCellNum());
        for (int rownum = 1; rownum <= row; rownum++) {
            XSSFRow currentrow = s.getRow(rownum);
            String ID = currentrow.getCell(0).getStringCellValue();
            String Password = currentrow.getCell(1).getStringCellValue();
            driver.findElement(By.name("f1")).sendKeys(ID);
            driver.findElement(By.name("f2")).sendKeys(Password);
            driver.findElement(By.name("login1")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("profMenu")).click();
            Thread.sleep(1000);
            // driver.findElement(By.id("theme")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/button[4]")).click();
        }
	}
}