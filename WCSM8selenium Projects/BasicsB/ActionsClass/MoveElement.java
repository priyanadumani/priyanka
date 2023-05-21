package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Actions action = new Actions(driver);
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		/*
		//Move to Particular element
		WebElement electronins = driver.findElement(By.partialLinkText("Electronics"));
		action.moveToElement(electronins).perform();
		
		//understand Click options
		WebElement jewelry = driver.findElement(By.partialLinkText("Jewelry"));
		action.click(jewelry).perform();
		Thread.sleep(2000);
		*/
		
		
		// To Right click onthe page
		action.contextClick().perform();
		Thread.sleep(2000);
		
		
		
	}

}
