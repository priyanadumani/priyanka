import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGLays {

		// TODO Auto-generated method stub
	public void lays() {
		
		System.setProperty("webdriver.chormer.diver","./drivers/chromerdriver.exte");
		WebDriver driver=new ChromeDriver();
			
			driver.get("https://enjoymaaza.com/");
			driver.quit();

	}

}
