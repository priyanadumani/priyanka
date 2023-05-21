package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("C:/Users/Dell/Desktop/WCSM8WORKSPACE-SELENUIM/Web%20elements/iframe.html");
		//username
		driver.findElement(By.id("i2")).sendKeys("admin");
		
		WebElement frameElement = driver.findElement(By.name("frname"));
		//driver.switchTo().frame(0);//handle by int index
		// driver.switchTo().frame("frname");  // handle by name or id
		driver.switchTo().frame(frameElement);   //handle by webelement
		Thread.sleep(2000);
		
		driver.findElement(By.id("i1")).sendKeys("manager");
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='i1']")).clear();
		
		
		driver.findElement(By.xpath("//input[@id='i2']")).clear();
		driver.switchTo().parentFrame();
	}

}
