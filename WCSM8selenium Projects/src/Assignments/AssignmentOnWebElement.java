package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnWebElement {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		// 1-Sendkey()
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Mobiles");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		// 2-click
		WebElement symb = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		symb.click();
		
		// 3-gettext
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
				
		List<WebElement> price = driver.findElements(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_2kHMtA']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]"));
		for(int i=0; i<name.size(); i++) {
			String nameofMobile = name.get(i).getText();
			//System.out.println("Name :"+nameofMobile);
		

		for(int j=i; j<i;j++) {	
			String priceOfMobile = price.get(j).getText();
			System.out.println("Name :"+nameofMobile+",Price :"+priceOfMobile);
		}
		
		}
		
		// 4-Get Attribute of WebElement on webpage
		WebElement attribute = driver.findElement(By.xpath("//span[text()='CATEGORIES']"));
		String el = attribute.getAttribute("text");
		System.out.println(el);
		
		
		// 5- get CSsValue
		
		WebElement cssvalue = driver.findElement(By.linkText("Login"));
		String value = cssvalue.getCssValue("color");
		System.out.println(value);
		
		// 6- GetLocation
		WebElement loction = driver.findElement(By.xpath("(//div[@class='CXW8mj'])[1]"));
		Point loc = loction.getLocation();
		System.out.println(loc);
		
		// 7- GetRect
		WebElement rectanle = driver.findElement(By.xpath("(//div[@class='CXW8mj'])[1]"));
		Rectangle rect = rectanle.getRect();
		System.out.println(rect);
		
		// 8- Clear() webelement
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
