package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignement01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions	co1=new ChromeOptions();
		co1.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co1);
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);

		driver.findElement(By.id("id_userLoginId")).sendKeys("abcd@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
}
