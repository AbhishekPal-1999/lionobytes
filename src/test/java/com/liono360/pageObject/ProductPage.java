package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class ProductPage extends Baseclass{
	
	WebDriver ldriver;

	public ProductPage(WebDriver rdriver) {
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
	
	@FindBy(xpath = "//*[text()='Inventory Item']")
	WebElement btnInventoryItem;

	public WebElement btnInventoryItems() {
		return btnInventoryItem;
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
	@FindBy(xpath = "//span[text()='Purchases']")
	WebElement txtPurchaseDrpdown;

	public WebElement ClickPurchaseDropdown() {
		return txtPurchaseDrpdown;
	}
	@FindBy(xpath="//p-dropdown[@id='productChannels']")
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
	@FindBy(xpath = "//li[@aria-label='Non Inventory Item']")
	WebElement dropdownnoninven;

	
	
	public WebElement ClickNonInventory() {
		return dropdownnoninven;
	}
	@FindBy(xpath = "//li[@aria-label='Kit/Package Items']")
	WebElement dropdownkititem;

	public WebElement ClickKitItem() {
		return dropdownkititem;
	}
	
	@FindBy(xpath = "//span[text()='Bill']")
	WebElement textBill;

	public WebElement ClickBill() {
		return textBill;
	}
	@FindBy(xpath = "//span[@aria-label=\"Select Variant\"]")
	WebElement drpVariant;

	public WebElement selectVariant() {
		return drpVariant;
	}
	
	
	@FindBy(xpath="(//p-dropdownitem/li[@role='option'])[3]")
	WebElement drpvariantchoice;
	
	public WebElement clickdrpVarientchoice() {
		return drpvariantchoice;
	}
	
	@FindBy(xpath="//span[text()='New']")
	WebElement drpdownnewBill;
	
	public WebElement clickdrpNewBill() {
		return drpdownnewBill;
	}
	
	@FindBy(xpath="//textarea[@formcontrolname='description']")
	WebElement txtitemdescription;
	
	public WebElement clickkititemdescription() {
		return txtitemdescription;
	}
	
	@FindBy(xpath="(//span[contains(text(),'Create bill')])")
	WebElement btncreatebill;
	
	public WebElement clickCreateBill() {
		return btncreatebill;
	}
	
	@FindBy(xpath = "//liono-treeselect[@placeholder=\"Select Category\"]//div[contains(@class,'p-treeselect p-component p-inputwrapper')]")
	WebElement drpCategory;

	public WebElement selectCategory() {
		return drpCategory;
	}
	
	@FindBy(xpath = "//body/div/div/ul/li[1]")
	WebElement drpshippingbtn;

	public WebElement drpshippingbtn() {
		return drpshippingbtn;
	}
	
	@FindBy(xpath="(//span[@class=\"p-treenode-label\"])[1]")
	WebElement drpchoicecategory;
	
	public WebElement clickdrpchoicecategory() {
		return drpchoicecategory;
	}
	@FindBy(xpath="(//a[@role='tab'])[2]")
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
	@FindBy(xpath= "//input[@id='description']")
	WebElement txtDescription;

	public WebElement setDescription() {
		return txtDescription;
	}
	
	@FindBy(xpath="(//div[@aria-label='dropdown trigger'])[4]")
	WebElement drpUOM;
	
	public WebElement clickUOM() {
		return drpUOM;
	}
	@FindBy(xpath="//textarea[@formcontrolname='description']")
	WebElement nonivendescription;
	
	public WebElement clickNoninvendescription() {
		return nonivendescription;
	}
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement Cancel;
	
	public WebElement Cancel_bttn() {
		return Cancel;
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[2]")
	WebElement listedProductName;
	
	public WebElement listedProductIs() {
		return listedProductName;
	}
	
	@FindBy(xpath="//input[@id='barcode']")
	WebElement txtbarcode;
	
	public WebElement clickBarcode() {
		return txtbarcode;
	}
	
	@FindBy(xpath="(//p-dropdown[@optionlabel='name'])[5]")
	WebElement drpdownUOM2;
	
	public WebElement clickUOM2() {
		return drpdownUOM2;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select color']//div[@aria-label='dropdown trigger']//span")
	WebElement txtcolor;
	
	public WebElement clickcolor() {
		return txtcolor;
	}
	
	@FindBy (xpath="//span[text()='Save']")
	WebElement btnSave;
	
	public WebElement clickSave() {
		return btnSave;
	}
	
	@FindBy(xpath="(//input[@inputmode='decimal'])[1]")
	WebElement btnlength;
	
	public WebElement clicklength() {
		return btnlength;
		
	}
	

	@FindBy(xpath="//p-inputnumber[@formcontrolname='sellPrice']//input[@inputmode='decimal']")
	WebElement btnprice;
	
	public WebElement clickprice() {
		return btnprice;
		
	}
	@FindBy(xpath="//span[text()='Sales']")
	WebElement btnSales;
	
	public WebElement clicksales() {
		return btnSales;
	}
	
	@FindBy(xpath="//span[text()='Location']")
	WebElement btnLocation;
	
	public WebElement click_Location() {
		return btnLocation;
	}
	
	@FindBy(xpath="(//span[text()='Finance'])[2]")
	WebElement btnFinances;
	
	public WebElement click_Finance() {
		return btnFinances;
	}
	
	
	
	@FindBy(xpath="(//input[@inputmode='decimal'])[2]")
	WebElement btnWidth;
	
	public WebElement clickWidth() {
		return btnWidth;
	}
	@FindBy(xpath="//p-inputnumber[@formcontrolname='buyPrice']//input[@inputmode='decimal']")
	WebElement btncost;
	
	public WebElement clickcost() {
		return  btncost;
	}
	@FindBy(xpath="(//input[@inputmode='decimal'])[3]")
	WebElement btnHeight;
	public WebElement clickHeight() {
		return btnHeight;
	}
	@FindBy(xpath="//p-inputnumber[@formcontrolname='sellPrice']//input[@inputmode='decimal']")
	WebElement btnkitsellprice;
	public WebElement clickkitsellprice() {
		return btnkitsellprice;
	}
	@FindBy(xpath="(//span[contains(text(),'Select Unit')])[1]")
	WebElement btnUnit;
	
	public WebElement clickUnit() {
		return btnUnit;
	}
	@FindBy (xpath="//span[@class='p-button-icon p-button-icon-left pi pi-chevron-right']")
	WebElement btnExpandProduct;
	
	public WebElement clickExpandProduct() {
		return btnExpandProduct;
	}
	@FindBy (xpath="//a[@role='tab']//span//i")
	WebElement btnplusaddkitproduct;
	
	public WebElement clickPlusaddproductkit() {
		return btnplusaddkitproduct;
	}
	@FindBy(xpath="//span[text()='View']")
	WebElement btnView;
	
	public WebElement clickViewOption() {
		return btnView;
	}
	
	@FindBy(xpath="//span[text()='Void']")
	WebElement btnVoid;
	
	public WebElement clickVoidOption() {
		return btnVoid;
	}
	@FindBy(xpath="//button[@label='Cancel']")
	WebElement btnCancel;
	
	public WebElement clickCancel() {
		return btnCancel;
	}
	
	
	@FindBy(xpath="//button[@label='Add']//span")
	WebElement btnAdd;
	
	public WebElement clickAddOption() {
		return btnAdd;
	}
	@FindBy(xpath="//p-dropdownitem/li[@role='option']")
	WebElement drpdownheightunit;
	
	public WebElement clickHeightunit() {
		return drpdownheightunit;
	}
	@FindBy(xpath="//span[text()='Edit']")
	WebElement btnEdit;
	
	public WebElement clickEditOption() {
		return btnEdit;
	}
	@FindBy(xpath="(//input[@inputmode='decimal'])[4]")
	WebElement btnWeight;
	
	public WebElement clickWeight() {
		return btnWeight;
		
	}
	@FindBy(xpath="(//span[contains(text(),'Select Vendor')])[1]")
	WebElement btnVendor;
	
	public WebElement clickVendor() {
		return btnVendor;
	}
	@FindBy(xpath="//label[normalize-space()='Customer Type List']")
	WebElement btncustomertypelist;
	
	public WebElement selectCustomerTypeList() {
		return btncustomertypelist;
	}
	@FindBy(xpath="//p-dropdownitem/li[@role='option']")
	WebElement btnselectvendor;
	
	public WebElement clickselectVendor() {
		return btnselectvendor;
		
	}
	@FindBy(xpath="//p-dropdown[@placeholder='Select Payment Term']//div//div[@aria-label='dropdown trigger']")
	WebElement btnselectvendor1;
	
	public WebElement clickselectVendor1() {
		return btnselectvendor1;
		
	}
	@FindBy(xpath="//span[normalize-space()='Select Brand']")
	
	WebElement btnbrand;
	
	public WebElement clickBrand() {
		return btnbrand;
	}
	
@FindBy(xpath="//p-inputnumber[@formcontrolname='sellPrice']//input[@inputmode='decimal']")
	
	WebElement btnsaleprize;
	
	public WebElement clickSaleprizze() {
		return btnsaleprize;
	}
	@FindBy(xpath="//span[text()='Delete']")
	WebElement btnDelete;
	
	public WebElement clickDeleteOption() {
		return btnDelete;
	}
	
	@FindBy(xpath="//p-inputnumber[@formcontrolname=\"totalQty\"]//input[@role=\"spinbutton\"]")
	WebElement QtyOnHand;
	
	public WebElement AddQtyOnHand() {
		return QtyOnHand;
	}
	
	
	
	
	@FindBy(xpath="//liono-treeselect[@placeholder='Select Class']//div//div//span")
	WebElement btnclass;
	
	public WebElement clickSelectClass() {
		return btnclass;
	}
	
	
	@FindBy(xpath="//p-dropdown[@formcontrolname='manufacturerId']//span[contains(text(),'Select Vendor')]")
	WebElement btnmanufacturervendor;
	
	public WebElement clickmanufacturervendor() {
		return btnmanufacturervendor;
	}
	
	@FindBy(xpath="//span[normalize-space()='Select Country']")
	WebElement btnManufacturerCountry;
	
	public WebElement clickManufacturerCountry() {
		return btnManufacturerCountry;
	}
	@FindBy(xpath="//span[text()='Yes']")
	WebElement btnYes;
	
	public WebElement clickYesToDelete() {
		return btnYes;
	}
	@FindBy(xpath="//span[normalize-space()='Select Warranty Type']")
	WebElement btnWarranty;
	
	public WebElement clickWarranty() {
		return btnWarranty;
	}
	@FindBy(xpath="//h5[@class='ng-star-inserted']")
	WebElement headerViewProduct;
	
	public WebElement productViewHeader() {
		return headerViewProduct;
	}
	
}
