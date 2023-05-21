package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToHoverActionClass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		// Handle popup
		driver.findElement(By.xpath("//span[text()='Not now']")).click();

		// To Identify coins
		WebElement target = driver.findElement(By.xpath("//a[@title='Coins']"));
		
		// create object for Action class
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		// use this method to move
		action.moveToElement(target).perform();
		
		//
		WebElement act = driver.findElement(By.xpath("//span[text()='1 gram' and (contains(@data-p,'gold-coins-22-weight-1gms,m'))]"));
		act.click();


	}

}
