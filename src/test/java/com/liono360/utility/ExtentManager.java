package com.liono360.utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.liono360.loginPage.Baseclass;



public class ExtentManager extends Baseclass{

	private static ExtentReports extent;
	public static String fileName;
	
	public static ExtentReports createInstance(String fileName) {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);
       
        
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle(fileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(fileName);
        
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Automation Tester", "Akash Mogdul");
        extent.setSystemInfo("Organization", "LionOBytes");
        extent.setSystemInfo("Environment", "Production");
        
        return extent;
    }

    
	public static File captureScreenshot() throws IOException {
		
		Date d = new Date();
	    String imgName = d.toString().replace(":", ".").replace(" ", ".")+".png";

	    // Capture screenshot
      
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Copy screenshot to desired location
        File destination = new File(".//Screenshots//"+imgName);
        FileUtils.copyFile(screenshot, destination);
        
		return destination;
	}
	
	

	public static void captureElementScreenshot(WebElement element) throws IOException {
		
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";

		
		
		File screeshot = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screeshot, new File(".//Screenshots//"+"Element_"+fileName));
	}

}
