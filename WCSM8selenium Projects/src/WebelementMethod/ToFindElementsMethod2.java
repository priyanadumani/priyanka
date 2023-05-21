
package WebelementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToFindElementsMethod2 {

	public static void main(String[] args) throws InterruptedException {

		// Amazon

		System.setProperty("webdriver.chome.driver","/drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		

		driver.switchTo().activeElement().sendKeys("Bags");
		Thread.sleep(2000);

		List<WebElement> WatchList = driver.findElements(By.xpath("//div[@class='left-pane-results-container']"));

		driver.findElement(By.xpath("//input[@class='a-button-input'][1]")).click(); //Handle Popup MSg 
		Thread.sleep(1000);

		for(int i=0; i<WatchList.size(); i++)
		{
			String watch = WatchList.get(i).getText();
			System.out.println(watch);
			Thread.sleep(2000);
		}


	}

}
