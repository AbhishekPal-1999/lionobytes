package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class ProductPage extends Baseclass {

	WebDriver ldriver;

	public ProductPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

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

	@FindBy(xpath = "//span[text()='Inventory Item']")
	WebElement btnInventoryItem;

	public WebElement clickInventoryItem() {
		return btnInventoryItem;
	}

	@FindBy(xpath = "//span[text()='Non Inventory Item']")
	WebElement btnNonInventoryItem;

	public WebElement clickNonInventoryItem() {
		return btnNonInventoryItem;
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

	@FindBy(xpath = "//span[text()='Purchases']")
	WebElement txtPurchaseDrpdown;

	public WebElement ClickPurchaseDropdown() {
		return txtPurchaseDrpdown;
	}

	@FindBy(xpath = "//p-dropdown[@id='productChannels']")
	WebElement drpInventoryItem;

	public WebElement selectProduct() {
		return drpInventoryItem;
	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Channel']//div//div[@aria-label='dropdown trigger']")
	WebElement selectdropdownproduct;

	public WebElement selectDRopdownProduct() {
		return selectdropdownproduct;
	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement txtSearch;

	public WebElement setSearch() {
		return txtSearch;
	}

	@FindBy(xpath = "//span[text()='Non Inventory Item']")
	WebElement dropdownnoninven;

	public WebElement ClickNonInventory() {
		return dropdownnoninven;
	}

	@FindBy(xpath = "//span[text()='Kit/Package Items']")
	WebElement dropdownkititem;

	public WebElement ClickKitItem() {
		return dropdownkititem;
	}

	@FindBy(xpath = "//span[text()='Bill']")
	WebElement textBill;

	public WebElement ClickBill() {
		return textBill;
	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Variant']")
	WebElement drpVariant;

	public WebElement selectVariant() {
		return drpVariant;
	}

	@FindBy(xpath = "(//p-dropdownitem/li[@role='option'])[2]")
	WebElement drpvariantchoice;

	public WebElement clickdrpVarientchoice() {
		return drpvariantchoice;
	}

	@FindBy(xpath = "//span[text()='New']")
	WebElement drpdownnewBill;

	public WebElement clickdrpNewBill() {
		return drpdownnewBill;
	}

	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	WebElement txtitemdescription;

	public WebElement clickkititemdescription() {
		return txtitemdescription;
	}

	@FindBy(xpath = "(//span[contains(text(),'Create bill')])")
	WebElement btncreatebill;

	public WebElement clickCreateBill() {
		return btncreatebill;
	}

	@FindBy(xpath = "//div[contains(text(),'Select Category')]")
	WebElement drpCategory;

	public WebElement selectCategory() {
		return drpCategory;
	}

	@FindBy(xpath = "//body/div/div/ul/li[1]")
	WebElement drpshippingbtn;

	public WebElement drpshippingbtn() {
		return drpshippingbtn;
	}

	@FindBy(xpath = "(//li[@role='treeitem'])[1]")
	WebElement drpchoicecategory;

	public WebElement clickdrpchoicecategory() {
		return drpchoicecategory;
	}

	@FindBy(xpath = "(//a[@role='tab'])[2]")
	WebElement btnitems;

	public WebElement clickitemtab() {
		return btnitems;
	}

	@FindBy(xpath = "//input[@id='manufacturerProductId']")
	WebElement txtManugacturerItemNo;

	public WebElement setManugacturerItemNo() {
		return txtManugacturerItemNo;
	}

	@FindBy(xpath = "//input[@formcontrolname='manufacturerPartNo']")
	WebElement txtManugacturerPartNo;

	public WebElement setManugacturerPartNo() {
		return txtManugacturerPartNo;
	}

	@FindBy(xpath = "//h5[contains(text(),'Item View Page')]")
	WebElement txtViewLeadHeader;

	public WebElement ViewLeadHeader() {
		return txtViewLeadHeader;
	}

	@FindBy(xpath = "//h5[contains(text(),'Non Inventory View Page')]")
	WebElement txtViewNonInvenHeader;

	public WebElement ViewNonInvenHeader() {
		return txtViewNonInvenHeader;
	}

	@FindBy(xpath = "//input[@id='description']")
	WebElement txtDescription;

	public WebElement setDescription() {
		return txtDescription;
	}

	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[4]")
	WebElement drpUOM;

	public WebElement clickUOM() {
		return drpUOM;
	}

	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	WebElement nonivendescription;

	public WebElement clickNoninvendescription() {
		return nonivendescription;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	WebElement listedProductName;

	public WebElement listedProductIs() {
		return listedProductName;
	}

	@FindBy(xpath = "//input[@id='barcode']")
	WebElement txtbarcode;

	public WebElement clickBarcode() {
		return txtbarcode;
	}

	@FindBy(xpath = "(//p-dropdown[@optionlabel='name'])[5]")
	WebElement drpdownUOM2;

	public WebElement clickUOM2() {
		return drpdownUOM2;
	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select color']")
	WebElement txtcolor;

	public WebElement clickcolor() {
		return txtcolor;
	}

	@FindBy(xpath = "//button[@label='Save']")
	WebElement btnSave;

	public WebElement clickSave() {
		return btnSave;
	}

	@FindBy(xpath = "(//input[@inputmode='decimal'])[1]")
	WebElement btnlength;

	public WebElement clicklength() {
		return btnlength;

	}

	@FindBy(xpath = "//p-inputnumber[@formcontrolname='sellPrice']//input[@inputmode='decimal']")
	WebElement btnprice;

	public WebElement clickprice() {
		return btnprice;

	}

	@FindBy(xpath = "//span[text()='Sales']")
	WebElement btnSales;

	public WebElement clicksales() {
		return btnSales;
	}

	@FindBy(xpath = "(//input[@inputmode='decimal'])[2]")
	WebElement btnWidth;

	public WebElement clickWidth() {
		return btnWidth;
	}

	@FindBy(xpath = "//p-inputnumber[@formcontrolname='buyPrice']//input[@inputmode='decimal']")
	WebElement btncost;

	public WebElement clickcost() {
		return btncost;
	}

	@FindBy(xpath = "(//input[@inputmode='decimal'])[3]")
	WebElement btnHeight;

	public WebElement clickHeight() {
		return btnHeight;
	}

	@FindBy(xpath = "//p-inputnumber[@formcontrolname='sellPrice']//input[@inputmode='decimal']")
	WebElement btnkitsellprice;

	public WebElement clickkitsellprice() {
		return btnkitsellprice;
	}

	@FindBy(xpath = "(//span[contains(text(),'Select Unit')])[1]")
	WebElement btnUnit;

	public WebElement clickUnit() {
		return btnUnit;
	}

	@FindBy(xpath = "//span[@class='p-button-icon p-button-icon-left pi pi-chevron-right']")
	WebElement btnExpandProduct;

	public WebElement clickExpandProduct() {
		return btnExpandProduct;
	}

	@FindBy(xpath = "//a[@role='tab']//span//i")
	WebElement btnplusaddkitproduct;

	public WebElement clickPlusaddproductkit() {
		return btnplusaddkitproduct;
	}

	@FindBy(xpath = "//span[text()='View']")
	WebElement btnView;

	public WebElement clickViewOption() {
		return btnView;
	}

	@FindBy(xpath = "//span[text()='Void']")
	WebElement btnVoid;

	public WebElement clickVoidOption() {
		return btnVoid;
	}

	@FindBy(xpath = "//button[@label='Cancel']")
	WebElement btnCancel;

	public WebElement clickCancel() {
		return btnCancel;
	}

	@FindBy(xpath = "//button[@label='Add']//span")
	WebElement btnAdd;

	public WebElement clickAddOption() {
		return btnAdd;
	}

	@FindBy(xpath = "//p-dropdownitem/li[@role='option']")
	WebElement drpdownheightunit;

	public WebElement clickHeightunit() {
		return drpdownheightunit;
	}

	@FindBy(xpath = "//span[text()='Edit']")
	WebElement btnEdit;

	public WebElement clickEditOption() {
		return btnEdit;
	}

	@FindBy(xpath = "(//input[@inputmode='decimal'])[4]")
	WebElement btnWeight;

	public WebElement clickWeight() {
		return btnWeight;

	}

	@FindBy(xpath = "(//span[contains(text(),'Select Vendor')])[1]")
	WebElement btnVendor;

	public WebElement clickVendor() {
		return btnVendor;
	}

	@FindBy(xpath = "//label[normalize-space()='Customer Type List']")
	WebElement btncustomertypelist;

	public WebElement selectCustomerTypeList() {
		return btncustomertypelist;
	}

	@FindBy(xpath = "//p-dropdownitem/li[@role='option']")
	WebElement btnselectvendor;

	public WebElement clickselectVendor() {
		return btnselectvendor;

	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Payment Term']//div//div[@aria-label='dropdown trigger']")
	WebElement btnselectvendor1;

	public WebElement clickselectVendor1() {
		return btnselectvendor1;

	}

	@FindBy(xpath = "//span[normalize-space()='Select Brand']")

	WebElement btnbrand;

	public WebElement clickBrand() {
		return btnbrand;
	}

	@FindBy(xpath = "//p-inputnumber[@formcontrolname='sellPrice']//input[@inputmode='decimal']")

	WebElement btnsaleprize;

	public WebElement clickSaleprizze() {
		return btnsaleprize;
	}

	@FindBy(xpath = "//span[text()='Delete']")
	WebElement btnDelete;

	public WebElement clickDeleteOption() {
		return btnDelete;
	}

	@FindBy(xpath = "//liono-treeselect[@placeholder='Select Class']//div//div//span")
	WebElement btnclass;

	public WebElement clickSelectClass() {
		return btnclass;
	}

	@FindBy(xpath = "//span[text()='Taxable']")
	WebElement drpTaxable;

	public WebElement selectTaxableOption() {
		return drpTaxable;
	}

	@FindBy(xpath = "//li[@aria-label='Yes']")
	WebElement optYes;

	public WebElement selectYes() {
		return optYes;
	}

	@FindBy(xpath = "//li[@aria-label='No']")
	WebElement optNo;

	public WebElement selectNo() {
		return optNo;
	}

	@FindBy(xpath = "//p-dropdown[@formcontrolname='manufacturerId']//span[contains(text(),'Select Vendor')]")
	WebElement btnmanufacturervendor;

	public WebElement clickmanufacturervendor() {
		return btnmanufacturervendor;
	}

	@FindBy(xpath = "//span[normalize-space()='Select Country']")
	WebElement btnManufacturerCountry;

	public WebElement clickManufacturerCountry() {
		return btnManufacturerCountry;
	}

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement btnYes;

	public WebElement clickYesToDelete() {
		return btnYes;
	}

	@FindBy(xpath = "//span[normalize-space()='Select Warranty Type']")
	WebElement btnWarranty;

	public WebElement clickWarranty() {
		return btnWarranty;
	}

	@FindBy(xpath = "//h5[@class='ng-star-inserted']")
	WebElement headerViewProduct;

	public WebElement productViewHeader() {
		return headerViewProduct;
	}

	@FindBy(xpath = "//div[@class='p-checkbox-box']")
	WebElement checkBoxPurchase;

	public WebElement clickPurchasedProduct() {
		return checkBoxPurchase;
	}

	@FindBy(xpath = "(//input[@inputmode='decimal'])[2]")
	WebElement txtCostPrice;

	public WebElement setCostPrice() {
		return txtCostPrice;
	}

	@FindBy(xpath = "//div[@class='p-radiobutton-box']")
	WebElement radioFinancialData;

	public WebElement clickFinancialOfPreviousYear() {
		return radioFinancialData;
	}

	@FindBy(xpath = "(//span[text()='Save'])[2]")
	WebElement btnFinaceSave;

	public WebElement clickFinaceDataSave() {
		return btnFinaceSave;
	}

	@FindBy(xpath = "//input[@id='rate']")
	WebElement txtRate;

	public WebElement setRate() {
		return txtRate;
	}

	@FindBy(xpath = "//span[text()='Service']")
	WebElement drpService;

	public WebElement clickService() {
		return drpService;
	}

	@FindBy(xpath = "//input[@inputmode='decimal']")
	WebElement inputprize;

	public WebElement clickinputprize() {
		return inputprize;
	}

	@FindBy(xpath = "//div[@class='btnBars']//i[@class='pi pi-bars']")
	WebElement btnHamburgericon;

	public WebElement clickHamburgericon() {
		return btnHamburgericon;
	}

	@FindBy(xpath = "//h5[contains(text(),'Service View Page')]")
	WebElement headerViewService;

	public WebElement serviceViewHeader() {
		return headerViewService;
	}

	@FindBy(xpath = "//*[contains(@class, 'refresh')]")
	WebElement buttonRefresh;

	public WebElement clickRefresh() {
		return buttonRefresh;
	}
	
	@FindBy(xpath= "//i[@class='pi pi-plus']")
	WebElement btnAddNewUOM;
	
	public WebElement clickAddNewUOM() {
		return btnAddNewUOM;
	}
	
	@FindBy(xpath= "(//div[@class='p-dropdown p-component p-inputwrapper p-dropdown-clearable p-inputwrapper-filled'])[3]")
	WebElement drpSecondUOM;
	
	public WebElement selectSecondUOM() {
		return drpSecondUOM;
	}
	
	@FindBy(xpath = "(//input[@id='barcode'])[2]")
	WebElement txtbarcode2;

	public WebElement clickBarcode2() {
		return txtbarcode2;
	}
	
	@FindBy(xpath="(//i[@class='pi pi-plus'])[2]")
	WebElement btnAddProductToKit;
	
	public WebElement clickAddProductToKit() {
		return btnAddProductToKit;
	}
	
	@FindBy(xpath = "//h5[contains(text(),'Kit/Package View Page')]")
	WebElement txtViewKitHeadet;

	public WebElement ViewKitHeader() {
		return txtViewKitHeadet;
	}
	
	@FindBy(xpath = "//h5[contains(text(),'Bundle View Page')]")
	WebElement txtViewBundleHeadet;

	public WebElement ViewBundleHeader() {
		return txtViewBundleHeadet;
	}
	
	@FindBy(xpath= "//span[text()='Bundle Item']")
	WebElement drpBundleItem;
	
	public WebElement clickBundleItem() {
		return drpBundleItem;
	}
	
	@FindBy(xpath = "//input[@id='bundleNo']")
	WebElement txtBundleNo;

	public WebElement setBundleNo() {
		return txtBundleNo;
	}
	
	
	@FindBy(xpath= "(//div[@class='p-dropdown p-component p-inputwrapper p-dropdown-clearable p-inputwrapper-filled'])[2]")
	WebElement drpSecondUOMBundle;
	
	public WebElement selectSecondUOMBundle() {
		return drpSecondUOMBundle;
	}
	
	@FindBy(xpath="//input[@formcontrolname='sellPrice']")
	WebElement txtSellPriceBundle;
	
	public WebElement setSellPriceBundle() {
		return txtSellPriceBundle;
	}

}
