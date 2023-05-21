package WebBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.drivers","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("C:/Users/Dell/Desktop/WCSM8WORKSPACE-SELENUIM/PopUps/Alert.html");
		
		// generate alert Popups
		driver.findElement(By.xpath("//button[.='click me!']")).click();
		
		//handle alert
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		//al.accept();
		
		
		System.out.println(al.getText());
		al.dismiss();
		
		
	}

}
