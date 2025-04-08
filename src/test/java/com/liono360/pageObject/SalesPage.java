package com.liono360.pageObject;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class SalesPage extends Baseclass{
	WebDriver ldriver;

	public SalesPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(xpath="//*[text()='Sales']")
	WebElement btnSales;

	public WebElement clickSales() {
		return btnSales;
	}


	@FindBy(xpath="//span[contains(text(),'Inventory')]")
	WebElement btnInventory;

	public WebElement clickInventory() {

		return btnInventory;
	}

	@FindBy(xpath="//span[normalize-space()='Sales Order']")
	WebElement btnSalesOrder;

	public WebElement clickSalesOrder() {
		return btnSalesOrder;
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

	@FindBy(xpath="(//body//app-root//span//li[1])[1]")
	WebElement btnSearchAccount;

	public WebElement clickSearchAccount() {
		return btnSearchAccount;
	}

	@FindBy(xpath="//input[@placeholder='Search by Item No., Barcode...']")
	WebElement btnBarcode;

	public WebElement clickBarcodeItemNo() {
		return btnBarcode;
	}
	@FindBy(xpath="//span[contains(text(),'Select Shipping Term')]")
	WebElement btnShippingTerm;

	public WebElement clickShippingTerm() {
		return btnShippingTerm;
	}

	@FindBy(xpath="//li[@role='option']")
	WebElement btnPrepaid;

	public WebElement clickshippingTermdropdown() {
		return btnPrepaid;
	}

	@FindBy(xpath="//span[contains(text(),'Select Sales Rep')]")
	WebElement btnSalesRep;

	public WebElement clickSalesRep() {
		return btnSalesRep;
	}
	@FindBy(xpath="//li[@role='option']")
	WebElement btnPan;

	public WebElement clicksalesrepuser() {
		return btnPan;
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
	@FindBy(xpath="(//tbody)[3]//tr[2]")
	WebElement btnClickProduct2;

	public WebElement clickProductitem2() {
		return btnClickProduct2;
	}

	@FindBy(xpath="//span[text()='Add']")
	WebElement btnAdd;

	public WebElement clickAddBtn() {
		return btnAdd;
	}

	@FindBy(xpath="//tbody/tr[1]/td[1]")
	WebElement btnSalesList;

	public WebElement clickSalesList() {
		return btnSalesList;
	}

	@FindBy(xpath="(//span[contains(text(),'Pick')])[3]")
	WebElement btnPick;

	public WebElement clickPick() {
		return btnPick;
	}



	@FindBy(xpath="//span[contains(text(),'Save')]")
	WebElement btnSaveButton;

	public WebElement ClickPicsaveBtn() {
		return btnSaveButton; }


	@FindBy(xpath="(//span[contains(text(),'Pack')])[3]")
	WebElement btnPack;

	public WebElement clickPack() {
		return btnPack;
	}

	@FindBy(xpath="//button[@label='Save']")
	WebElement btnPackSaveButton;

	public WebElement ClickPackSaveBtn() {
		return btnPackSaveButton; }


	@FindBy(xpath="(//span[contains(text(),'Ship')])") 
	WebElement btnShip;

	public WebElement clickShip() {
		return btnShip; }



	@FindBy(xpath="//span[text()='Labelling']")
	WebElement btnlabelling;

	public WebElement clickLabelling() {
		return btnlabelling;
	}
	@FindBy(xpath="//button[@label='Save']//span")
	WebElement clickShipBtn;

	public WebElement clickShipSaveBtn() {
		return clickShipBtn;
	}

	@FindBy(xpath="//span[normalize-space()='Verification']")
	WebElement btnverification;

	public WebElement clickVerification() {
		return btnverification;
	}
	@FindBy(xpath="//button[@label='Save']")
	WebElement btnSave;


	public WebElement clickSubmit() {
		return btnSave;
	}

	/*------------------Edit----------------------------	 */ 

	public WebElement clickEditsales() {
		return clickEditBtn;
	}
	@FindBy(xpath="(//span[contains(text(),'Edit')])[1]")
	WebElement clickEditBtn;

	@FindBy(xpath="(//tbody)[3]")
	WebElement clickaccaddress;

	public WebElement clickselectAccAddress() {
		return clickaccaddress;
	}

	@FindBy(xpath="//li[@role='option'][1]")
	WebElement txtEditNewAcc;

	public WebElement clickEditNewAcc() {
		return txtEditNewAcc;
	}


	@FindBy(xpath="(//tbody//tr[1])[2]")
	WebElement txtselect;

	public WebElement clickSelectAddress() {
		return txtselect;
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

	/*-------------------------ViewOption---------------------------*/
	@FindBy(xpath="//span[contains(text(),'View')]")
	WebElement txtViewOption;

	public WebElement clickViewEditOption() {
		return txtViewOption;
	}

	@FindBy(xpath="//h5[contains(text(),'SalesOrder')]")
	WebElement txtViewSalesHeader;

	public WebElement ViewSales()
	{
		return txtViewSalesHeader;
	}

	@FindBy(xpath="//span[contains(text(),'Cancel')]")
	WebElement txtCancel;

	/*------------------------------Delete----------------------------------*/
	public WebElement ClickCancel() {
		return txtCancel;
	}


	@FindBy(xpath="//span[contains(text(),'Delete')]")
	WebElement txtDelete;


	public WebElement clickDelete() {
		return txtDelete;

	}
	@FindBy(xpath = "//span[@class='p-button-icon p-button-icon-left pi pi-check']")
	WebElement btnAcceptDeleteSales;

	public WebElement acceptDeleteSales() {
		return btnAcceptDeleteSales;
	}

	/*--------------------------Search----------------------------*/
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement txtSearch;

	public WebElement setSearch() {
		return txtSearch;
	}

	@FindBy(xpath="(//tbody//tr[1])[2]")
	WebElement txtSearchValue;

	public WebElement clickProductListSeacrh() {
		return txtSearchValue;
	}

	@FindBy(xpath="//p-radiobutton[@value='1']//div[2]")
	WebElement txtShip;

	public WebElement clickShipRadio() {
		return txtShip;
	}

	@FindBy(xpath="//div[@role='dialog']//div//div//div//textarea")
	WebElement txtComment;

	public WebElement setCommentBox() {
		return txtComment;
	}
	@FindBy(xpath="//p-table[@paginatordropdownappendto='body']//th[3]")
	WebElement txtAvail;

	public WebElement clickTxtAvail() {
		return txtAvail;
	}
	@FindBy(xpath="//p-radiobutton[@value='2']//div[2]")
	WebElement txtBack;

	public WebElement clickBackOrder() {
		return txtBack;
	}

	@FindBy(xpath="//tbody//tr//td//p-tablecheckbox//div//div[@role='checkbox']")
	WebElement itemcheckBox;

	public WebElement clickcheckBox() {
		return itemcheckBox;
	}
	@FindBy(xpath="(//tbody//tr//td//p-tablecheckbox//div//div[@role='checkbox'])[2]")
	WebElement itemcheckBox2;

	public WebElement  clickcheckBox2() {
		return itemcheckBox2;

	}
	@FindBy(xpath="//button[@label='Create']//span")
	WebElement txtCreate;

	public WebElement clickCreate() {
		return txtCreate;
	}


	@FindBy(xpath="//div[@class='btnBars']//i[@class='pi pi-bars']") WebElement txtbtnbar;

	public WebElement clickBtnBar() { return txtbtnbar; }


	@FindBy(xpath="(//span[contains(text(),'Edit')])[3]")
	WebElement txtEdit;

	public WebElement clicktxtEdit() {
		return txtEdit;
	}

	@FindBy(xpath="//div[@aria-expanded='false']//span")
	WebElement drpdownExpanded;

	public WebElement clickdrpdownExpanded() {
		return drpdownExpanded;
	}

	@FindBy(xpath="(//p[contains(text(),'Status')])[2]")
	WebElement txtselectaddress;

	public WebElement drpclickSelectAddress()
	{
		return txtselectaddress;
	}

	@FindBy(xpath="//p-radiobutton[@value='3']//div[2]")
	WebElement txtHold;

	public WebElement clickHold() {
		return txtHold;
	}

	@FindBy(xpath="//p-dropdown[@formcontrolname='salesOrderStatus']")
	WebElement txtStatusChange;

	public WebElement clickstatusChnge() {
		return txtStatusChange;
	}

	@FindBy(xpath="(//div[@class='activity-content'])[1]")
	WebElement SalesOrderInvoice;

	public WebElement showSalesOrderInvoice() {
		return SalesOrderInvoice;
	}

	@FindBy(xpath="(//p[contains(text(),'Sales Order')])[2]")	
	WebElement txtCreatedInvoice;

	public WebElement setCreatedInvoice() {
		return txtCreatedInvoice;
	}
	@FindBy(xpath="(//p[contains(text(),'Sales Order Updated')])[1]")
	WebElement txtUpdated;

	public WebElement setUpdatedInvoice() {
		return txtUpdated;
	}

	@FindBy(xpath="//span[contains(text(),'Void')]")
	WebElement txtVoid;

	public WebElement clickVoidOption() {
		return txtVoid;
	}
	@FindBy(xpath="(//div[@class='btnBars']//i[@class='pi pi-times'])")
	WebElement txtCross;

	public WebElement clickCross()
	{
		return txtCross;
	}

	@FindBy(xpath="//span[contains(text(),'Yes')]")
	WebElement txtYes;

	public WebElement clickYes() {
		return txtYes;
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
	@FindBy(xpath="(//p-dropdown[@optionlabel='name'])[3]")
	WebElement optionlabelChannel;

	public WebElement setOptionlabelDropdown() {
		return optionlabelChannel;
	}
	@FindBy(xpath="//span[normalize-space()='Integration']")
	WebElement txtIntegrationchannel;

	public WebElement clickIntegrationchannel() {
		return txtIntegrationchannel;
	}

	@FindBy(xpath="(//span[contains(text(),'Active')])[1]")
	WebElement txtActive;

	public WebElement clickActive() {
		return txtActive;
	}
	@FindBy(xpath="(//span[contains(text(),'InActive')])[1]")
	WebElement txtInActive;

	public WebElement clickInActive() {
		return txtActive;
	}

	@FindBy(xpath="//li[@aria-label='Hold']")
	WebElement txthold;

	public WebElement clickHolddrpdown() {
		return txthold;
	}
	@FindBy(xpath="//div[@role='alert']")
	WebElement Txterror;

	public WebElement ClickError() {
		return Txterror;
	}
	@FindBy(xpath="//li[@aria-label='Entered']")
	WebElement txtEntered;

	public WebElement clickEnter() {
		return txtEntered;
	}

	@FindBy(xpath="(//div[@class='card']//span/p)[1]")
	WebElement verifySalesAccName;

	public WebElement verifySalesAccName() {
		return verifySalesAccName;
	}
	@FindBy(xpath="(//div[@class='card']//span/p)[1]")
	WebElement verifyOverviewSalesAccName;

	public WebElement VerifyOverviewSalesAccName() {
		return verifyOverviewSalesAccName;
	}

	@FindBy(xpath="(//div[@class='card']/p/span)[1]")
	WebElement verifySalesDate;

	public WebElement Verifysalesdat() {
		return verifySalesDate;
	}
	@FindBy(xpath="(//div[@class='card']/p/span)[1]")
	WebElement verifySalesOverviewDate;

	public WebElement VerifyOverviewSalesDate() {
		return verifySalesOverviewDate;
	}

	@FindBy(xpath="(//p)[13]")
	WebElement verifyOverviewSalesStatus;

	public WebElement VerifyOverviewSalesStatus() {
		return verifyOverviewSalesStatus;

	}
	@FindBy(xpath="(//p)[13]")
	WebElement verifySalesStatus;

	public WebElement VerifySalesStatus() {
		return verifySalesStatus;
	}
	@FindBy(xpath="(//div[@class='card']//p)[20]")
	WebElement verifySalesOverviewShippingMethod;

	public WebElement VerifySalesOverviewShippingMethod()
	{
		return verifySalesOverviewShippingMethod;
	}
	@FindBy(xpath="(//div[@class='card']//p)[20]")
	WebElement verifySalesShippingMethod;

	public WebElement VerifySalesShippingMethod() {
		return verifySalesShippingMethod;
	}
	@FindBy(xpath="(//div[@class='card']//p)[21]")
	WebElement verifySalessalesRep;
	public WebElement VerifySalessalesrep() {
		return verifySalessalesRep;
	}
	@FindBy(xpath="(//div[@class='card']//p)[21]")
	WebElement verifyOverviewSalessalesRep;

	public WebElement VerifyOverviewSalessalesRep() {
		return verifyOverviewSalessalesRep;
	}

	@FindBy(xpath="(//div[@class='card']//p)[19]")
	WebElement verifyOverviewSalesPaymentMethod;

	public WebElement VerifyOverviewSalesPaymentMethod() {
		return verifyOverviewSalesPaymentMethod;
	}

	@FindBy(xpath="(//div[@class='card']//p)[19]")
	WebElement verifySalesPaymentMethod;

	public WebElement VerifySalesPaymentMethod() {
		return verifySalesPaymentMethod;
	}

	@FindBy(xpath="(//div[@class='card']//p)[18]")
	WebElement verifySalesPaymentTerm;

	public WebElement VerifySalesPaymentTerm() {
		return verifySalesPaymentTerm;

	}
	@FindBy(xpath="(//div[@class='card']//p)[18]")
	WebElement verifyOverviewSalesPaymentTerm;

	public WebElement VerifyOverviewSalesPaymentTerm() {
		return verifySalesPaymentTerm;

	}

	@FindBy(xpath="//div[@class='card']/text()")
	WebElement verifysalesshippingterm;

	public WebElement Verifysalesshippingterm() {
		return verifysalesshippingterm;

	}

	/* @FindBy(xpath="//p-dropdown[@formcontrolname='shippingTerm']")
	 WebElement verifyOverviewsalesshippingterm;

	 public WebElement VerifyOverviewsalesshippingterm() {
		 return verifyOverviewsalesshippingterm;
	 */
	//}

	@FindBy(xpath = "//span[text()='Settings']")
	WebElement btnSetting;

	public WebElement ClickSettingBtn() {
		return btnSetting;
	}
	@FindBy(xpath = "//*[contains(text(),'Created By')]/preceding-sibling::p-checkbox//div[2]")
	WebElement btnCreatedBy;

	public WebElement clickCreatedBy() {
		return btnCreatedBy;
	}

	@FindBy(xpath = "//span[text()='Save']")
	WebElement btnSaveSetting;

	public WebElement clickSaveSetting() {
		return btnSaveSetting;
	}

	@FindBy(xpath = "//p-dropdown[@id='recentItems']")
	WebElement drpFilterCase;

	public WebElement selectFilterCase() {
		return drpFilterCase;
	}

}
