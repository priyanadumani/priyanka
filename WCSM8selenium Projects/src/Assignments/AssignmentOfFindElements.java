package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class AssignmentOfFindElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
		
		EdgeDriver driver = new EdgeDriver(eo);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click(); //popup

		
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		
				
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click(); 
		Thread.sleep(2000);
		
		//Name of Mobiles
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		// NAme & Price of Mobiles
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i=0; i<names.size(); i++)
		{
			 String nameOfMobiles = names.get(i).getText();
			
			for(int j=i; j<=i; j++)
			{
				String PriceOfMobiles = options.get(j).getText();
				System.out.println((nameOfMobiles+"  :"+PriceOfMobiles));
				Thread.sleep(2000);
				
			}
			System.out.println("No such Options");
			
		}
		
		

	}

}
