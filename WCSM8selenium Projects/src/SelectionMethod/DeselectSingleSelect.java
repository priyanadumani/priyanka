package SelectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdrive.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Dell/Desktop/WCSM8WORKSPACE-SELENUIM/Web%20elements/Multistatic%20Dropdown.html");
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.name("Menu"));
		
		// Select option
		Select sel = new Select(dropdown);
		Thread.sleep(2000);
		sel.selectByIndex(5);
		
		// Deselect option
		Thread.sleep(2000);
		sel.deselectByIndex(5);
		
		
		
		
		
	}

}
