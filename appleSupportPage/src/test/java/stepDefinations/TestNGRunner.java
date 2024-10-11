package stepDefinations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features = {"src\\test\\resources\\features"}, glue = "stepDefinations", plugin = {
		"pretty", "junit:target/JUnitReports/report.xml", "json:target/JSONReports/report.json",
		"html:target/HtmlReports/report.html", "json:target/cucumber.json" }, monochrome = true,
		tags = "@smoke1")
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void before() {
		System.out.println("Hii all");
	}

}
