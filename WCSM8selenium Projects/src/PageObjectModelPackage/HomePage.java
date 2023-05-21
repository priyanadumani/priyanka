package PageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
	
	@FindBy(xpath="//A[@class='content tt_selected selected']/DIV[2]/IMG") private WebElement TimeTrack;
	
	@FindBy(xpath="//A[@class='content tasks']/IMG[@class='sizer']") private WebElement Tasks;
	
	@FindBy(xpath="//A[@class='content reports']/IMG[@class='sizer']") private WebElement Repors;
	 
	@FindBy(xpath="//A[@class='content users']/IMG[@class='sizer']") private WebElement UsersModule;

	
	// initialization
	public HomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

	
	// utilization
	//------getter----------
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	//---------setter-----------
	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}

	public WebElement getTimeTrack() {
		return TimeTrack;
	}

	public void setTimeTrack(WebElement timeTrack) {
		TimeTrack = timeTrack;
	}

	public WebElement getTasks() {
		return Tasks;
	}

	public void setTasks(WebElement tasks) {
		Tasks = tasks;
	}

	public WebElement getRepors() {
		return Repors;
	}

	public void setRepors(WebElement repors) {
		Repors = repors;
	}

	public WebElement getUsers() {
		return UsersModule;
	}

	public void setUsers(WebElement users) {
		UsersModule = users;
	}
	
	
	//operational method
	public void logOutMethod()
	{
		logoutLink.click();
	}
	
	public void UsersModule()
	{
		UsersModule.click();
	}
	
	
	
	
	
	

}
