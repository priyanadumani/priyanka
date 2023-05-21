package ReadPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readPropertyData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	FileInputStream fis = new FileInputStream("./testData/config.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String data = prop.getProperty("username");
	System.out.println(data);

	}

}
