package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS));
		
		
	WebDriverWait wait=new WebDriverWait(driver, 2);
		
		driver.get("https://www.shoppersstack.com/products_page/40");
		driver.findElement(By.id("Check Delivery")).sendKeys("12345");
			
		
		WebElement check=driver.findElement(By.id("Check"));
		
		wait.until(ExpectedConditions.elementToBeClickable("check"));

	}

}
