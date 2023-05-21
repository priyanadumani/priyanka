package DataDriver;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToReadDataFromJson {

	public static void main(String[] args) throws IOException, ParseException, InterruptedException {
		// file reader
		FileReader fr=new FileReader("./testData/JsonData.json");
		//object of file type
		JSONParser parser=new JSONParser();
		//read data in particular format
		JSONObject json=(JSONObject) parser.parse(fr);
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String testurl = (String) json.get("url");
		driver.get(testurl);
		System.out.println(json.get("name"));
		System.out.println(json.get("Price"));
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
