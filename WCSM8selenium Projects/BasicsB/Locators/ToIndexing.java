package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToIndexing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromer.driver", "./drivers/chromedriver.exe");
	     ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	       
	    ChromeDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.woodenstreet.com/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//ul[@class='container flex']/ul/li[4]")).click();
	    Thread.sleep(2000);
	    
	   

	}

}
