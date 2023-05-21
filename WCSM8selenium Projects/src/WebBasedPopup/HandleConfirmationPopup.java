package WebBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	// Confirmation Popup
public class HandleConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.drivers","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Dell/Desktop/WCSM8WORKSPACE-SELENUIM/PopUps/Confirmation.html");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// to handle confirmation popup
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		String text = al.getText();
		System.out.println(text);
		

	}

}
