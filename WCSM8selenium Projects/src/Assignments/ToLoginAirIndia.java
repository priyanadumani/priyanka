package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToLoginAirIndia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.airindia.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@class='nav-link']")).click();
			
		
		driver.findElement(By.name("Email Address")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("abc@123");
		Thread.sleep(2000);

		driver.findElement(By.name("Login icon")).click();
		Thread.sleep(2000);

	}

}
