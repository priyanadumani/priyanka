package PageObjectModelPackage;

public class WorkLib extends BaseTest{
	
	public void handleConfirmationPopup()
	{
		driver.switchTo().alert().accept();
	}

}