package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLogin {
	WebDriver driver ;
	WebDriverWait wait;
	
	public TestLogin(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	By userName = By.cssSelector("username");
	By password = By.cssSelector("password");
	By loginBtn = By.cssSelector("loginBtn");
	
	
//	WebElement userName = driver.findElement(By.cssSelector("userName"));
//	WebElement password = driver.findElement(By.cssSelector("password"));
//	WebElement loginBtn = driver.findElement(By.cssSelector("login"));
	
	public void login(String user, String pass) {
//		this.userName.sendKeys(user);
//		this.password.sendKeys(pass);
//		this.loginBtn.click();
		this.waitForVisible(userName).sendKeys("userName");
		this.waitForVisible(password).sendKeys("password");
		this.waitForVisible(loginBtn).click();
	}
	
	public WebElement waitForVisible(By by) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
