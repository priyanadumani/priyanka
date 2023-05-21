package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromer.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		Actions action = new Actions(driver);

		driver.get("https://www.shoppersstack.com/");
		for(;;) {
		try {
			
		driver.findElement(By.linkText("Swagger documentation")).click();
		break;
		
		}
		catch(Exception e) {
		action.sendKeys(Keys.PAGE_DOWN);
				
		}
		}
		Alert alertalertpopup = driver.switchTo().alert();
		alertalertpopup.accept();
		
		Alert promptpopup = driver.switchTo().alert();
		promptpopup.sendKeys("Priyanka");
		promptpopup.accept();
		
		Alert pwd = driver.switchTo().alert();
		pwd.sendKeys("12345");
		pwd.accept();
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

}
