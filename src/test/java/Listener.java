import org.slf4j.Logger;
import org.slf4j.spi.LocationAwareLogger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{

    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("Test "+result.getName()+ " is passed!" );
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("Test "+result.getName()+ " is failed!");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("Test "+result.getName()+ " is skipped!");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("Failure of test cases and its details are : "+result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Number of Passed tests for suite '"+ context.getSuite().getName() +"' is: " + context.getPassedTests().size());
        System.out.println("Number of Failed tests for suite '"+ context.getSuite().getName() +"' is: " + context.getFailedTests().size());
        System.out.println("Number of Skipped tests for suite '"+ context.getSuite().getName() +"' is: " + context.getSkippedTests().size());
    }
}