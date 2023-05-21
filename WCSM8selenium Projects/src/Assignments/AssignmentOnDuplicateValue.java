package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnDuplicateValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Dell/Desktop/WCSM8WORKSPACE-SELENUIM/Web%20elements/Singlestatic%20Dropdown.html");

		WebElement dropdown = driver.findElement(By.name("Menu"));

		//To handle dropdown create obj of select class
		Select sel = new Select(dropdown);

		// get all options
		List<WebElement> allOptions = sel.getOptions();

		// to eliminate the duplicates and maintain the order of insertion we use
		TreeSet<String> ts = new TreeSet<String>();

		//to read the list by elimiation duplicates
		for(int i=0; i<allOptions.size(); i++) 
		{
			//get the options & text of options
			String opp = allOptions.get(i).getText();

			///add the text of options to TreeSet
			ts.add(opp);	
		}
			//to read the options from set
			for(String options:ts) {
				Thread.sleep(2000);
				System.out.println(options);

			}

		driver.quit();

		}

	}
