package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToIFrame {

	//Dream11

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.dream11.com/");
		//driver.switchTo().frame(0); ///(int,intex)

	  Object frame = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		//driver.switchTo().frame(frame); // string
		driver.switchTo().frame(frame);
		driver.findElement(By.id("regEmail")).sendKeys("1234567890");
		
		driver.findElement(By.id("regUser")).click();
		//driver.switchTo().parentFrame(); 
		driver.switchTo().defaultContent();

	}

}
