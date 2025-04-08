package com.liono360.loginPage;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	static ReadConfig readconfig = new ReadConfig();

	public String browser = readconfig.getBrowser();
	public static String baseURL = readconfig.getApplicationURL();
	public static String username = readconfig.getUsername();
	public static String password = readconfig.getPassword();

	public static WebDriver driver;

	public static Logger logger;

	@BeforeSuite
	public void setup() throws AWTException, InterruptedException {
		logger = Logger.getLogger("liono360");
		PropertyConfigurator.configure("log4j.properties");

		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();

			options.addArguments("--remote-allow-origins=*");

//			options.addArguments("--incognito");

			options.addArguments("--disable-gpu");
			options.addArguments("--no-sandbox");
			// options.addArguments("--blink-settings=imagesEnabled=false");
			options.addArguments("--disable-extensions");

			options.addArguments("--disable-notifications");

			options.addArguments("use-fake-ui-for-media-stream"); // Auto-accept location permissions
			options.setExperimentalOption("prefs", Map.of("profile.default_content_setting_values.geolocation", 1 // 1 =
																													// Allow,
																													// 2
																													// =
																													// Block
			));

//			options.addArguments("headless");

			DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability(ChromeOptions.CAPABILITY, options);

			capabilities.setCapability("autoGrantPermissions", 1);

			driver = new ChromeDriver(options);

			driver.manage().window().maximize();

			// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		} else if (browser.equals("firefox")) {
			// System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
			// "\\Drivers\\geckodriver.exe");

			WebDriverManager.firefoxdriver().setup();
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("geo.enabled", false);
			profile.setPreference("geo.provider.use_corelocation", false);
			profile.setPreference("geo.prompt.testing", false);
			profile.setPreference("geo.prompt.testing.allow", false);
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("-private");
			options.setProfile(profile);
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();

//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		}

		redirectToCRM();

		try {

			waitUntilPageLoad();
			handleCookies();

		} catch (Exception e) {
			System.out.println("Cookies pop up is not handled ");
		}

		try {

			WebElement closeNotification = driver
					.findElement(By.xpath("(//*[name()='svg'][@class='p-icon p-toast-icon-close-icon'])[1]"));

			WebElement notification = driver.findElement(By.xpath("//div[text()='Notification']"));
			explWaitToClick(notification);

			if (notification.isDisplayed()) {

				closeNotification.click();

			}

		}

		catch (Exception e) {

			System.out.println("Notification is not handled");
		}

	}

	public static int drpCount() {
		List<WebElement> dropdownItems = driver.findElements(By.xpath("//ul[@role='listbox']//p-dropdownitem"));
		return new Random().ints(1, 1, dropdownItems.size()).findFirst().orElse(1);
	};

	public static void handleGeoLocation() {
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<>();
		Map<String, Object> contentSettings = new HashMap<>();
		contentSettings.put("geolocation", 1); // 1 = Allow
		prefs.put("profile.default_content_setting_values", contentSettings);

		options.setExperimentalOption("prefs", prefs);

	}

	public static WebDriver explWaitToClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return (driver);
	}

	@AfterSuite
	public void teardown() throws InterruptedException {
		Thread.sleep(1000);

//		redirectToLogout();
//		logger.info("logged out");
//		driver.quit();
//		logger.info("Browser Closed");
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

	public static String randomstring() {
		String generatedString11 = RandomStringUtils.randomAlphabetic(3);
		return (generatedString11);
	}

	public static String randomnumber() {
		String generatedNumber1 = RandomStringUtils.randomNumeric(3);
		return (generatedNumber1);
	}

	public static void mouseActionRightClick(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		explWaitToClick(element);
		actions.moveToElement(element).contextClick(element).build().perform();

	}

	public static void jsClick(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public static void jsDoubleClick(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].doubleClick();", element);
	}

	public static void jsScroll(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void redirectToCRM() throws InterruptedException {
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Username added");
		lp.setPassword(password);
		logger.info("password added");
		// Thread.sleep(2000);
		lp.clickSubmit();
		logger.info("Clicked on submit button");
		// Thread.sleep(19000);
		// CancelCookie();
	}

	public static void redirectToLogout() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		// Thread.sleep(6000);
		lp.btnProfile().click();
		logger.info("click on btnprofile");
		// Thread.sleep(5000);
		lp.btnlogout().click();
		logger.info("click on Logoutbtn");

	}

	public static void CancelCookie() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // 10 seconds timeout
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		By elementLocator = By.xpath("//span[normalize-space()='Accept All']");
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
		element.click();
		// driver.findElement(By.xpath("//span[@class=\"p-button-icon pi
		// pi-times\"]")).click();

	}

	public void scrollIntoView(WebElement element) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);
	}

	public static WebElement ClickDropdownValue(int valueNumber) {

		WebElement TargetValueOfDropdown = driver
				.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[" + valueNumber + "]//li"));

		return TargetValueOfDropdown;
	}

	public static WebElement ClickMultipleDropdownValue(int valueNumber) {

		WebElement TargetValueOfDropdown = driver
				.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[" + valueNumber + "]//li"));

		return TargetValueOfDropdown;
	}

	public static WebElement Select(String NameOfDropdownVale) {

		WebElement TargetValueOfDropdown = driver.findElement(By.xpath("//span[text()='" + NameOfDropdownVale + "']"));

		return TargetValueOfDropdown;
	}

	public static void waitUntilPageLoad() throws InterruptedException {
		int maxWaitingTime = 40;
		Thread.sleep(600);
		float time = 1;

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		while (time < maxWaitingTime) {
			WebElement LoaderIcon = null;
			try {

				LoaderIcon = driver.findElement(By.xpath("//div[@class=\"splash-loader\"]"));

			} catch (Exception e) {
				// System.out.println("Now Page loaded fully !....");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				break;
			}

			if (LoaderIcon != null) {

				Thread.sleep(500);
				time = (float) (time + .5);
				// System.out.println("page loader icon is occuring till: "+time +"Seconds");
			} else {
				break;
			}

		}

	}

	public static void TryClick(WebElement element) throws InterruptedException {

		String elementName = element.getText();
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 30 * 1000;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		while (System.currentTimeMillis() < endTime) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(element));

				element.click();
				// System.out.println(elementName+" is clicked ");

				return;
			} catch (Exception e) {
				// System.out.println("Error occurred while clicking the button: " +
				// e.getMessage());
				Thread.sleep(300);
			}
		}
		System.out.println("Unable to click the button within the specified duration");
	}

	public static void SelectDropdown(WebElement element, int DropdownValue) throws InterruptedException {
		String elementName = element.getText();
		String SelectedDropDown = null;
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 15 * 1000;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		while (System.currentTimeMillis() < endTime) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(element));
				element.click();
				// SelectedDropDown=ClickDropdownValue(DropdownValue).getText();
				ClickDropdownValue(DropdownValue).click();
				// System.out.println("Dropdown "+elementName+" is clicked and selcted value is:
				// "+SelectedDropDown);
				return;
			} catch (Exception e) {

				// System.out.println("Error occurred while clicking the button: " +
				// e.getMessage());
				Thread.sleep(300);
			}
		}
		System.out.println("Unable to click the button within the specified duration");
	}

	public static void TrySelectDropdown(WebElement element, String text) throws InterruptedException {
		String elementName = element.getText();
		String SelectedDropDown = null;
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 15 * 1000;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		while (System.currentTimeMillis() < endTime) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(element));
				element.click();
				// SelectedDropDown=ClickDropdownValue(DropdownValue).getText();
				wait.until(ExpectedConditions.elementToBeClickable(
						driver.findElement(By.xpath("//p-dropdownitem//li//span[normalize-space()='" + text + "']"))));
				driver.findElement(By.xpath("//p-dropdownitem//li//span[normalize-space()='" + text + "']")).click();
				// System.out.println("Dropdown "+elementName+" is clicked and selcted value is:
				// "+SelectedDropDown);
				return;
			} catch (Exception e) {

				// System.out.println("Error occurred while clicking the button: " +
				// e.getMessage());
				Thread.sleep(300);
			}
		}
		System.out.println("Unable to click the button within the specified duration");
	}

	public static void TryMultiDropdowntxt(WebElement element, String text) throws InterruptedException {
		String elementName = element.getText();
		String SelectedDropDown = null;
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 15 * 1000;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		while (System.currentTimeMillis() < endTime) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(element));
				element.click();
				// SelectedDropDown=ClickDropdownValue(DropdownValue).getText();
				wait.until(ExpectedConditions.elementToBeClickable(driver
						.findElement(By.xpath("//p-multiselectitem//li//span[normalize-space()='" + text + "']"))));
				driver.findElement(By.xpath("//p-multiselectitem//li//span[normalize-space()='" + text + "']")).click();
				element.click();
				// System.out.println("Dropdown "+elementName+" is clicked and selcted value is:
				// "+SelectedDropDown);
				return;
			} catch (Exception e) {

				// System.out.println("Error occurred while clicking the button: " +
				// e.getMessage());
				Thread.sleep(300);
			}
		}
		System.out.println("Unable to click the button within the specified duration");
	}

	public static void TrySelectMultiDropdown(WebElement element, int DropdownValue1, int DropdownValue2)
			throws InterruptedException {
		String elementName = element.getText();
		String SelectedDropDown = null;
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 15 * 1000;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		while (System.currentTimeMillis() < endTime) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(element));
				element.click();
				// SelectedDropDown=ClickMultipleDropdownValue(DropdownValue1).getText();
				ClickMultipleDropdownValue(DropdownValue1).click();
				ClickMultipleDropdownValue(DropdownValue2).click();
				element.click();
				// System.out.println("Dropdown "+elementName+" is clicked and selcted value is:
				// "+SelectedDropDown);
				return;
			} catch (Exception e) {

				// System.out.println("Error occurred while clicking the button: " +
				// e.getMessage());
				Thread.sleep(300);
			}
		}
		System.out.println("Unable to click the button within the specified duration");

