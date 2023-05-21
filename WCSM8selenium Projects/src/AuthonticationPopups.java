import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthonticationPopups {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions	co1=new ChromeOptions();
		co1.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/");
		
		Robot robot = new Robot();
		
		//username
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_M);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		//PASSWORD
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
	}

}
