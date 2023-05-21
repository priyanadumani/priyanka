package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmetOnActionRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/jewellery/goldcoins.html");
		Thread.sleep(2000);

		WebElement move=driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		Thread.sleep(2000);
		//mouse action
		Actions action = new Actions(driver);
		action.moveToElement(move).perform();

		//To Inspect by using Right Mouse click on bond
		
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		
		WebElement filterby = driver.findElement(By.xpath("//div[text()='Filter by']"));
		Thread.sleep(2000);
		for(int i=0; i<=2; i++) {
			action.clickAndHold(filterby).perform();
			
		}
		//To copy the filter by using Robot Class
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		driver.findElement(By.name("search_query")).click();
		
		//To paste in search box
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.name("submit_search")).submit();
		
		
		
		
		

	}

}
