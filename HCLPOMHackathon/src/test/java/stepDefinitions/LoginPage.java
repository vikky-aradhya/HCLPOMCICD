package stepDefinitions;

import cucumber.api.java.en.When;
import utils.BasePage;

public class LoginPage extends BasePage {

	@When("^User opens browser$")
	public void user_opens_browser() throws Throwable {
		try {
			openBrowser();
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			navigateToUrl();
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
