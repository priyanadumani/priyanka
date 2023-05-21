package ToTakeScreenshot.errorShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreen2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);

		//TakesScreenshot ts= (TakesScreenshot) driver;

		driver.get("https://www.amazon.in/");
		WebElement img = driver.findElement(By.xpath("//img[@alt='Sixer - Season 1 - Watch Free']"));

		File destination = new File("./errorShots/image2.png");

		File WebElement=img.getScreenshotAs(OutputType.FILE);

		FileHandler.copy(WebElement, destination);

		driver.quit();


	}

}
