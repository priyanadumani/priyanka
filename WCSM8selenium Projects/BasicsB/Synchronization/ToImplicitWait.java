package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToImplicitWait {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(driver,Duration.ofSeconds(30));		
		
		driver.get("www.linkedin.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("abcdfg@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("abc@123");
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		
		driver.quit();

	}

}
