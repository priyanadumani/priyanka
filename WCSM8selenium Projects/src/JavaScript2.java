import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromer.driver", "./drivers/chromedriver.exe");
		WebDriver driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.xpath("//div[@class='_9axz']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scollBy(0,100)");
	}

}
