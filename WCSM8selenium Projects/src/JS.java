import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromer.driver", "./drivers/chromedriver.exe");
		WebDriver driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/campaign/landing.php");

		WebElement text = driver.findElement(By.name("custom_gender"));

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='kjlk'",text);



	}

}
