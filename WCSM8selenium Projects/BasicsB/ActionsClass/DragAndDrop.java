import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		Actions action = new Actions(driver);
		
		driver.get("https://trello.com/home");
		
		//driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("user")).sendKeys("priyankanadumani96@gmail.com");
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(null));
		
		
		
		

	}

}
