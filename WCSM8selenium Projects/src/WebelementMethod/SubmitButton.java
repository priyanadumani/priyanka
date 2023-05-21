//LinkedIN login button
package WebelementMethod;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SubmitButton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/home");
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//button[text()='Sign in']")).submit();




	}

}
