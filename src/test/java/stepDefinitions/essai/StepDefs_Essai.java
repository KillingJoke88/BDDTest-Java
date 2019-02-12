package stepDefinitions.essai;

import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import seleniumPages.Page_GoogleHomepage;

public class StepDefs_Essai {

	//Page_GoogleHomepage googleHomepage = new Page_GoogleHomepage();
	
	@Given("I launch Chrome browser")
	public void i_launch_Chrome_browser() {
		System.out.println("Launch Chrome");
		/*System.setProperty("webdriver.chrome.driver", "D:\\TOOLS\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		googleHomepage.launchBrowser();*/
	}

	@When("I open Google Homepage")
	public void i_open_Google_Homepage() {
		System.out.println("Open Google");
		//googleHomepage.openGoogleURL();
	}

	@Then("I verify that the page displays search text box")
	public void i_verify_that_the_page_displays_search_text_box() {
		System.out.println("Check search box");
		//googleHomepage.checkSearchBoxIsDisplayed();
	}

	@Then("the page displays Google Search button")
	public void the_page_displays_Google_Search_button() {
		System.out.println("Check search button");
		//googleHomepage.checkGoogleSearchButtonIsDisplayed();
	}

	@Then("the page displays Im Feeling Lucky button")
	public void the_page_displays_Im_Feeling_Lucky_button() {
		System.out.println("Check feeling lucky button");
		//googleHomepage.checkImFeelingLuckyButtonIsDisplayed();
	}
}
