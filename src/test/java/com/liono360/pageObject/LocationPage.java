package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Panchanan
 *Lead page elements
 */

public class LocationPage {
	
	WebDriver ldriver;

	public LocationPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Inventory')]")
	WebElement btnInventory;
	
	public WebElement clickInventory() {
		return btnInventory;
	}
	
	@FindBy(xpath="//span[contains(text(),'Locations')]")
	WebElement btnLocation;
	
	public WebElement clickLocation() {
		return btnLocation;
	}
	
	@FindBy(xpath="//span[(text()='Add New')]")
	WebElement btnOpenAddLocation;

	public WebElement clickOpenAddLocation() {
		return btnOpenAddLocation;
	}
	
	@FindBy(xpath="//span[(text()='Location')]")
	WebElement btnAddLocation;

	public WebElement clickAddLocation() {
		return btnAddLocation;
	}
	
	@FindBy(xpath="//input[@formcontrolname='locationId']")
	WebElement txtLocationId;
	
	public WebElement setlocationId() {
		return txtLocationId;
	}
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	WebElement txtLocationName;
	
	public WebElement seLocationName() {
		return txtLocationName;
	}
	
	@FindBy(xpath="//p-multiselect[@formcontrolname=\"warehouseCategory\"]")
	WebElement selectCategory;
	
	public WebElement selectCategory() {
		return selectCategory;
	}
	
	
	@FindBy(xpath = "//input[@placeholder='Enter a location']")
	WebElement txtLocation;

	public WebElement setLocation() 
	{
		return txtLocation;
	}
	
	@FindBy(xpath="//tbody/tr[1]")
	WebElement listedLocationName;
	
