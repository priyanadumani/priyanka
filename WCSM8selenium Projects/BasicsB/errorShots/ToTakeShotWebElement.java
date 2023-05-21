package ToTakeScreenshot.errorShots;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToTakeShotWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	WebDriver driver=new ChromeDriver();
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	driver.get("https://lays.com/");
	Thread.sleep(2000);
	
		
	File destination=new file("./errorShots/image1.png");
	
	
	}

}
