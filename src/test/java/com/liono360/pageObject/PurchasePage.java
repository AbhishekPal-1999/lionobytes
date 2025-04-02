package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class PurchasePage extends Baseclass{
	WebDriver ldriver;

	public PurchasePage(WebDriver rdriver) {
		ldriver = rdriver;
		//DynamicWait(ldriver);
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
	
	@FindBy(xpath = "//*[text()='Purchases']")
	WebElement btnProduct;

	public WebElement clickPurchases() {
		return btnProduct;
	}
	
	@FindBy(xpath = "//*[text()='New']")
	WebElement btnNewSales;


	public WebElement clickAddNewPurchase() {
		
		return btnNewSales;
	}
	@FindBy(xpath = "//*[text()='Purchase Order']")
	WebElement btnpurchasesOrder;


	public WebElement clickPurchaseOrder() {
		
		return btnpurchasesOrder;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Vendor']//div//div[@aria-label='dropdown trigger']")
	WebElement btnSelectVendor;
	
	public WebElement clickSelectVendor() {
		return btnSelectVendor;
	}
	  @FindBy(xpath="//input[@placeholder='Search by Item No., Barcode...']")
			WebElement btnBarcode;

			public WebElement clickBarcodeItemNo() {
				return btnBarcode;
			}
			  @FindBy(xpath="//button[@label='Save']")
			  WebElement btnSave;
			  
			  
			  public WebElement clickSubmit() {
				  return btnSave;
			  }
			  @FindBy(xpath="//tbody/tr[1]/td[1]")
			  WebElement btnInvoiceList;
			  public WebElement clickpurchaseList() {
				  return btnInvoiceList;
			  }
			  
			  @FindBy(xpath="//span[text()='Issued']")
			  WebElement btnissued;
			  
			  public WebElement clickIssued() {
				  return btnissued;
			  }
			  
			  @FindBy(xpath="//span[text()='Receive Inventory']")
			  WebElement btnReceiveInventory;
			  
			  public WebElement clickReceiveInventory() {
				  return btnReceiveInventory;
			  }
			  
			  @FindBy(xpath="//p-dropdown[@placeholder='Select channel']//span[contains(text(),'Purchase Order')]")
			  WebElement btnPurchaseOrder;
			  
			  public WebElement clickdrpPurchaseOrder() {
				  return btnPurchaseOrder;
				  
			  }
			  @FindBy(xpath="//span[text()='Edit']")
				WebElement btnEdit;
				
				public WebElement clickEditOption() {
					return btnEdit;
				}
			  
				@FindBy(xpath="//span[text()='Void']")
				WebElement btnVoid;
				
				public WebElement clickVoidOption() {
					return btnVoid;
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
				
				@FindBy(xpath="//td[@class='ng-star-inserted'][1]")
				WebElement listedProductName;
				
				public WebElement listedProductIs() {
					return listedProductName;
				}
			  @FindBy (xpath="//a[@role='tab']//span//i")
				WebElement btnplusaddkitproduct;
				
				public WebElement clickPlusaddproductkit() {
					return btnplusaddkitproduct;
				}
				
				@FindBy(xpath="//button[@label='Add']//span")
				WebElement btnAdd;
				
				public WebElement clickAddOption() {
					return btnAdd;
				}
			  
			  @FindBy(xpath="//span[normalize-space()='Bill']")
			  WebElement btnbill;
			  
			  public WebElement clickBill() {
				  return btnbill;
			  }
			  
			  @FindBy(xpath="//span[text()='Pay Bill']")
			  WebElement btnPaybill;
			  
			  public WebElement clickPayBill() {
				  return btnPaybill;
			  }
}
