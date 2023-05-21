package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToDemoshopLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
	     ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	       
	    ChromeDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    
	    driver.get("https://demowebshop.tricentis.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Log in")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    Thread.sleep(2000);
	    
	    String error = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
	    System.out.println(error);
	    
	    String errormsg = driver.findElement(By.xpath("//li[contains(text(),'customer')]")).getText();
	    System.out.println(errormsg);
	    
	}

}
