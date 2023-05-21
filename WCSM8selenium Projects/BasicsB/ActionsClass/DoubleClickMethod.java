package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Create Object for Non-static Class
		Actions action = new Actions(driver);
		
		/*driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
		//Move to Particular element
		WebElement electronics = driver.findElement(By.partialLinkText("Electronics"));
		action.moveToElement(electronics).perform();
		
		//understand Click options
		WebElement jewelry = driver.findElement(By.partialLinkText("Jewelry"));
		action.click(jewelry).perform();
		Thread.sleep(2000);
	
		
		// To Right click on the page
		action.contextClick().perform();
		Thread.sleep(2000);
		
		//To move by Offset
		action.moveByOffset(749,189).click().perform();
		Thread.sleep(2000);*/
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		Thread.sleep(2000);
		
		   WebElement add = driver.findElement(By.id("add"));
		
		// To double click
		   action.doubleClick(add).perform();
		   Thread.sleep(2000);
				
		
		
		
	}

}
