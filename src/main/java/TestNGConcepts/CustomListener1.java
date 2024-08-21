package TestNGConcepts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener1 implements ITestListener {
	

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case started :"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed :" +result.getName());                 //  ------Method name
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed :"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case Skipped :"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Start the test case:"+context.getName());
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
		System.out.println("End the test case:"+context.getName());
	}
	

	
	

}
