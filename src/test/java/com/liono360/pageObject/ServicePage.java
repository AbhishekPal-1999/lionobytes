package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class ServicePage extends Baseclass{
	
	WebDriver ldriver;

	public ServicePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	public void waitUntilPageLoad() throws InterruptedException {
		int maxWaitingTime = 40;
		Thread.sleep(600); 
		float time=1;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	    while (time<maxWaitingTime) {
			WebElement LoaderIcon = null;
			try {
				LoaderIcon = driver.findElement(By.xpath("//div[@class=\"splash-loader\"]"));

			} catch (Exception e) {
				System.out.println("Now Page loaded fully !....");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				break; 
			}

			if (LoaderIcon!=null) {

				Thread.sleep(500); 
				time=(float) (time+.5);
				System.out.println("page loader icon is occuring till: "+time +"Seconds");
			} 
			else {
				break;
			}
		    
		}}
	
	@FindBy(xpath = "//*[text()='Inventory']")
	WebElement btnInventory;

	public WebElement clickInventory() {
		return btnInventory;
	}
	
	@FindBy(xpath = "//*[text()='Products']")
	WebElement btnProduct;

	public WebElement clickProduct() {
		return btnProduct;
	}
	
	@FindBy(xpath = "//*[text()='New']")
	WebElement btnNewProduct;

	public WebElement clickAddNewProduct() {
		return btnNewProduct;
	}
	
	@FindBy(xpath = "//input[@id='itemNo']")
	WebElement txtItemNo;

	public WebElement setItemNo() {
		return txtItemNo;
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement txtSearch;

	public WebElement setSearch() {
		return txtSearch;
	}
	
	@FindBy(xpath = "//*[text()='Select Variant']")
	WebElement drpVariant;

	public WebElement selectVariant() {
		return drpVariant;
	}
	@FindBy(xpath="(//div[@role='treeitem'])[1]")
	WebElement drpchoicecategory;
	
	public WebElement clickdrpchoicecategory() {
		return drpchoicecategory;
	}
	@FindBy(xpath="//input[@id='barcode']")
	WebElement txtbarcode;
	
	public WebElement clickBarcode() {
		return txtbarcode;
	}
	@FindBy(xpath="(//div[@aria-label='dropdown trigger'])[4]")
	WebElement drpUOM;
	
	public WebElement clickUOM() {
		return drpUOM;
	}
	@FindBy(xpath = "//liono-treeselect[@placeholder='Select Category']//div//div//span")
	WebElement drpCategory;

	public WebElement selectCategory() {
		return drpCategory;
	}
	
	@FindBy(xpath= "//input[@id='description']")
	WebElement txtDescription;

	public WebElement setDescription() {
		return txtDescription;
	}
	
	@FindBy(xpath="//td[@class='ng-star-inserted'][1]")
	WebElement listedServiceName;
	
	public WebElement listedProductIs() {
		return listedServiceName;
	}
	
	@FindBy (xpath="//button[@label='Save']")
	WebElement btnSave;
	
	public WebElement clickSave() {
		return btnSave;
	}
	
	@FindBy (xpath= "//input[@id='rate']")
	WebElement txtRate;
	
	public WebElement setRate() {
		return txtRate;
	}
	
	@FindBy(xpath="//p-dropdown[@id='productChannels']")
	WebElement drpInventoryItem;
	
	public WebElement selectProduct() {
		return drpInventoryItem;
	}
	
	@FindBy(xpath="//span[text()='Service']")
	WebElement drpService;
	
	public WebElement clickService() {
		return drpService;
	}
	
	@FindBy(xpath="//input[@inputmode='decimal']")
	WebElement inputprize;
	
	public WebElement clickinputprize() {
		return inputprize;
	}
	@FindBy(xpath="//liono-treeselect[@placeholder='Select Class']//div//div//span")
	WebElement btnclass;
	
	public WebElement clickSelectClass() {
		return btnclass;
	}
	@FindBy(xpath="//div[@class='btnBars']//i[@class='pi pi-bars']")
	WebElement btnHamburgericon;
	
	public WebElement clickHamburgericon() {
		return btnHamburgericon;
	}
	
	@FindBy(xpath="//span[text()='View']")
	WebElement btnView;

	public WebElement clickViewOption() {
		return btnView;
	}
	
	@FindBy(xpath="//span[text()='Edit']")
	WebElement btnEdit;
	
	public WebElement clickEditOption() {
		return btnEdit;
	}
	
	@FindBy(xpath="//span[text()='Delete']")
	WebElement btnDelete;
	
	public WebElement clickDeleteOption() {
		return btnDelete;
	}
	
	@FindBy(xpath="//span[text()='Yes']")
	WebElement btnYes;
	
	public WebElement clickYesToDelete() {
		return btnYes;
	}
	
	@FindBy(xpath="//h5[contains(text(),'Service View Page')]")
	WebElement headerViewProduct;
	
	public WebElement productViewHeader() {
		return headerViewProduct;
	}
	
}
