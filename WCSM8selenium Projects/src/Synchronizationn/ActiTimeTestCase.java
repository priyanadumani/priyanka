package Synchronizationn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("http://desktop-abu8m6i/login.do");

		if(driver.getTitle().equals("actiTIME - Login"))
		{
			System.out.println("Login page Title is Match, Testcase Passed!");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			
		}
		else {
			System.out.println("TestCase Failed!");
			
		}
		
		if(driver.getTitle().equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Home page Title is Match, Testcase Passed!");
			
		}
		else {
			System.out.println("TestCase Failed!");
		
	}
	}
}
