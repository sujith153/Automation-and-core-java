package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.core.UtilityClass;

public class Basepage {
	private UtilityClass util = null;
	private WebDriverWait wait = null;
	private WebDriver driver = null;

	public Basepage() {
		util = UtilityClass.getInstance();
		driver = util.getDriver();
		wait = util.getWait();
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void killDriver() {
		driver.quit();
	}

	public String getTestData(String key) {
		return util.getTestData(key);
	}

	public WebElement waitForElemnetVisibility(By by) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public WebElement waitForElemnetVisibility(By by, int timeout) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public WebElement waitForElemnetToBeClickable(By by) {
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public By getByCssSelector(String menuHeaders, String options) {
		return By.cssSelector(String.format(menuHeaders, options));
	}

	public By getByXpath(String menuHeaders, String options) {
		return By.xpath(String.format(menuHeaders, options));
	}

	public boolean isDisplayed(By by) {
		boolean flag = false;
		try {
			flag = waitForElemnetVisibility(by).isDisplayed();
		} catch (Exception e) {
		}
		return flag;
	}

	public boolean isDisplayed(By by, int timeout) {
		boolean flag = false;
		try {
			flag = waitForElemnetVisibility(by, timeout).isDisplayed();
		} catch (Exception e) {
		}
		return flag;
	}

	public void click(By by) {
		waitForElemnetToBeClickable(by).click();
	}

	public void sendKeys(By by, String text) {
		waitForElemnetToBeClickable(by).sendKeys(text);
	}

	public String getText(By by) {
		return waitForElemnetVisibility(by).getText();
	}

	public void select(By by, String text) {
		Select obj = new Select(waitForElemnetVisibility(by));
		obj.selectByVisibleText(text);
	}

	public void switchFrame(By by) {
		WebElement iframe = waitForElemnetVisibility(by);
		driver.switchTo().frame(iframe);
	}

	public void switchToDefalut() {
		driver.switchTo().defaultContent();
	}

	public void dragAndDrop(By from, By to) {
		Actions bu = new Actions(driver);
		bu.dragAndDrop(waitForElemnetVisibility(from), waitForElemnetVisibility(to)).build().perform();
	}

	public void jsClick(By by) {
		WebElement ele = driver.findElement(by);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}

	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
//		alert.dismiss();
	}

}
