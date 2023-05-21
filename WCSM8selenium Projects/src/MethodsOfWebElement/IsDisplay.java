package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class IsDisplay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



		driver.get("https://www.netflix.com/in/login");

		WebElement usernameTB = driver.findElement(By.name("userLoginId"));
		WebElement passwordTB = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		if(usernameTB.isDisplayed())
		{
			usernameTB.sendKeys("abcd@123");
		}
		else 
		{
			System.out.println("will get Exception");
		}
		
		if(passwordTB.isDisplayed())
		{
			passwordTB.sendKeys("ab@1233");
		}
		else  {
			System.out.println("will get Exception");
		}

		if(button.isDisplayed()) {
			button.click();
		}
		else {
			System.out.println("will get Exception");
		}
		Thread.sleep(4000);
		driver.quit();
	}
}


