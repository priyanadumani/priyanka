package Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFlipkartWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("samsung s23 ultra");
		
		//Handle PArent browser
		String ParentHandle = driver.getWindowHandle();
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
		//Handle parent or Child or all window
				Set<String> allHanlde = driver.getWindowHandles();
				for(String wh:allHanlde) {
					if(!ParentHandle.equals("SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)")) {
						// transfer to child browser
						driver.switchTo().window(wh);
						}
				}
				String actualTitle = driver.getTitle();
				if(!actualTitle.equals("SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)")) {
					System.out.println("Its child window");
				}
				else {
					System.out.println("Its not child window");
				}
				WebElement ScrollTill = driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]"));
				Point point = ScrollTill.getLocation();
				int Xaxis = point.getX();
				int yaxis = point.getY();
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy("+Xaxis+","+(yaxis-250)+")");
				
				
	}

}
