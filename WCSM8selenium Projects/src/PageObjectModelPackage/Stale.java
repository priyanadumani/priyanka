package PageObjectModelPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) {

		System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://desktop-abu8m6i/login.do");
	
	WebElement usernameTB = driver.findElement(By.name("username"));
	usernameTB.sendKeys("admin");
	
	WebElement passwordTB = driver.findElement(By.name("pwd"));
	passwordTB.sendKeys("manager");
	
	//driver.findElement(By.id("loginButton")).click();
	
	driver.navigate().refresh();
	
	usernameTB.sendKeys("admin");
	
		
	}

}
