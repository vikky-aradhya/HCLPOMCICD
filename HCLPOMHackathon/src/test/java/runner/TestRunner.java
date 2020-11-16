package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","html:target/cucumber"},
		features = {"src/test/resources/features"},
		glue = {"stepDefinitions/"},
		tags = {"@Login_user"},
		monochrome = true,
		dryRun = false
		)

public class TestRunner {
	
	//before classs
	@BeforeClass
	public static void setUp() {
		BasePage.init_extentReport();
	}
	
	@AfterClass
	public static void tearDown() {
        BasePage.driver.quit();
        BasePage.generateExtentReport();
	}
	

}