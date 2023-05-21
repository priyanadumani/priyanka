package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RigthClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev/downloads/");
		
		//WebElement target =driver.findElement(By.xpath("//h1[text()='Downloads']"));
		WebElement target = driver.findElement(By.linkText("4.9.0"));
		
		//to perform Mouse action we need to create obj..
		Actions act = new Actions(driver);
		
		// To use right click Actions
		act.contextClick(target).perform();
		
		
	}

}
