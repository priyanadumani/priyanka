package DataDrivernFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-abu8m6i/login.do");
		
		Flib flib = new Flib();
		//flib.readExcelData("./testData/ActiTimeData.xlsx","validcreds",1, 0); // username
		//flib.readExcelData("./testData/ActiTimeData.xlsx","validcreds",1, 1); // Password
		
		
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./testData/ActiTimeData.xlsx","validcreds",1, 0));
		Thread.sleep(2000);
				
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./testData/ActiTimeData.xlsx","validcreds",1, 1));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

	}

}
