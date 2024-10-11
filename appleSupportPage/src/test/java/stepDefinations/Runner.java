package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\features"}, glue = "stepDefinations", plugin = {
		"pretty", "junit:target/JUnitReports/report.xml", "json:target/JSONReports/report.json",
		"html:target/HtmlReports/report.html", "json:target/cucumber.json" }, monochrome = true,
		tags = "@smoke1")
public class Runner {
	

}
