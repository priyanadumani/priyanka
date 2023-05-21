package DataDrivernFramework;

import java.io.IOException;


import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTest extends Flib{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException,Exception {
		// TODO Auto-generated method stub		
		System.setProperty("webdrvier.chromer.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-abu8m6i/login.do");
		Thread.sleep(2000);
		
		// create object of flib to read/generalisation
		Flib flib = new Flib();
			
		int rc = flib.rowcount("./testData/ActiTimeData.xlsx","Invalidcreds");
		// To read multiple data by using for loop
		for (int i=1; i<=rc; i++) {
		// read the data of username
		String invalidusername = flib.readExcelData("./testData/ActiTimeData.xlsx","Invalidcreds",i, 0);
		String invalidpassword = flib.readExcelData("./testdata/ActiTimeData.xlsx","Invalidcreds",i, 1);
		
		driver.findElement(By.name("username")).sendKeys(invalidusername);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).clear();
		
		}
	}

}
