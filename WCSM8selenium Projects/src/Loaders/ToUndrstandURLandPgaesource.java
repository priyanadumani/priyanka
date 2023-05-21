package Loaders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToUndrstandURLandPgaesource {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allows-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);


	}

}
