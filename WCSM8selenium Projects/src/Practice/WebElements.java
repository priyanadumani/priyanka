package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		
		//sendkeys
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Mobiles");
		
		//click()
		WebElement mag = driver.findElement(By.id("nav-search-submit-button"));
		mag.click();
		
		//clear
	
		//getText
		String text = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).getText();
		System.out.println("Text : "+text);
		
		//getAttribute
		WebElement attribute = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]"));
		String att = attribute.getAttribute("class");
		System.out.println("Attribute: "+att);
		
		//getCCSvalue
		WebElement CSS = driver.findElement(By.id("nav-link-accountList"));
		String color = CSS.getCssValue("class");
		System.out.println(color);
		
		//getLocation
		
		WebElement loc = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']"));
		Point lc = loc.getLocation();
		int xaxis = lc.getX();
		int yaxis = lc.getY();		
		System.out.println("Xaxis: "+xaxis+", Yaxis: "+yaxis);
		
		//getRect()
		WebElement rect = driver.findElement(By.xpath("//img[@class='_bGlmZ_image_1pfbQ']"));
		Rectangle rec = rect.getRect();
		int hight = rec.getHeight();
		int width = rec.getWidth();
		System.out.println("Hight: "+hight+ ", width: "+width);
		
		//getTagname
		WebElement tagname = driver.findElement(By.xpath("//img[@class='_bGlmZ_image_1pfbQ']"));
		String tag = tagname.getTagName();
		System.out.println(tag);
		
		//Isenable()
		WebElement isenable = driver.findElement(By.xpath("(//span[text()='Deal of the Day'])[1]"));
		boolean is = isenable.isEnabled();
		System.out.println(is);
		
		boolean dispaly = isenable.isDisplayed();
		System.out.println(dispaly);

		boolean select = isenable.isSelected();
		System.out.println(select);
		
		
		
		
		

	}

}
