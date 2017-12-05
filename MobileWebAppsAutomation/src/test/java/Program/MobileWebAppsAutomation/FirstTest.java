package Program.MobileWebAppsAutomation;

import java.net.MalformedURLException;
import org.testng.annotations.Test;
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
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Test");
		driver.findElementsByClassName("android.widget.Button").get(1).click();	
	}

}
