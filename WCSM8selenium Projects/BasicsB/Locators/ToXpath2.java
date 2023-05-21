//Launch Acti time

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToXpath2 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
	     ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	       
	    ChromeDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    
	    driver.get("http://desktop-abu8m6i/login.do");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.name("username")).sendKeys("admin");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    Thread.sleep(2000);
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(5000);
	    driver.close();
	}

}
