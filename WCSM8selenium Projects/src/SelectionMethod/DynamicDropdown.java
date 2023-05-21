package SelectionMethod;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Dell/Desktop/WCSM8WORKSPACE-SELENUIM/Web%20elements/Multistatic%20Dropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("Menu"));
		
		// Selection method
		Select sel = new Select(dropdown);
		for(int i=0; i<7; i++) {
					
			Thread.sleep(3000);
			sel.selectByIndex(i);
		}
		// Deslection of Multiple Value
		Thread.sleep(2000);
		sel.selectByValue("v2");
		
		Thread.sleep(2000);
		sel.deselectByValue("v6");
	}
	
	
}
