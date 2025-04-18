package com.liono360.utility;

import java.util.Arrays;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;



public class LionoExtentsListeners implements ITestListener {

	static Date d = new Date();
	static String fileName = "Extent_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";

	private static ExtentReports extent = ExtentReportsLionO360.CreateReports(System.getProperty("user.dir")+"\\Report\\"+fileName);
	
	public static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();
	

	public void onTestStart(ITestResult result) {

	
		ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        testReport.set(test);
        

	}

	public void onTestSuccess(ITestResult result) {

		
		String methodName=result.getMethod().getMethodName();
		String logText="<b>"+"TEST CASE:- "+ methodName.toUpperCase()+ " PASSED"+"</b>";		
		Markup m=MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		testReport.get().pass(m);
		

	}

	public void onTestFailure(ITestResult result) {

	
		
		
		String excepionMessage=Arrays.toString(result.getThrowable().getStackTrace());
		testReport.get().fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured: Click to see"
				+ "</font>" + "</b >" + "</summary>" +excepionMessage.replaceAll(",", "<br>")+"</details>"+" \n");
		
		
			ExtentReportsLionO360.captureScreenshot();
testReport.get().fail("<b>" + "<font color=" + "red>" + "Screenshot of failure" + "</font>" + "</b>",
			MediaEntityBuilder.createScreenCaptureFromPath(ExtentReportsLionO360.screenshotName)
					.build());
	
	String failureLogg="TEST CASE FAILED";
	Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
	testReport.get().log(Status.FAIL, m);
		/*
		 * try {
		 * 
		 * ExtentReportsLionO360.captureScreenshot(); testReport.get().fail("<b>" +
		 * "<font color=" + "red>" + "Screenshot of failure" + "</font>" + "</b>",
		 * MediaEntityBuilder.createScreenCaptureFromPath(ExtentReportsLionO360.
		 * screenshotName) .build()); } catch (IOException e) {
		 */
		
//		System.setProperty("org.uncommons.reportng.escape-output","false");
//		try {
//			ExtentReportsLionO360.captureScreenshot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String failureLogg="TEST CASE FAILED";
//		Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
//		testReport.get().log(Status.FAIL, m);
//		
//		testReport.log(LogStatus.FAIL, result.getName().toUpperCase()+" Failed with exception : "+result.getThrowable());
//		testReport.log(LogStatus.INFO, testReport.addScreenCapture(ExtentReportsLionO360.screenshotName));
//		
//		
//		
//		
//		Reporter.log("Click to see Screenshot");
//		Reporter.log("<a target=\"_blank\" href="+ExtentReportsLionO360.screenshotName+">Screenshot</a>");
//		Reporter.log("<br>");
//		Reporter.log("<br>");
//		Reporter.log("<a target=\"_blank\" href="+ExtentReportsLionO360.screenshotName+"><img src="+ExtentReportsLionO360.screenshotName+" height=200 width=200></img></a>");
//		

	}

	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		String logText="<b>"+"Test Case:- "+ methodName+ " Skipped"+"</b>";		
		Markup m=MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		testReport.get().skip(m);

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {

		

	}

	public void onFinish(ITestContext context) {

		if (extent != null) {

			extent.flush();
		}

	}

	
}
