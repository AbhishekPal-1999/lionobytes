package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class ItemReceiptPage extends Baseclass{
	WebDriver ldriver;
	public ItemReceiptPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

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
	
	@FindBy(xpath = "//span[contains(text(),'Item Receipt')]")
	WebElement btnitmReceipt;

	public WebElement clickItemReceipt() {
		return btnitmReceipt;
	}
	@FindBy(xpath = "//*[text()='New']")
	WebElement btnNewSales1;


	public WebElement clickAddNewItemReceipt() {

		return btnNewSales1;
	}
	@FindBy(xpath = "//body/div/div/ul/li[1]")
	WebElement drpshippingbtn;

	public WebElement drpshippingbtn() {
		return drpshippingbtn;
	}
	@FindBy(xpath="//p-dropdown[@placeholder='Select Vendor']//div//div[@aria-label='dropdown trigger']")
	WebElement btnSelectVendor;
	
	public WebElement clickSelectVendor() {
		return btnSelectVendor;
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
	@FindBy(xpath="//table[@role='table']//thead//tr//th//span//i")
	WebElement btnAddProductList;

	public WebElement clickAddProductList() {
		return btnAddProductList;
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
	@FindBy(xpath="(//tbody//tr)[1]")
	WebElement btnCreditMemoList;

	public WebElement clickEstimateList() {
		return btnCreditMemoList;
	}
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	WebElement txtYes;

	public WebElement clickYes() {
		return txtYes;
	}
	@FindBy(xpath="(//span[contains(text(),'Delete')])")
	WebElement txtDelete;

	public WebElement clickDelete() {
		return txtDelete;
	}
	@FindBy(xpath="(//span[contains(text(),'Edit')])")
	WebElement clickEditBtn;

	public WebElement clickEditEstimate() {
		return clickEditBtn;
	}
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement txtSave;

	public WebElement clickSaveBtn1() {
		return txtSave;
	}
	@FindBy(xpath="//span[text()='Void']")
	WebElement btnVoid;
	
	public WebElement clickVoidOption() {
		return btnVoid;
	}
}
