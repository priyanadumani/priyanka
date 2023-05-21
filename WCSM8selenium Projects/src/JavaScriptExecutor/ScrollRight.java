package JavaScriptExecutor;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		// Scrolling operations
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// Scroll Right
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(5000,0)");

		// Scroll Left
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-900,0)");


	}

}
