package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class EstimatePage extends Baseclass {
	WebDriver ldriver;
	public EstimatePage(WebDriver rdriver) {
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
				//System.out.println("Now Page loaded fully !....");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				break; 
			}

			if (LoaderIcon!=null) {

				Thread.sleep(500); 
				time=(float) (time+.5);
				//System.out.println("page loader icon is occuring till: "+time +"Seconds");
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
	@FindBy(xpath="//*[text()='Sales']")
	WebElement btnSales;

	public WebElement clickSales() {
		return btnSales;
	}
	@FindBy(xpath="//p-dropdown[@optionlabel='name']")
	WebElement drpdownsales;

	public WebElement clickdrpdownsales() {
		return drpdownsales;
	}
	@FindBy(xpath="//span[text()='Estimates']")
	WebElement txtEstimate;

	public WebElement clickEstimate() {
		return txtEstimate;
	}
	@FindBy(xpath = "//*[text()='New']")
	WebElement btnNewSales;


	public WebElement clickAddNewEstimate() {

		return btnNewSales;
	}
	@FindBy(xpath = "//input[@placeholder='Search Account...']")
	WebElement txtSearchAccount;

	public WebElement setSearchAccount() {
		return txtSearchAccount;
	}
	@FindBy(xpath="//input[@placeholder='Search by Item No., Barcode...']")
	WebElement btnBarcode;

	public WebElement clickBarcodeItemNo() {
		return btnBarcode;
	}
	@FindBy(xpath="(//tr)[24]")
	WebElement txtselectAdd;

	public WebElement clickselectAdd() {
		return txtselectAdd;
	}

	@FindBy(xpath="//span[contains(text(),'Select Shipping Term')]")
	WebElement btnShippingTerm;

	public WebElement clickShippingTerm() {
		return btnShippingTerm;
	}

	@FindBy(xpath="//li[@aria-label='Prepaid']//span[1]")
	WebElement btnPrepaid;

	public WebElement clickPrepaid() {
		return btnPrepaid;
	}

	@FindBy(xpath="//span[contains(text(),'Select Sales Rep')]")
	WebElement btnSalesRep;

	public WebElement clickSalesRep() {
		return btnSalesRep;
	}
	@FindBy(xpath="//p-dropdownitem//li[@role='option']")
	WebElement btnPan;

	public WebElement clicksalesrepuser() {
		return btnPan;
	}

	 @FindBy(xpath="//li[@role='option']")
	   WebElement btnPrepaid1;
	   
	   public WebElement clickshippingTermdropdown() {
		   return btnPrepaid1;
	   }
	   
	@FindBy(xpath="//table[@role='table']//thead//tr//th//span//i")
	WebElement btnAddProductList;

	public WebElement clickAddProductList() {
		return btnAddProductList;
	}

	@FindBy(xpath="//input[@placeholder='Global Search']")
	WebElement txtGlobalSearch;

	public WebElement clickGlobalSearch() {

		return txtGlobalSearch;
	}
	@FindBy(xpath="(//tbody)[3]//tr[1]")
	WebElement btnClickProduct;

	public WebElement clickProductitem() {
		return btnClickProduct;
	}
	@FindBy(xpath="//span[normalize-space()='Add']")
	WebElement btnAdd;

	public WebElement clickAddBtn() {
		return btnAdd;
	}

	@FindBy(xpath="//button[@label='Save']")
	WebElement btnSave;


	public WebElement clickSubmit() {
		return btnSave;
	}
	@FindBy(xpath="//tbody/tr[1]/td[1]")
	WebElement btnEstimateList;

	public WebElement clickEstimateList() {
		return btnEstimateList;
	}
	 @FindBy(xpath="//span[contains(text(),'View')]")
	  WebElement txtViewOption;
	  
	  public WebElement clickViewEditOption() {
		  return txtViewOption;
	  }
	@FindBy(xpath="//span[contains(text(),'Edit')]")
	WebElement clickEditBtn;

	public WebElement clickEditEstimate() {
		return clickEditBtn;
	}

	@FindBy(xpath="//span[text()='Void']")
	WebElement btnVoid;
	
	public WebElement clickVoidOption() {
		return btnVoid;
	}
	@FindBy(xpath="//span[text()='Yes']")
	WebElement btnYes;
	
	public WebElement clickYesToDelete() {
		return btnYes;
	}
	@FindBy(xpath="//li[@role='option'][1]")
	WebElement txtEditNewAcc;

	public WebElement clickEditNewAcc() {
		return txtEditNewAcc;
	}
	@FindBy(xpath="(//tbody//tr[1])[2]")
	WebElement txtProductList;

	public WebElement clickProductList() {
		return txtProductList;
	}

	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement txtSave;

	public WebElement clickSaveBtn1() {
		return txtSave;
	}

	@FindBy(xpath="//span[contains(text(),'Convert to Sales Order')]")
	WebElement txtConvertSalesorder;

	public WebElement clickConvertSalesOrder() {
		return txtConvertSalesorder;
	}

	@FindBy(xpath="//span[contains(text(),'Convert to Invoice')]")
	WebElement txtConvertInvoice;

	public WebElement clickConvertInvoice() {
		return txtConvertInvoice;
	}

	@FindBy(xpath="//tbody//tr//td//span//i")
	WebElement txtWarehouse;

	public WebElement clickWarehouse() {
		return txtWarehouse;

	}
	@FindBy(xpath="(//tr)[25]")
	WebElement setWarehouse;

	public WebElement clickWarehouseList() {
		return setWarehouse;
	}

	@FindBy(xpath="(//div)[117]")
	WebElement setshippedCheckedbox;

	public  WebElement clickshippedCheckedbox() {
		return setshippedCheckedbox;
	}

	@FindBy(xpath="(//div)[134]")
	WebElement setMediumCheckedBox;

	public WebElement clickMediumCheckedBox() {
		return setMediumCheckedBox;
	}
	@FindBy(xpath="(//span[contains(text(),'Void')])[1]")
	WebElement txtVoidEstimate;

	public WebElement clickVoid() {
		return txtVoidEstimate;
	}
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	WebElement txtYes;

	public WebElement clickYes() {
		return txtYes;
	}
	@FindBy(xpath="(//span[contains(text(),'Delete')])[1]")
	WebElement txtDelete;

	public WebElement clickDelete() {
		return txtDelete;
	}
	@FindBy(xpath="(//span[contains(text(),'Active')])[1]")
	WebElement txtActive;

	public WebElement clickInActive() {
		return txtActive;
	}
	@FindBy(xpath="(//span[contains(text(),'InActive')])[1]")
	WebElement txtInActive;

	public WebElement clickActive() {
		return txtActive;
	}
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement txtSearch;

	public WebElement setSearch() {
		return txtSearch;
	}
	@FindBy(xpath="//input[@formcontrolname='shippingChargeAmount']")
	WebElement txtShippingCharge;

	public WebElement setShippingCharge() {
		return txtShippingCharge;
	}

	@FindBy(xpath="//p-dropdown[@optionlabel='code']//div[@aria-label='dropdown trigger']//span")
	WebElement txtTaxTrigger;

	public WebElement setTax() {
		return txtTaxTrigger;
	}
	@FindBy(xpath="//input[@formcontrolname='discountValue']")
	WebElement txtDiscountValue;

	public WebElement setDiscountValue() {
		return txtDiscountValue;


	}
	@FindBy(xpath="//div[@class='card']/p")
	WebElement verifyAccName;

	public WebElement VerifyAccName() {
		return verifyAccName;
	}
	@FindBy(xpath="//div[@class='card']/p")
	WebElement verifyOverViewaccName;

	public WebElement VerifyOverViewaccName() {
		return verifyOverViewaccName;
	}

	@FindBy(xpath="(//div[@class='card']/p/span)[4]")
	WebElement verifyDate;

	public WebElement VerifyDate() {
		return verifyDate;
	}
	@FindBy(xpath="(//div[@class='card']/p/span)[4]")
	WebElement verifyOverviewDate;

	public WebElement VerifyOverviewDate() {
		return verifyOverviewDate;
	}
	@FindBy(xpath="(//div[@class='card']/p/span)[7]")
	WebElement verifyoverviewstatus;

	public WebElement VerifyOverviewStatus() {
		return verifyoverviewstatus;
	}
	@FindBy(xpath="(//div[@class='card']/p/span)[7]")
	WebElement verifyStatus;

	public WebElement Verifystatus() {
		return verifyStatus;

	}

	@FindBy(xpath="(//div[@class='card']/p/span)[8]")
	WebElement verifyOverviewCreatedBy;
	public WebElement VerifyOverviewCreatedby() {
		return verifyOverviewCreatedBy;
	}
	@FindBy(xpath="(//div[@class='card']/p/span)[8]")
	WebElement verifyCreatedBy;
	public WebElement VerifyCreatedby() {
		return verifyOverviewCreatedBy;
	}
	@FindBy(xpath="(//div[@class='card']//p)[15]")
	WebElement verifyOverviewShippingTerm;

	public WebElement VerifyOverviewShippingTerm() {
		return verifyOverviewShippingTerm;
	}

	@FindBy(xpath="(//div[@class='card']//p)[15]")
	WebElement verifyShippingterm;

	public WebElement VerifyShippingTerm() {
		return verifyShippingterm;
	}

	@FindBy(xpath="(//div[@class='card']//p)[16]")
	WebElement verifyOverviewShippingMethod;

	public WebElement VerifyOverviewShippingMethod() {
		return verifyOverviewShippingMethod;
	}

	@FindBy(xpath="(//div[@class='card']//p)[16]")
	WebElement verifyShippingMethod;
	public WebElement VerifyShippingMethod() {
		return verifyShippingMethod;
	}

	@FindBy(xpath="(//div[@class='card']//p)[17]")
	WebElement verifyOverviewSalesRep;
	public WebElement VerifyOverviewSalesRep() {
		return verifyOverviewSalesRep;
	}
	@FindBy(xpath="(//div[@class='card']//p)[17]")
	WebElement verifySalesRep;
	public WebElement VerifySalesRep() {
		return verifyOverviewSalesRep;
	}

	@FindBy(xpath="(//div[@class='card']//p)[13]")
	WebElement verifyOverviewEstimatePaymentTerm;

	public WebElement VerifyOverviewEstimatePaymentTerm() {
		return verifyOverviewEstimatePaymentTerm;
	}

	@FindBy(xpath="(//div[@class='card']//p)[13]")
	WebElement verifyEstimatePaymentTerm;

	public WebElement VerifyEstimatePaymentTerm() {
		return verifyEstimatePaymentTerm;
	}
	@FindBy(xpath="(//div[@class='card']//p)[14]")
	WebElement verifyOverviewEstimatePaymentMethod;

	public WebElement VerifyOverviewEstimatePaymentMethod() {
		return verifyOverviewEstimatePaymentMethod;
	}

	@FindBy(xpath="(//div[@class='card']//p)[14]")
	WebElement verifyEstimatePaymentMethod;

	public WebElement VerifyEstimatePaymentMethod() {
		return verifyEstimatePaymentMethod;
	}
	
	@FindBy(xpath="//span[normalize-space()='Copy']")
	WebElement CopyEstimate;

	public WebElement CopyEstimate() {
		return CopyEstimate;
	}
}

