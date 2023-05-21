package JsScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TounderstandScrollIntoView1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromer.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://polarbear.co.in/");
		
		//WebElement scroll = driver.findElement(By.xpath("(//div[@class='elementor-widget-wrap elementor-element-populated'])[4]"));
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
		
	}

}
