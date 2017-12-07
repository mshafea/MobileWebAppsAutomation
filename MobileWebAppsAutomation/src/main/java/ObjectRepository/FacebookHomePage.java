package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FacebookHomePage {

	AndroidDriver<AndroidElement> driver;	
	public FacebookHomePage(AndroidDriver<AndroidElement> driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="m_login_email")
	WebElement email;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login_button;
	
	public void enter_credential(String username, String pass){
		email.sendKeys(username);
		password.sendKeys(pass);
		login_button.click();	
	}
	
	public String getpagetitle(){
		return driver.getTitle();
	}
	
	
	
	
	
}
