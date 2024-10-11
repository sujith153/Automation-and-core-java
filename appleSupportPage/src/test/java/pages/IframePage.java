package pages;

import org.openqa.selenium.By;

public class IframePage extends Basepage {
	private By nextBtn = By.xpath("//div[@id='main']//a[contains(text(), 'Next')]");
	private By iFrame = By.cssSelector("iframe[title='W3Schools HTML Tutorial']");
	private String tutorialBtn = "//a[contains(text(),'%s')]";
	private By iFrameHeader = By.cssSelector("div[id='main'] h1");
	
	
	public void clickNextBtn() {
		click(nextBtn);
	}
	
	public void switchFrame() {
		switchFrame(iFrame);
	}
	
	public void tutorialPage(String text) {
		click(getByXpath(tutorialBtn, text));
	}
	
	public String getHeaderText() {
		return getText(iFrameHeader);
	}
	public String getMainHeaderText() {
		return getText(iFrameHeader);
	}
}
