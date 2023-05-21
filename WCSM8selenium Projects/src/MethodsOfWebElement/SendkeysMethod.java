
package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendkeysMethod {

	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");

				ChromeDriver driver=new ChromeDriver(co);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.get("http://desktop-abu8m6i/login.do");
				WebElement username = driver.findElement(By.name("username"));
				username.sendKeys("admin");
				
				WebElement password = driver.findElement(By.name("pwd"));
				password.sendKeys("manager");
				Thread.sleep(2000);
				
				
				
				// Refresh of page
				driver.navigate().refresh();
				
				
	}

}
