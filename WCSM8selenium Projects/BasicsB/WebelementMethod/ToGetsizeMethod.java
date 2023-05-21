//To get size of facebook 
package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToGetsizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		//Left alignment
		if(email.getRect().getX()==password.getRect().getX()) {
			System.out.println("Both aligned properly");
		}
		else {
			System.out.println("Left Alignment");
			
		}
		// Right Alignment
		if(email.getRect().getX()+email.getRect().getWidth()==password.getRect().getX()+password.getRect().getWidth()) {
			System.out.println("Both aligned properly");
		}
		else {
			System.out.println("Right Alignment");
		}
		
		//Override
		if(email.getRect().getY()+email.getRect().getWidth()==password.getRect().getY()+password.getRect().getWidth()) {
			System.out.println("Both aligned properly");
		}
		else {
			System.out.println("Overlapping Alignment");
		}
		
		System.out.println(email.getLocation());
		System.out.println(password.getLocation());
		
		driver.quit();
	}

}
