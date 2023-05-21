import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AunthonticationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co1=new ChromeOptions();
		co1.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co1);
		driver.manage().window().maximize();
		
		//username:password@
		driver.get("https://admin:admin@the-internet.herokuapp.com/");

	}

}
