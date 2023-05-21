package Loaders;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
			Thread.sleep(2000);

	}

}
