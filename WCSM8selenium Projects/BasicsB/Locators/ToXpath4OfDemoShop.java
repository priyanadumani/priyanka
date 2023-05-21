//Demo web shop

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToXpath4OfDemoShop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(3000);

		driver.manage().window().maximize();

		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("FirstName")).sendKeys("abcd");
		Thread.sleep(3000);

		driver.findElement(By.name("LastName")).sendKeys("xyz");
		Thread.sleep(3000);

		driver.findElement(By.id("Email")).sendKeys("xyz@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.id("Password")).sendKeys("123456");
		Thread.sleep(3000);

		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		Thread.sleep(3000);
		
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(5000);
		
		driver.quit();



	}

}