	public WebElement listedLocationIs() {
		return listedLocationName;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement btnSaveLocation;

	public WebElement clickSave() 
	{
		return btnSaveLocation;
	}
	
	@FindBy(xpath= "//input[@formcontrolname='emailId']")
	WebElement txtEmail;
	
	public WebElement setEmail() {
		return txtEmail;
	}
	
	@FindBy(xpath="//input[@formcontrolname='phoneNo']")
	WebElement txtPhoneNo;
	
	public WebElement setPhoneNo() {
		return txtPhoneNo;
	}
	
	@FindBy(xpath= "//span[contains(text(), 'View')]")
	WebElement btnView;
	
	public WebElement clickView() {
		return btnView;
	}
	
	@FindBy(xpath= "//span[contains(text(), 'Edit')]")
	WebElement btnEdit;
	
	public WebElement clickEdit() {
		return btnEdit;
	}
	
	@FindBy(xpath= "//span[contains(text(), 'Delete')]")
	WebElement btnDelete;
	
	public WebElement clickDelete() {
		return btnDelete;
	}
	
	@FindBy(xpath="//button[@label='Cancel']")
	WebElement btnCancel;
	
	public WebElement clickCancel() {
		return btnCancel;
	}
	@FindBy(xpath="//input[@placeholder=\"Search\"]")
	WebElement btnSearch;

	public WebElement Search() {
		return btnSearch;
		}
	
	@FindBy(xpath= "//span[contains(text(), 'Yes')]")
	WebElement btnDeleteConfirmation;
	
	public WebElement clickDeleteConfirmation() {
		return btnDeleteConfirmation;
	}
	
	@FindBy(xpath= "//p-dropdown[@formcontrolname='typeId']")
	WebElement dropdownLocationType;
	
	public WebElement selectLocationType() {
		return dropdownLocationType;
	}
	
	@FindBy(xpath= "//p-dropdown[@formcontrolname='groupId']")
	WebElement dropdownLocationgroup;
	
	public WebElement selectLocationGroup() {
		return dropdownLocationType;
	}
	
	@FindBy(xpath= "//div[text()='Select Category']")
	WebElement dropdownLocationcategory;
	
	public WebElement multiSelectCategory() {
		return dropdownLocationcategory;
	}
	
	@FindBy(xpath= "//input[@placeholder='Search']")
	WebElement txtSearchLocation;
	
	public WebElement setSearchLocation() {
		return txtSearchLocation;
	}
	
	@FindBy(xpath= "//span[text()='Inventory Transfer']")
	WebElement btnInventoryTransfer;
	
	public WebElement clickInventoryTransfer() {
		return btnInventoryTransfer;
	}
	
	@FindBy(xpath= "//span[text()='Inventory Adjustment']")
	WebElement btnInventoryAdjustment;
	
	public WebElement clickInventoryAdjustment() {
		return btnInventoryAdjustment;
	}
	
	@FindBy(xpath="(//div[@aria-haspopup='listbox'])[2]")
	WebElement drpInventoryTransfer;
	
	public WebElement clickExpandDropdown() {
		return drpInventoryTransfer;
	}
	
	@FindBy(xpath="//span[text()='Select Account']")
	WebElement drpFinanceAccount;
	
	public WebElement selectFinanceAccount() {
		return drpFinanceAccount;
	}
	
	@FindBy(xpath="//span[contains(text(),'Asset')]")
	WebElement assetAccount;
	
	public WebElement clickAssetAccount() {
		return assetAccount;
	}
	
	
	@FindBy(xpath="//span[text()='Select Location']")
	WebElement drpFromLocation;
	
	public WebElement selectFromLocation() {
		return drpFromLocation;
	}
	
	@FindBy(xpath="//input[@aria-activedescendant='p-highlighted-option']")
	WebElement txtSearchFromLocation;
	
	public WebElement setSearchFromLocation() {
		return txtSearchFromLocation;
	}
	
	@FindBy(xpath="//input[@aria-activedescendant='p-highlighted-option']")
	WebElement txtSearchToLocation;
	
	public WebElement setSearchToLocation() {
		return txtSearchToLocation;
	}
	
	@FindBy(xpath="//input[@aria-activedescendant='p-highlighted-option']")
	WebElement txtSearchProduct;
	
	public WebElement setSearchProduct() {
		return txtSearchProduct;
	}
	
	@FindBy(xpath="//span[text()='Select Location']")
	WebElement drpToLocation;
	
	public WebElement selectToLocation() {
		return drpToLocation;
	}
	
	@FindBy(xpath="(//span[text()='Select Bin'])[1]")
	WebElement drpFromBin;
	
	public WebElement selectFromBin() {
		return drpFromBin;
	}
	
	@FindBy(xpath="(//span[text()='Select Bin'])[2]")
	WebElement drpToBin;
	
	public WebElement selectToBin() {
		return drpToBin;
	}
	
	@FindBy(xpath="//input[@role='spinbutton']")
	WebElement txtTransferQty;
	
	public WebElement setTransferQty() {
		return txtTransferQty;
	}
	
	@FindBy(xpath="//li[contains(text(),'Default Bin')]")
	WebElement defaultBin;
	
	public WebElement clickDefaultBin() {
		return defaultBin;
	}
	
	@FindBy(xpath="(//ul[@role='listbox']/p-dropdownitem)[1]")
	WebElement firstLocation;
	
	public WebElement clickFirst() {
		return firstLocation;
	}
	
	@FindBy(xpath="(//ul[@role='listbox']/p-dropdownitem)[2]")
	WebElement secondLocation;
	
	public WebElement clickSecond() {
		return secondLocation;
	}
	
	@FindBy(xpath="//span[contains(text(),'roduct')]")
	WebElement drpProduct;
	
	public WebElement selectProduct() {
		return drpProduct;
	}
	@FindBy(xpath="//tbody//tr[1]//td[1]")
	WebElement listedLocation;

	public WebElement ListedLocation() {
		return listedLocation;
		}
	
	@FindBy(xpath="//*[@id='product']")
	WebElement drpProductForAdjustment;
	
	public WebElement selectProductForAdjustment() {
		return drpProductForAdjustment;
	}
	
	@FindBy(xpath="//*[@id='product']")
	WebElement drpProductForTranfer;
	
	public WebElement selectProductForTransfer() {
		return drpProductForTranfer;
	}
	
	@FindBy(xpath="//input[@class='p-inputtext p-component p-element p-inputnumber-input p-filled']")
	WebElement txtProductToTransfer;
	
	public WebElement setProductQtyToTransfer() {
		return txtProductToTransfer;
	}
	
	@FindBy(xpath="//input[@class='p-inputtext p-component p-element p-inputnumber-input']")
	WebElement txtProductToAdjust;
	
	public WebElement setProductQtyToAdjust() {
		return txtProductToAdjust;
	}
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement btnNext;
	
	public WebElement clickNext() {
		return btnNext;
	}
	
	@FindBy(xpath="//span[text()='Yes']")
	WebElement btnyes;
	
	public WebElement clickYes() {
		return btnyes;
	}
	
	@FindBy(xpath="//span[contains(text(),'Transfers')]")
	WebElement btnTransferTab;
	
	public WebElement clickTransferTab() {
		return btnTransferTab;
	}
	
	@FindBy(xpath="//span[contains(text(),'Adjustments')]")
	WebElement btnAdjustmentsTab;
	
	public WebElement clickAdjustmentsTab() {
		return btnAdjustmentsTab;
	}
	
	@FindBy(xpath="//tr[@Class='p-element p-selectable-row ng-star-inserted']/td[contains(text(),'IT')]")
	WebElement btnViewQtyTransfered;
	
	public WebElement clickViewQtyTransfered() {
		return btnViewQtyTransfered;
	}
	
	@FindBy(xpath="//tr[@class='p-element p-selectable-row ng-star-inserted']/td[contains(text(),'IA')]")
	WebElement btnViewQtyAdjusted;
	
	public WebElement clickViewQtyAdjusted() {
		return btnViewQtyAdjusted;
	}
	
	@FindBy(xpath="//tr[@class='ng-star-inserted']/td[5]")
	WebElement qtyInventoryTransfered;
	
	public WebElement qtyTransfered() {
		return qtyInventoryTransfered;
	}
	
	@FindBy(xpath="//tr/td[3]")
	WebElement adjustedInventory;
	
	public WebElement clickAdjustedTransferedInventory() {
		return adjustedInventory;
	}
	
	@FindBy(xpath="//tr[@class='ng-star-inserted']/td[4]")
	WebElement qtyInventoryAdjusted;
	
	public WebElement qtyAdjusted() {
		return qtyInventoryAdjusted;
	}
	
	@FindBy(xpath="//textarea[@id='description']")
	WebElement txtComments;
	
	public WebElement setComment() {
		return txtComments;
	}
	
	@FindBy(xpath="//button[@label='Confirm']")
	WebElement btnConfirm;
	
	public WebElement clickConfirm() {
		return btnConfirm;
	}
	
	@FindBy(xpath="//div[@class='tabviewIcons']/div[3]")
	WebElement btnClose;
	
	public WebElement clickCloseDetails() {
		return btnClose;
	}

}
