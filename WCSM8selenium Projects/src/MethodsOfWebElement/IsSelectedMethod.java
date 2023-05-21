package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-abu8m6i/login.do");
		
		driver.findElement(By.name("username")).sendKeys("Priyanka");
		driver.findElement(By.name("pwd")).sendKeys("Priya@11");
		WebElement check = driver.findElement(By.name("remember"));
		boolean verify = check.isSelected();
		System.out.println(verify);
		check.click(); /// necessary
		
		boolean verify1 = check.isSelected();
		System.out.println(verify1);
		
		Thread.sleep(5000);

	}

}
