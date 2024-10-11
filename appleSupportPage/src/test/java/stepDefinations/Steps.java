package stepDefinations;

import java.util.List;

import org.junit.Assert;

import com.selenium.core.GlobalVariables;
import com.selenium.core.UtilityClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;

public class Steps {
	static UtilityClass util;
	static Homepage page;

	@BeforeAll
	public static void loadObjects() {
		util = UtilityClass.getInstance();
		page = new Homepage();
	}

	@AfterAll
	public static void killDriver() {
		page.killDriver();
	}

	@Given("Launch the browser and open the apple support appilication")
	public void launch_the_browser_and_open_the_apple_support_appilication() {
		page.launchUrl(GlobalVariables.url);
	}

	@Then("verify all menu headers")
	public void verify_all_menu_headers(DataTable table) {
		List<String> headersList = table.asList();
		for (String header : headersList)
			Assert.assertEquals(header + " not displayed", true, page.menuHeadersAreDisplayed(header));
	}

	@Then("verify apple support headers")
	public void verify_apple_support_headers(DataTable table) {
		List<String> supportHeaders = table.asList();
		for (String supportHeader : supportHeaders) {
			Assert.assertEquals(supportHeader + " not displayed", true, page.supportHeadersAreDisplayed(supportHeader));
		}
	}

	@Then("verify apple support tabs")
	public void verify_apple_support_tabs(DataTable table) {
		List<String> supportTabs = table.asList();
		for (String supportTab : supportTabs) {
			Assert.assertEquals(supportTab + " not displayed", true, page.supportTabsAreDisplayed(supportTab));
		}
	}

	@When("user enters search criteria as {string} and select appropriate option")
	public void user_enters_search_criteria_as_and_select_appropriate_option(String string) {
		page.enterTextInSearchBoxAndChooseOption(string);

	}

	@Then("verify the header is displayed based on the option selected")
	public void verify_the_header_is_displayed_based_on_the_option_selected() {
		Assert.assertEquals(true, page.headerTextIsDisplayed());
	}

	@Then("get the estimation by selecting product as {string} and model as {string}")
	public void get_the_estimation_by_selecting_product_as_and_model_as(String product, String model) {
		page.selectOptionFromProductDropdown(product, model);
	}

	@Then("fetch the estimation cost for both")
	public void fetch_the_estimation_cost_for_both() {
		page.getEstimationText();
	}

	@After
	public void screenshot(Scenario scenario) {
		if (scenario.isFailed())
			util.takeScreenshot(scenario.getName());
	}

}
