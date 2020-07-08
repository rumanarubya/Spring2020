package TesNGlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginbrowse {

	
	@Test
	public void loginsite() {
		
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		

		// Instantiate chromeDriver object
	WebDriver	 driver = new ChromeDriver();
	}
}
