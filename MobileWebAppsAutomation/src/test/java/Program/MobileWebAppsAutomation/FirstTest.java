package Program.MobileWebAppsAutomation;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import ObjectRepository.FacebookHomePage;
import ObjectRepository.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FirstTest extends base {

	
	/*@BeforeSuite
	public void prereq() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start C:\\Android\\startappium.bat");
		Thread.sleep(20000);
	}*/
	@Test
	public void Test() throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		FacebookHomePage fbhp = new FacebookHomePage(driver);
		driver.get("https://facebook.com");
		System.out.println(fbhp.getpagetitle());
		fbhp.enter_credential("test", "P@ssw0rd");

	}

}
