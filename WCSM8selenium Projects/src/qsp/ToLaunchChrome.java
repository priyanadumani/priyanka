package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToLaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		// Handle Illegal state exception
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Handle ConnectionFailed exception
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");	

		//To Launch chrome Browser		
		WebDriver driver=new ChromeDriver(co);

		//Maximize Browser
		driver.manage().window().maximize();
		Thread.sleep(5000);

		//close the Browser
		driver.close();

	}

}
