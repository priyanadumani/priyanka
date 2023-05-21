package SelectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wendriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		// using single select dropdown
		driver.get("file:///C:/Users/Dell/Desktop/WCSM8WORKSPACE-SELENUIM/Web%20elements/Singlestatic%20Dropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("Menu"));
		Select sel = new Select(dropdown);
		
		boolean options = sel.isMultiple();
		System.out.println(options); /// False- is not use for single select dropdown
	}

}
