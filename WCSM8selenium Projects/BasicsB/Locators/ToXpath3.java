//Acti time Linktext

package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToXpath3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
	     ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	       
	    ChromeDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    
	    driver.get("http://desktop-abu8m6i/login.do");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.linkText("Actimind Inc.")).click();
	    Thread.sleep(2000);
	    
	    Set<String> allWindowID=driver.getWindowHandles();
	  
		
		allWindowID.remove(allWindowID);
		
		//for each loop
		for(String windowId: allWindowID) {
			driver.switchTo().window(windowId);
	
		}
				
		driver.quit();
		
	    

	}

}
