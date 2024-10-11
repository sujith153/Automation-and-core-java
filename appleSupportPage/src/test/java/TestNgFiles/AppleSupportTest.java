package TestNgFiles;

import org.junit.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.selenium.core.GlobalVariables;

import pages.Homepage;
@Listeners(MyTestListener.class)
public class AppleSupportTest {
	private Homepage home;

	@BeforeMethod
	public void load() {
		home = new Homepage();
		home.launchUrl(GlobalVariables.url);
	}

	@AfterSuite
	public void closeDriver() {
		home.killDriver();
	}

	@Test(groups = { "sanity", "regression" })
	public void case1() {
		String[] headers = { "Store", "Mac", "iPad", "iPhone", "Vision", "Watch" };
		for (String header : headers)
			Assert.assertEquals(header + " not displayed", true, home.menuHeadersAreDisplayed(header));
	}

	@Test(groups = { "regression" })
	public void case2() {
		String[] supportHeaders = { "Apple Vision Pro", "Mac", "iPad", "iPhone", "Apple Watch" };
		String[] supportTabs = { "Forgot Apple ID password", "Apple Repair", "Billing and subscriptions" };
		System.out.println("From the Test URL: "+home.getTestData("url"));
		for (String header : supportHeaders)
			Assert.assertEquals(header + " not displayed", true, home.supportHeadersAreDisplayed(header));

		for (String tab : supportTabs)
			Assert.assertEquals(tab + " not displayed", true, home.supportTabsAreDisplayed(tab));
	}

	@Test(groups = { "sanity" })
	public void case3() {
		home.enterTextInSearchBoxAndChooseOption("Screen broken");
		Assert.assertEquals(true, home.headerTextIsDisplayed());
		home.selectOptionFromProductDropdown("iPhone 14", "iPhone 14 Pro Max");
		home.getEstimationText();
	}

}
