package com.liono360.utility;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.liono360.loginPage.Baseclass;

public class ExtentReportsLionO360 extends Baseclass {
	
	
	private static ExtentReports extent;
	
	
	
	

    public static ExtentReports CreateReports(String fileName) {
    	ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);
       
        
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle(fileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(fileName);
        
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Automation Tester", "Satyendra Kumar");
        extent.setSystemInfo("Organization", "LionoBytes");
        
        
        
        return extent;
    }
    public static String screenshotPath;
	public static String screenshotName;
	
	public static void captureScreenshot() {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\Reports\\" + screenshotName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

	
	

//	public static void captureScreenshot() throws IOException {
//
//		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//		Date d = new Date();
//		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
//
//		FileUtils.copyFile(scrFile,
//				new File(System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName));
//
//	}
}
