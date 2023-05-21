package Assignments;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import MethodsOfWebElement.GetLocationMethod;

	// Handled Disabled WebElement
public class ScrollTillParticularElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://in.puma.com/in/en");

		WebElement shoes = driver.findElement(null);
		Point point = shoes.getLocation();
		int xaxis=point.getX();
		int yaxis=point.getY();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");

	}

}
