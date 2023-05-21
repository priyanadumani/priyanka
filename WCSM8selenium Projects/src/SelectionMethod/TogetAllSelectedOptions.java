package SelectionMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TogetAllSelectedOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wendriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Dell/Desktop/WCSM8WORKSPACE-SELENUIM/Web%20elements/Multistatic%20Dropdown.html");
		WebElement dropdown = driver.findElement(By.name("Menu"));

		Select sel = new Select(dropdown);

		// How to multiple options
		for(int i=0; i<5; i++) {
			sel.selectByIndex(i);
		}
		List<WebElement> options= sel.getAllSelectedOptions();
		for(WebElement op:options) {
			String allopt = op.getText();
			System.out.println(allopt);

		}

		// Get All selected options

		driver.quit();
	}

}
