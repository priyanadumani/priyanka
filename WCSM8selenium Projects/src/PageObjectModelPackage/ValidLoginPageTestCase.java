package PageObjectModelPackage;

import java.io.IOException;

public class ValidLoginPageTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// read data from property file
		Flib flib = new Flib();
		
		// To open Browser
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
		
		HomePage hp = new HomePage(driver);

		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH,"password"));
		Thread.sleep(2000);
		
		hp.logOutMethod();
		Thread.sleep(2000);
		
		bt.teardown();

		
	}

}
