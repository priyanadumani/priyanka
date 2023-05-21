package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-abu8m6i/login.do");
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		username.sendKeys("admin");
		password.sendKeys("manager");
		
		Thread.sleep(2000);
		
		username.clear();
		Thread.sleep(2000);
		password.clear();
		
		driver.quit();
		
	}

}
