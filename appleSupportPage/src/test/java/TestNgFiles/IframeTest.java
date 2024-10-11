package TestNgFiles;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.IframePage;

public class IframeTest {
	private IframePage frame;

	@BeforeTest
	public void loadPageObject() {
		frame = new IframePage();
	}

	@Test
	public void testIframe() {
		frame.launchUrl("https://www.w3schools.com/html/html_id.asp");
		frame.clickNextBtn();
	}
}
