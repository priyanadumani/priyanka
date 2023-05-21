package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToSendkeys {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
	
		driver.get("https://www.amazon.com/s?k=home&i=garden&rh=n%3A1055398%2Cp_36%3A-5000&dc&language=en_US&_encoding=UTF8&crid=3GB8M9T62Z3SV&pd_rd_r=1e1d7c27-c08b-4b2f-b83b-aa0e633929e9&pd_rd_w=4YzqL&pd_rd_wg=jUrPN&pf_rd_p=370eaa7b-5006-435b-b633-dfb03c4adcab&pf_rd_r=AFMCSYZVKQS5KV5PS36K&qid=1655494902&rnid=386465011&sprefix=home+%2Caps%2C92&ref=pd_gw_unk");
		Thread.sleep(2000);
		
		WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTextBox.sendKeys("airdopes");
		searchTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.quit();		
		
		

	}

}
