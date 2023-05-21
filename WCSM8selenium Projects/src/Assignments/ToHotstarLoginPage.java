//WAST automate hotstar Login page
package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHotstarLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);

		driver.manage().window().maximize();
		
		driver.get("https://www.hotstar.com/");
		Thread.sleep(2000);
		


	}

}
