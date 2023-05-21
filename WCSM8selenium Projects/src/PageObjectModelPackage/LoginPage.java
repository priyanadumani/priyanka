package PageObjectModelPackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// @FindBy Annotation
	// Using Encapsulation(Getter & Setter)
	
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="pwd") private WebElement passwordTB;
	@FindBy(id="loginButton")private WebElement loginButton;
	@FindBy(name="remember")private WebElement checkBox;
	@FindBy(linkText="Actimind Inc.")private WebElement ActiMindLink;
		
	// Initialization
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
				
	}	
	// Utilization (getter & setter() 

	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public void setUsernameTB(WebElement usernameTB) {
		this.usernameTB = usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public void setPasswordTB(WebElement passwordTB) {
		this.passwordTB = passwordTB;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public void setCheckBox(WebElement checkBox) {
		this.checkBox = checkBox;
	}
	public WebElement getActiMindLink() {
		return ActiMindLink;
	}
	public void setActiMindLink(WebElement actiMindLink) {
		ActiMindLink = actiMindLink;
	}
	
	// Operational Methods
	public void validLogin(String validUsername, String validPassword) throws InterruptedException
	{
		usernameTB.sendKeys(validUsername);
		Thread.sleep(2000);		
		passwordTB.sendKeys(validPassword);
		Thread.sleep(2000);		
		loginButton.click();
		
	}
	
	public void invalidLogin(String invalidUsername, String invalidPassword) throws InterruptedException {
		usernameTB.sendKeys(invalidUsername);
		passwordTB.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(2000);
		usernameTB.clear();
		
	}
}
