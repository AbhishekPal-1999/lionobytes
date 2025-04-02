package com.liono360.loginPage;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ZapSecurity {

	static final String ZAP_PROXY_ADDRESS = "localhost";
	static final int ZAP_PROXY_PORT=8080;
	static final String ZAP_API_KEY= "tedkkrtg7psu0c5st8e82610gf";
	
	private WebDriver driver;
	private ClientApi api;
	
	@BeforeMethod
	public void setup() {
		String ProxyServerURL= ZAP_PROXY_ADDRESS+":"+ZAP_PROXY_PORT;
		
		  Proxy proxy = new Proxy();
		proxy.setHttpProxy(ProxyServerURL);
		proxy.setSslProxy(ProxyServerURL);
		
		ChromeOptions co = new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		co.setProxy(proxy);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		api = new ClientApi(ZAP_PROXY_ADDRESS,ZAP_PROXY_PORT,ZAP_API_KEY);
	}
	@Test
	public void CRMSecurityTest() {
		driver.get("https://devui01.lionodev.com/");
		Assert.assertTrue(driver.getTitle().contains("LionO360"));
	}
	@AfterMethod
	public void teardown(){
		if(api!=null) {
			String title = "CRM SECURITY TEST REPORT";
			String template = "traditional-html";
			String description = "CRM SECURITY TEST REPORT BY ZAP";
			String reportfilename = "crm-zap-security-report.html";
			String reportdir = System.getProperty("user.dir");
			try {
				api.reports.generate(title,template, null, description, null, null,null,null,null, reportfilename, null, reportdir,  null );
			} catch (ClientApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
