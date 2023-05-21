package Synchronizationn;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeTeseCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("http://desktop-abu8m6i/login.do");


		//Explicit Wait
		String LoginPageTitle = driver.getTitle();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		if(wait.until(ExpectedConditions.titleContains(LoginPageTitle)))
		{	
			System.out.println("Login page Title is Match, Testcase Passed!"+LoginPageTitle);
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
		}
		else
		{		
			System.out.println("TestCase Failed!");
		}

		String HomePageTitle = driver.getTitle();
		if(wait.until(ExpectedConditions.titleContains(HomePageTitle)))
		{
			System.out.println("Home page Title is Match, Testcase Passed!"+HomePageTitle);

		}
		else {
			System.out.println("TestCase Failed!");
		}
	}

}
