package SelectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirseSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		driver.get("file:///C:/Users/Dell/Desktop/WCSM8WORKSPACE-SELENUIM/Web%20elements/Multistatic%20Dropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("Menu"));
		
		Select sel = new Select(dropdown);
		for(int i=1; i<6; i++)
		{
			Thread.sleep(2000);
			sel.deselectByIndex(i);
			
		}
		Thread.sleep(2000);
		WebElement options = sel.getFirstSelectedOption();
		String value = options.getText();
		System.out.println(value);

	}

}
