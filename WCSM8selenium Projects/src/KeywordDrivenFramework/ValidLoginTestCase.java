package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// To open Browser create object of BaseTest 
		BaseTest bt = new BaseTest();
		
		//read the data from property file
		Flib flib = new Flib();
		
		bt.openBrowser();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData("./testData/config.properties","username"));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData("./testData/config.properties","password"));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		

		bt.closeBrowser();

	}

}
