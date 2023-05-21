package KeywordDrivenFramework;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvalidLoginTestCase extends BaseTestInterface {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
				
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		int rc = flib.rowcount(EXCEL_PATH,"Invalidcreds");
		for(int i=1; i<=rc; i++)
		{
		String invalidusername = flib.readExcelData(EXCEL_PATH,"Invalidcreds", i, 0);
		String invalidpassword = flib.readExcelData(EXCEL_PATH,"Invalidcreds", i, 1);
		
		driver.findElement(By.name("username")).sendKeys(invalidusername);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();		
		
		}
		
	}

}
