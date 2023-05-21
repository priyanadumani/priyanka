package PageObjectModelPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserListPage {
	
	@FindBy(xpath="//input[@value='Create New User']") private WebElement createNewUser;
	@FindBy(xpath="//*[@name='username']") private WebElement usernameTB;
	@FindBy(xpath="//*[@name='passwordText']")private WebElement passwordTB;
	@FindBy(xpath="//*[@name='passwordTextRetype']")private WebElement RetypePassword;
	@FindBy(xpath="//*[@name='firstName']") private WebElement Fname;
	@FindBy(xpath="//*[@name='lastName']")private WebElement Lname;
	@FindBy(xpath="//input[@type='submit']") private WebElement createUser;
	@FindBy(xpath = "//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]")private WebElement cancel;
	@FindBy(xpath="//*[@name='workdayDurationStr']") private WebElement workdays;
	@FindBy(xpath = "//input[@value='Delete This User']") private WebElement deleteUSer;
	
	//Initialization

	public WebElement getCreateNewUser() {
		return createNewUser;
	}
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getRetypePassword() {
		return RetypePassword;
	}
	public WebElement getFname() {
		return Fname;
	}
	public WebElement getLname() {
		return Lname;
	}
	public WebElement getCreateUser() {
		return createUser;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getWorkdays() {
		return workdays;
	}
	public WebElement getDeleteUSer() {
		return deleteUSer;
	}
	
	//Operation
	public void createUserMethod(String usn, String pass, String fn, String ln) throws InterruptedException {
		createNewUser.click();
		
		usernameTB.sendKeys(usn);
		Thread.sleep(2000);
		
		passwordTB.sendKeys(pass);
		RetypePassword.sendKeys(pass);
		Thread.sleep(2000);
		
		Fname.sendKeys(fn);
		Thread.sleep(2000);

		
		Lname.sendKeys(ln);
		Thread.sleep(2000);

		
		createNewUser.click();
				
	}
	
	public void deleteUserMethod() throws InterruptedException {
		createNewUser.click();
		Thread.sleep(2000);
		deleteUSer.click();
		
		new WorkLib();
	}
	
	
	
	

}
