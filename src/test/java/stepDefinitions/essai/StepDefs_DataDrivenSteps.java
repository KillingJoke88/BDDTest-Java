package stepDefinitions.essai;

import cucumber.api.java.en.Then;
//import seleniumPages.Page_GoogleHomepage;

public class StepDefs_DataDrivenSteps {

	//Page_GoogleHomepage googleHomepage = new Page_GoogleHomepage();
	
	@Then("I search for {string} on Google")
	public void i_search_for_on_Google(String string) {
		System.out.println("Search on Google Page : " + string);
		//googleHomepage.searchOnGoogleHomepage(string);
	}
}
