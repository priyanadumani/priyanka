package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToFrame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		
		driver.findElement(By.id("montana")).click(); //State
		driver.findElement(By.xpath("(//a[@class='button compact yellow'])[1]")).click(); //signup button
		
		driver.close();
	}

}
