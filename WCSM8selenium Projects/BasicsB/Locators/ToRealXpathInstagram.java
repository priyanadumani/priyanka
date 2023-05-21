//Instagram Login

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToRealXpathInstagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("priyanka");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		

		

	}

}
