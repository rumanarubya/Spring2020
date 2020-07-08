package windowHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class windowTabhandle {


	WebDriver driver;
	
	@BeforeTest
	public void login() throws InterruptedException {

		// Set Chrome Driver as your default Driver
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		// Instantiate chromeDriver object
		 driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// delete cookies and history
		driver.manage().deleteAllCookies();

		// maximize all browser
		driver.manage().window().maximize();

		// go to site
		driver.get("https://www.yahoo.com/");
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void  windowTab() throws Exception {
		
		driver.findElement(By.xpath("//input[@id=\"header-search-input\"]")).sendKeys("xpath");
		driver.findElement(By.xpath("//button[@id=\"header-desktop-search-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();
		
	}
}
