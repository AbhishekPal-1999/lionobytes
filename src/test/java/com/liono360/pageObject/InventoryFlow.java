package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryFlow {
	WebDriver ldriver;

	public InventoryFlow(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Inventory']")
	WebElement inventorybtn;
	
	public WebElement clickInventory() {
	return inventorybtn;
}
	
}