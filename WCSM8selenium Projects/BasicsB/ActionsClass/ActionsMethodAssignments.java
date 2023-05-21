package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodAssignments {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		Actions action = new Actions(driver);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		// Click Method
		WebElement appliances = driver.findElement(By.partialLinkText("Appliances"));
		action.click(appliances).perform();
		
		driver.findElement(By.)
		
		
		
	}

}
