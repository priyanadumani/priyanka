package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetRectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement button = driver.findElement(By.xpath("//button[text()=' Login ']"));
		Rectangle rect = button.getRect();
		
		//Get the Location of webelement
		int xaxis = rect.getX();
		int yaxis = rect.getY();
		
		System.out.println("X axis :"+xaxis+",Y axis:"+yaxis);
		
		// get height and width of webelement
		int height = rect.getHeight();
		int width = rect.getWidth();
		
		System.out.println("Hight :"+height+",Width :"+width);
		
		
		
	}

}
