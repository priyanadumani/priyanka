package DataDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToReadDataFromActiTime {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("./testData/JsonData.json");
		JSONParser parser = new JSONParser();
		  
		// json=(JSONObject)perser.parse(fr);
		
		System.setProperty("webdriver.chromer.driver", "./drivers/chromerdriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://desktop-abu8m6i/login.do");
		
//		driver.findElement(By.name("username")).sendKeys((String)json.get("username"));
//		driver.findElement(By.name("pwd")).sendKeys((String)json.get("password"));
//		driver.findElement(By.id("loginButton")).click();
//		
	
	}

}
