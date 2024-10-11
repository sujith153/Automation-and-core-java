package pages;

import org.openqa.selenium.By;

public class Homepage extends Basepage {
	String menuHeaders = "[aria-label='%s']";
	String appleSupportHeaders = "[aria-label='%s Support']";
	String appleSupportTabs = "[aria-label='%s']";
	By supportSearch = By.cssSelector("[id='as-search-input']");
	By supportSearchOption = By.cssSelector("[data-analytics-searchresult='iPhone Screen Repair']");
	By headerText = By.xpath("//b[contains(text(),'iPhone Screen Repair')]");
	By productDropdown = By.cssSelector("[aria-labelledby='products-dropdown_label']");
	By modelDropdown = By.cssSelector("[aria-labelledby='models-details-dropdown_label']");
	By estimationBtn = By.cssSelector("[data-ss-analytics-link-text='Get estimate']");
	By estimationValue1 = By.cssSelector("[id='service-coverage-value']");
	By estimationValue2 = By.cssSelector("[id='apple-care-value']");

	public boolean menuHeadersAreDisplayed(String option) {
		return isDisplayed(getByCssSelector(menuHeaders, option));
	}

	public boolean supportHeadersAreDisplayed(String options) {
		return isDisplayed(getByCssSelector(appleSupportHeaders, options));
	}

	public boolean supportTabsAreDisplayed(String text) {
		return isDisplayed(getByCssSelector(appleSupportTabs, text));
	}

	public void enterTextInSearchBoxAndChooseOption(String text) {
		sendKeys(supportSearch, text);
		click(supportSearchOption);
	}

	public boolean headerTextIsDisplayed() {
		return isDisplayed(headerText);
	}

	public void selectOptionFromProductDropdown(String product, String model) {
		select(productDropdown, product);
		select(modelDropdown, model);
	}

	public void getEstimationText() {
		jsClick(estimationBtn);
		System.out.println("Your estimated cost : " + getText(estimationValue1));
		System.out.println("If you have AppleCare plan the cost is:" + getText(estimationValue2));
	}
	
}
