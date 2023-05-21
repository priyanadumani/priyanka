//getting popup notification/advertiment highlights we can select


package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAttributemethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(2000);
		
		WebElement img=driver.findElement(By.xpath("(//img[contains(@alt,'buy')])[3]"));
		System.out.println(img.getAttribute("alt"));

		driver.quit();
		
	}

}
