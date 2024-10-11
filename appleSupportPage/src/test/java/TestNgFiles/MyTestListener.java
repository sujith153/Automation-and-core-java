package TestNgFiles;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.selenium.core.UtilityClass;

public class MyTestListener implements ITestListener{
	UtilityClass util = UtilityClass.getInstance();
 
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		util.takeScreenshot(result.getName());
		ITestListener.super.onTestFailure(result);
	}
}
