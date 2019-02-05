package common;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeTest {

	@Test
	public void LaunchChrome_Method1() {
		System.setProperty("webdriver.chrome.driver", "D:\\TOOLS\\chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
}
