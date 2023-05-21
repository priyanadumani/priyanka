package PageObjectModelPackage;

import java.io.IOException;

public class CreateUSerTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Flib flib = new Flib();
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		hp.UsersModule();
		
		Thread.sleep(2000);
		UserListPage ulp = new UserListPage();
		
		String usn = flib.readExcelData(EXCEL_PATH, "CreateUser", 1, 0);
		String pass = flib.readExcelData(EXCEL_PATH, "CreateUser", 1, 1);
		String Fn = flib.readExcelData(EXCEL_PATH, "CreateUser", 1, 2);
		String Ln = flib.readExcelData(EXCEL_PATH, "CreateUser", 1, 3);
		
		Thread.sleep(2000);
		ulp.createUserMethod(usn, pass, Fn, Ln);
		Thread.sleep(2000);
		
		
		
		
				}

}
