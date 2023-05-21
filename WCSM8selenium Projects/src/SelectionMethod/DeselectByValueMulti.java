package SelectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValueMulti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Dell/Desktop/WCSM8WORKSPACE-SELENUIM/Web%20elements/Multistatic%20Dropdown.html");

		WebElement dropdown = driver.findElement(By.name("Menu"));

		//Select Multiple option
		Select sel = new Select(dropdown);
		for(int i=0; i<7; i++)
		{
			if(i%2==0) {
				Thread.sleep(2000);
				sel.selectByIndex(i);
			}else {
				System.out.println("It's odd place");

			}
		}
		for(int i=0; i<7; i++) {
			if(i%2==0) {

				Thread.sleep(2000);
				sel.deselectByIndex(i);

			}
			else {
				System.out.println("it's odd place");
			}

		}

	}}