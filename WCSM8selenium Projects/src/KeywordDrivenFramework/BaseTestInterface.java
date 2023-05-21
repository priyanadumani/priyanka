package KeywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestInterface extends Flib implements IAutoConstant{
	static WebDriver driver;

	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browservalue = flib.readPropertyData(EXCEL_PATH, "browser");
		String url = flib.readPropertyData(EXCEL_PATH, "url");

		if(browservalue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browservalue.equals("Firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		}
		else if(browservalue.equals("MSEdge"))
		{
			System.setProperty(EDGE_KEY, EDGE_KEY);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else
		{
			System.out.println("Invalid browser!!!");
		}

	}
}
