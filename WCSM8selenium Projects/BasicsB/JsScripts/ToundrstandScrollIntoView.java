package JsScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToundrstandScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.get("https://www.naukri.com/registration/createAccount");
		WebElement resume = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		
		js.executeScript("arguments[0].scroollIntoView(false)", resume);
		Thread.sleep(2000);
		
		driver.quit();
	}

}
