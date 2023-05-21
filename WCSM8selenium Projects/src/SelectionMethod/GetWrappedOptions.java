package SelectionMethod;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedOptions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Dell/Desktop/WCSM8WORKSPACE-SELENUIM/Web%20elements/Multistatic%20Dropdown.html");

		WebElement dropdown = driver.findElement(By.name("Menu"));

		Select sel = new Select(dropdown);

		Thread.sleep(2000);
		WebElement options = sel.getWrappedElement();
		String value = options.getText();
		System.out.println(value);




	}

}
