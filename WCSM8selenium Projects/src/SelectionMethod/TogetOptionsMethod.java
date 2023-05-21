package SelectionMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TogetOptionsMethod {
	public static void main(String[] args) {

		System.setProperty("wendriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Dell/Desktop/WCSM8WORKSPACE-SELENUIM/Web%20elements/Multistatic%20Dropdown.html");

		WebElement dropdown = driver.findElement(By.name("Menu"));

		Select sel = new Select(dropdown);
		// to get all options
		List<WebElement> allOptions = sel.getOptions();

		// to use looping statement for get the all options
		//	for(int i=0; i<allOptions.size();i++) {
		//		String options = allOptions.get(i).getText();
		//		System.out.println(options);
		//			
		//	}
		//	
		// For Advance loop
		for(WebElement op:allOptions)
		{
			String options = op.getText();
			System.out.println(options);
		}
		driver.quit();


	}
}