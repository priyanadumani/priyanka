package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/jewellery/goldcoins.html");
		Thread.sleep(2000);
		// swith to control to frame
		driver.switchTo().frame("fc_push");
		
		WebElement chatbox = driver.findElement(By.id("chat-icon"));
		
		
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(chatbox)).click();
		
		// Switch to control to default webpage
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("abc");
		driver.findElement(By.id("chat-fc-email")).sendKeys("abc@1234");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
	}

}