//	    final Timer timer = new Timer();
//	    timer.schedule(new TimerTask() {
//	        @Override
//	        public void run() {
//	            timer.cancel();
//	            throw new RuntimeException("Unable to click the button within the specified duration");
//	        }
//	    }, 30 * 1000);
	}

	public static void TryLionoTreeSelect(WebElement element, WebElement Search, String text)
			throws InterruptedException {
		String elementName = element.getText();
		String SelectedDropDown = null;
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 10 * 1000;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		while (System.currentTimeMillis() < endTime) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(element));
				element.click();

				// SelectedDropDown=ClickMultipleDropdownValue(DropdownValue1).getText();
				Search.sendKeys(text);
				Thread.sleep(1000);
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
						By.xpath("//p-treenode//li//span[@class=\"p-treenode-label\"]//span[normalize-space(.)='" + text
								+ "']"))));
				driver.findElement(By.xpath(
						"//p-treenode//li//span[@class=\"p-treenode-label\"]//span[normalize-space(.)='" + text + "']"))
						.click();

				// System.out.println("Dropdown "+elementName+" is clicked and selcted value is:
				// "+SelectedDropDown);
				return;
			} catch (Exception e) {

				// System.out.println("Error occurred while clicking the button: " +
				// e.getMessage());
				Thread.sleep(300);
			}
		}
		System.out.println("Unable to click the button within the specified duration");

	}

	public static void handleCookies() {

		WebElement cookies = driver.findElement(By.xpath("//span[text()='Accept All']"));

		if (cookies.isDisplayed()) {

			cookies.click();

		}
	}

	public static void handleNotification() {

		WebElement closeNotification = driver.findElement(By.xpath("//button[@data-pc-section,'data-pc-section']"));
		explWaitToClick(closeNotification);
		if (closeNotification.isDisplayed()) {

			closeNotification.click();

		}
	}

	public static void refreshWindow() throws InterruptedException {

		driver.navigate().refresh();

		try {
			Thread.sleep(2000);
			handleNotification();
			waitUntilPageLoad();

		} catch (Exception e) {

			Thread.sleep(1000);

		}
	}

}
