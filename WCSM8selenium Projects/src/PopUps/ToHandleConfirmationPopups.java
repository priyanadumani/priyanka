package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleConfirmationPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://licindia.in/");

		for(;;) {
			try {
				driver.findElement(By.linkText("Agents Portal")).click();
				break;
			}
			catch(Exception e)
			{
				Thread.sleep(2000);
			}
		}
		Alert confirmationpopup = driver.switchTo().alert();
		Thread.sleep(2000);
		confirmationpopup.dismiss();


	}

}
