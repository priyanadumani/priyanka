package ReadExcelData;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeFrame {

	public static void main(String[] args) throws EncryptedDocumentException, IOException,Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://desktop-abu8m6i/login.do");

		// read the valid username from ActiTimeData excel sheet
		FileInputStream fis = new FileInputStream("./testData/ActiTimeData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String ValidUsername = cell.getStringCellValue();

		// read the valid password from ActiTimeData excel sheet
		FileInputStream fis1 = new FileInputStream("./testData/ActiTimeData.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis1);
		Sheet sheet2 = wb2.getSheet("validcreds");
		Row row2 = sheet2.getRow(1);
		Cell cell2 = row2.getCell(1);
		String ValidPassword = cell2.getStringCellValue();



		driver.findElement(By.name("username")).sendKeys(ValidUsername);
		driver.findElement(By.name("pwd")).sendKeys(ValidPassword);
		driver.findElement(By.id("loginButton")).click();


	}

}
