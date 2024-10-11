package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.IframePage;

public class IframeSupportSteps {

	private IframePage frame;

	@Before
	public void loadObjects() {
		frame = new IframePage();
	}

	@Given("Lanch the iframe test URL")
	public void lanch_the_iframe_test_url() {
		frame.launchUrl("https://www.w3schools.com/html/html_id.asp");
	}

	@When("OPen the iFrame page by clicking on the next button")
	public void o_pen_the_i_frame_page_by_clicking_on_the_next_button() {
		frame.clickNextBtn();
	}

	@Then("Click on the {string} button and very the title.")
	public void click_on_the_button_and_very_the_title(String string) {
		frame.switchFrame();
		frame.tutorialPage(string);
		Assert.assertEquals(frame.getHeaderText(), "HTML Introduction");
	}

	@Then("Verify default header.")
	public void verify_default_header() {
		frame.switchToDefalut();
		Assert.assertEquals(frame.getMainHeaderText(), "HTML Iframes");
	}

}
