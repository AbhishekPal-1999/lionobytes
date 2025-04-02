package com.liono360.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;



public class ExtentListeners implements ITestListener, ISuiteListener{
	static Date d = new Date();
	static String timestamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(d);
	//static String fileName = "Extent_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";
	static String fileName="ExtnetReports"+timestamp+".html";
	private static ExtentReports extent = ExtentManager
			.createInstance(".\\Report\\" + fileName);

	public static ExtentTest test;
	
	
	
	
	
	

	public void onTestStart(ITestResult result) {

		test = extent
				//.createTest(result.getTestClass().getName() + "     @TestCase : " + result.getMethod().getMethodName());
				.createTest("@TestCase : " + result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		String logText = "<b>" + "TEST CASE:- " + methodName+ " PASSED" + "</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		test.pass(m);

	}

	public void onTestFailure(ITestResult result) {
		
//		if (result.getMethod().getRetryAnalyzerClass() == null) {
//            result.getMethod().setRetryAnalyzerClass(RetryAnalyzer.class);
//        }
	//	test.fail(result.getThrowable().getMessage());
		
		File screenshot=null;
		try {
			 screenshot=ExtentManager.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String methodName=result.getMethod().getMethodName();
		String logText="<b>"+"TEST CASE:- "+ methodName+ " FAILED"+"</b>";	
		
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
		test.log(Status.FAIL, m);
	
		String excepionMessage=result.getThrowable().getMessage();
		test.fail("<details>" + "<summary>" + "<b>" + "<font color=" + "DeepSkyBlue>" + "Exception Occured: Click to see"
				+ "</font>" + "</b >" + "</summary>" +excepionMessage.replaceAll(",", "<br>")+"</details>"+" \n");
		
		test.fail("<b><font color=red>" + "Screenshot of failure" + "</font></b><br>",MediaEntityBuilder.createScreenCaptureFromPath(screenshot.getAbsolutePath()).build());
		
	
		
		
		

	}

	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		String logText = "<b>" + "Test Case:- " + methodName + " Skipped" + "</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		test.skip(m);

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

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

}
