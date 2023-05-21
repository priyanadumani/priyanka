package PageObjectModelPackage;

import java.io.IOException;

public class InvalidLoginTestcase extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Flib flib = new Flib();
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
		int rc = flib.rowCount(EXCEL_PATH, "Invalidcreds");
		for(int i=1; i<=rc; i++) {
		
		String invalidusername = flib.readExcelData(EXCEL_PATH, "Invalidcreds", i, 0);
		String invalidpassword = flib.readExcelData(EXCEL_PATH, "Invalidcreds", i,1);
		
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		hp.logOutMethod();
		
		lp.invalidLogin(invalidusername, invalidpassword);
		
		Thread.sleep(2000);
		}
	}

}
