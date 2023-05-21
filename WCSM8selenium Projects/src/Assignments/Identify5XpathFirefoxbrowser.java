package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Identify5XpathFirefoxbrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
	
		driver.get("https://www.mozilla.org/en-GB/firefox/browsers/");
		//driver.findE("//div[text()='fake-caret']")

	}

}
