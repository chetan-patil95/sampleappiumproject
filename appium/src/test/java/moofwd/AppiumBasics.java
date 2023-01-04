package moofwd;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AppiumBasics {
	
	AndroidDriver<WebElement> driver;
	@Test
	public void appiumTest() throws MalformedURLException {
		
//		UiAutomator2Options options = new UiAutomator2Options();
//		options.setDeviceName("Pixel 3 API 30");
//		options.setApp("//Users//chetanpatil//eclipse-workspace-myappiumtest//appium//src//test//java//resources//ApiDemos-debug.apk");
//		
//		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
//		driver.cl
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("deviceName", "Pixel 3 API 30");
		capabilities.setCapability("app", "//Users//chetanpatil//eclipse-workspace-myappiumtest//appium//src//test//java//resources//ApiDemos-debug.apk");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
//		driver.resetApp();
		driver.closeApp();
	}

}
