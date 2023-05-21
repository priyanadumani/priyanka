//Flifkart
package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToXpathByAxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click(); // Cancel Popup
		Thread.sleep(2000);

		
		driver.findElement(By.name("q")).sendKeys("hp laptop"); //search textbox
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click(); //search symbol		
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//span[text()='Filters']")).click();
		Thread.sleep(2000);

	
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='HP')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Windows 11')]")).clear();	
		Thread.sleep(2000);

		
		
		
	}

		
		
		
		
		
	}
















