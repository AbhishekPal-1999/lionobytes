package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class RMAPage extends Baseclass{
	WebDriver ldriver;

	public RMAPage(WebDriver rdriver) {
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
		    
		}
		
	}

	@FindBy(xpath="//span[contains(text(),'Inventory')]")
	WebElement btnInventory;

	public WebElement clickInventory() {

		return btnInventory;
	}
	
	@FindBy(xpath = "//*[text()='Purchases']")
	WebElement btnProduct;

	public WebElement clickPurchases() {
		return btnProduct;
	}
	@FindBy(xpath="//*[text()='Sales']")
    WebElement btnSales;
  
  public WebElement clickSales() {
	  return btnSales;
  }
  
  @FindBy(xpath="//span[text()='Customer Returns']")
  WebElement btnCustomerReturn;
  
  public WebElement clickCustomerReturn() {
	  return btnCustomerReturn;
  }
  @FindBy(xpath = "//*[text()='New']")
	WebElement btnNewSales;


	public WebElement clickAddNewSales() {
		
		return btnNewSales;
	}
	@FindBy(xpath = "//input[@placeholder='Search Account...']")
	WebElement txtSearchAccount;

	public WebElement setSearchAccount() {
		return txtSearchAccount;
	}
	
	@FindBy(xpath="//span[text()='Select a Location']")
	WebElement txtSelectLocation;
	
	public WebElement clickSelectLocation() {
		return txtSelectLocation;
	}
	@FindBy(xpath="//table[@role='table']//thead//tr//th//span//i")
	WebElement btnAddProductList;

	public WebElement clickAddProductList() {
		return btnAddProductList;
	}
	
	@FindBy(xpath="//p-dropdown//span[text()='Select an Invoice']")
	WebElement btnselectAnInvoice;

	public WebElement SelectAnInvoice() {
		return btnselectAnInvoice;
	}
	
	@FindBy(xpath="(//span[text()='Save'])[2]")
	WebElement txtSave;

	public WebElement clickSaveBtn1() {
		return txtSave;
	}
	@FindBy(xpath="//p-dropdown//span[text()='Select a Reason']")
	WebElement selectreason;

	public WebElement clickselectreason() {
		return selectreason;
	}
	@FindBy(xpath="(//span[text()='Save'])")
	WebElement txtSave1;

	public WebElement clickSaveBtn() {
		return txtSave1;
	}
	@FindBy(xpath="//tbody/tr[1]/td[1]")
	WebElement RMAList;

	public WebElement clickRMAList() {
		return RMAList;
	}
	@FindBy(xpath="//span[normalize-space()='Authorized']")
	WebElement clickAuthorized;

	public WebElement clickAuthorized() {
		return clickAuthorized;
	}
	@FindBy(xpath="//span[normalize-space()='Received']")
	WebElement clickReceived;

	public WebElement clickReceived() {
		return clickReceived;
	}
	@FindBy(xpath="//span[normalize-space()='Approve/Decline']")
	WebElement clickApproveDecline;

	public WebElement clickApproveDecline() {
		return clickApproveDecline;
	}
	@FindBy(xpath="//span[normalize-space()='Approve']")
	WebElement clickApprove;

	public WebElement clickApprove() {
		return clickApprove;
	}
	
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	WebElement txtYes;

	public WebElement clickYes() {
		return txtYes;
	}
	@FindBy(xpath="//span[contains(text(),'Delete')]")
	WebElement txtDelete;


	public WebElement clickDelete() {
		return txtDelete;

	}
	
	@FindBy(xpath="//span[contains(text(),'Void')]")
	WebElement txtVoid;

	public WebElement clickVoidOption() {
		return txtVoid;
	}
}
