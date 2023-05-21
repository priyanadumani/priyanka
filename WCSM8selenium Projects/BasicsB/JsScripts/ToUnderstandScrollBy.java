package JsScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandScrollBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromer.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.google.com/doodles");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(;;) {
		
			try {
				driver.findElement(By.linkText("Mother's Day 2023 (19 March)")).click();
				break;
			}catch(Exception e) {

				js.executeScript("Window.scrollBy(0,200)");
			}
		}
}
}
