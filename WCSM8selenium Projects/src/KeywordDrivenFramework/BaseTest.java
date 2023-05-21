package KeywordDrivenFramework;

import java.io.IOException;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest extends KeywordDrivenFramework.Flib {

	// Globalization
	static WebDriver driver;

	// OpenBroser()
	public void openBrowser() throws IOException {

		
		KeywordDrivenFramework.Flib flib = new KeywordDrivenFramework.Flib();
		 
		String browservalue =flib.readPropertyData("./testData/config.properties","browser");
    	String url = flib.readPropertyData("./testData/config.properties", "url");

		if(browservalue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chromer.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}
		else if(browservalue.equalsIgnoreCase("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browservalue.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		}
		else
		{
			System.out.println("Invalid Browser displayed!!!!!");
		}

	}
	// CloseBrowser
	public void closeBrowser()
	{
		driver.quit();
	}

}
