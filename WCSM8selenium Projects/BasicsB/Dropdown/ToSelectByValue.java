package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToSelectByValue {

	public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");

				ChromeDriver driver=new ChromeDriver(co);
				driver.manage().window().maximize();
				
				driver.get("https://www.dream11.com/");
				Thread.sleep(2000);
				
				driver.findElement(By.id("regEmail")).sendKeys("1234567890");
				
				driver.findElement(By.id("regUser")).click();
	
	}

}
