package com.liono360.utility;
import org.testng.ITestNGListener;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer, ITestNGListener {
    
    private int retryCount = 0;
    private static final int MAX_RETRY_COUNT = 1; 

    public boolean retry(ITestResult result) {
        if (retryCount < MAX_RETRY_COUNT) {
            retryCount++;
            return true; 
        }
        return false; 
    }

	
}
