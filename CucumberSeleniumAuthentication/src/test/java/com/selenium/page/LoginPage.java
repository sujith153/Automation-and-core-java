package com.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.core.GlobalVariables;
import com.selenium.core.UtilityClass;

public class LoginPage {
	private UtilityClass util;
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private By userName = By.cssSelector("[id='username']");
	private By password = By.cssSelector("[id='password']");
	private By submitBtn = By.cssSelector("[id='submit']");
	private By errMsg = By.cssSelector("[id='error']");
	private By loginMsg = By.xpath("//h1[contains(text(),'Logged In Successfully')]");
	private By logoutBtn = By.xpath("//a[text()='Log out']");

	public LoginPage() {
		util = UtilityClass.getInstance();
		driver = util.getDriver();
		wait = util.getWait();
	}

	public void launchUrl() {
		driver.get(GlobalVariables.url);
	}

	public void login(String user, String pass) {
		wait.until(ExpectedConditions.elementToBeClickable(userName));
		driver.findElement(userName).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(submitBtn).click();
	}

	public boolean isErrorMsgPresent() {
		wait.until(ExpectedConditions.elementToBeClickable(errMsg));
		return driver.findElement(errMsg).isDisplayed();
	}

	public boolean isLoginFormDisplayed() {
		wait.until(ExpectedConditions.elementToBeClickable(userName));
		return driver.findElement(userName).isDisplayed();
	}

	public String getLoginMaessage() {
		wait.until(ExpectedConditions.elementToBeClickable(loginMsg));
		return driver.findElement(loginMsg).getText();
	}

	public void clickOnLogoutButton() {
		wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
		driver.findElement(logoutBtn).click();
	}
			

}
