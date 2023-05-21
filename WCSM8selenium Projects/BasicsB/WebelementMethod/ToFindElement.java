package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToFindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	WebDriver driver=new ChromeDriver(co);
	
	driver.manage().window().maximize();
	
	driver.get("http://desktop-abu8m6i/login.do");
	
	WebElement userTextBox=driver.findElement(By.name("username"));
	userTextBox.sendKeys("admin");
	System.out.println(userTextBox);
	
	driver.quit();	

	}

}
