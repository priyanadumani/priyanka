package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToDependentIndependentXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
	
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//driver.findElement(By.partialLinkText("Gift Cards\r\n"
			//	+ "        ")).click();
		
		List<WebElement> menubar =driver.findElements(By.xpath("//ul[@class='top-menu']"));
		
		for(WebElement el:menubar) {
			System.out.println(el.getText());
		}
		
	}

}
