package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentonSelectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wendriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Dell/Desktop/WCSM8WORKSPACE-SELENUIM/Web%20elements/Multistatic%20Dropdown.html");
		WebElement dropdown = driver.findElement(By.name("Menu"));
		
		Select sel = new Select(dropdown);
		List<WebElement> alloptions = sel.getOptions();
		
		// Select the options without using select() Method
		// For each loop
		for(WebElement op:alloptions) {
			if(op.getText().equals("vadapav")) {
				op.click();
			}
			
		}
	}

}
