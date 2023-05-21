package Loaders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {
		// Handle Illegal state exception
		System.setProperty("webdriver.chrome.driver", "./drivers/chromerdriver.exe");

		//Handle ConnectionFailed exception
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allows-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		//get method
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		

		driver.switchTo().activeElement().sendKeys("phoebe buffay",Keys.ENTER);

		driver.findElement(By.className("lNPNe")).click();

	}

}
