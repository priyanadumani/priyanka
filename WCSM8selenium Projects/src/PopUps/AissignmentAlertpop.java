package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AissignmentAlertpop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='welcmewrap']"));
		//driver.switchTo().frame("Login to NetBanking");
		Thread.sleep(2000);
		

		driver.findElement(By.linkText("CONTINUE")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(2000);
		

	}

}
