// handle the get invalid credential while login
package WebelementMethod;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebelementClearmethod {

	public static void main(String[] args) throws InterruptedException {

		//
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("abcd");
		Thread.sleep(2000);


		WebElement password=driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("abc@123");
		Thread.sleep(2000);


		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(2000);

		String msg = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		System.out.println(msg);

		driver.quit();


	}

}
