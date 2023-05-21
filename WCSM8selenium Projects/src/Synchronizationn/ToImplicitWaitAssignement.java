package Synchronizationn;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToImplicitWaitAssignement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Noise ColorFit Pulse Spo2 Smart Watch']")).click();
		Thread.sleep(2000);
		
		



	}

}
