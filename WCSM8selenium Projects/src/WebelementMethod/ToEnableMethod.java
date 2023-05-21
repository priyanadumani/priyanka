package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToEnableMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
		Thread.sleep(2000);


		driver.findElement(By.name("username")).sendKeys("Priyanka");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("abc@123");
		Thread.sleep(2000);
		WebElement login= driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		
		
		System.out.println((login.isEnabled()));

		//driver.quit();

	}

}
