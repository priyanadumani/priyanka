// Demoshop getinside
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToRealXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Jewelry")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Black & White Diamond Heart")).click();
		Thread.sleep(2000);
		
		
		String description = driver.findElement(By.xpath("Picture of Black & White Diamond Heart")).getText();
		System.out.println(description);
		Thread.sleep(2000);
		
		driver.quit();	
		
		
	}

}
