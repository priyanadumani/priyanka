package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class IsEnableMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("Priyanka");
		driver.findElement(By.name("password")).sendKeys("123456");
		WebElement enable = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		boolean verify = enable.isEnabled();
		System.out.println(verify); ///True
		

	}

}
