package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFireFox {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
		Thread.sleep(2000);


	}

}
