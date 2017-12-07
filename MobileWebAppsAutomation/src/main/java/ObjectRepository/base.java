package ObjectRepository;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {

	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,30);
	//cap.setCapability("chromedriverExecutable", "C:\\Integrant\\ChromeDriver\\chromedriver.exe");
	AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	return driver;
	}

	@BeforeSuite
	public void prereq() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start C:\\Android\\startappium.bat");
		Thread.sleep(20000);
	}
}
