package WebelementMethod;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToFindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);


		driver.switchTo().activeElement().sendKeys("Dosa");
		Thread.sleep(2000);

		List<WebElement> DosaOptions = driver.findElements(By.xpath("//div[@class='lnnVSe']"));

		for(int i=0; i<DosaOptions.size(); i++)
		{
			String Dosa = DosaOptions.get(i).getText();
			System.out.println(Dosa);
			Thread.sleep(2000);

		}



	}

}
