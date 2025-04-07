package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkspaceActionColumnPage {

	WebDriver ldriver;

	public WorkspaceActionColumnPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//span[text()='Misc.']")
	WebElement Misc;

	public WebElement Misc() {
		return Misc;
	}
	

	@FindBy(xpath = "//span[text()='Workspace']")
	WebElement Workspace;

	public WebElement Workspace() {
		return Workspace;
	}
	
	
	
	@FindBy(xpath = "(//p-card[@class='p-element'])[1]")
	WebElement ClickOnWorkspace;

	public WebElement ClickOnWorkspace() {
		return ClickOnWorkspace;
	}
	
	
	@FindBy(xpath = "(//tr[@class='p-element p-selectable-row ng-star-inserted'])[1]")
	WebElement ClickOnWorkbook;

	public WebElement ClickOnWorkbook() {
		return ClickOnWorkbook;
	}
	
	@FindBy(xpath = "(//i[@class='pi pi-paperclip'])[1]/parent::*")
	WebElement Documenticon;

	public WebElement Documenticon() {
		return Documenticon;
	}
	
	@FindBy(xpath = "//span[text()='Upload']")
	WebElement Upload;

	public WebElement Upload() {
		return Upload;
	}
	
	//........................View Documents...........................................//
	
	@FindBy(xpath = "(//span[@ptooltip='View'])[1]")
	WebElement Viewdocuments;

	public WebElement Viewdocuments() {
		return Viewdocuments;
	}
	
	
	
	
	
	
	//........................Download Documents......................................//
	
	@FindBy(xpath = "")
	WebElement Downloaddocuments;

	public WebElement Downloaddocuments() {
		return Downloaddocuments;
	}
	
	
	
	
	
	//.......................Edit Documents...........................................//
	
	@FindBy(xpath = "")
	WebElement Editdocuments;

	public WebElement Editdocuments() {
		return Editdocuments;
	}
	
	
	
	
	
	
	//.......................Delete Documents........................................//
	
	@FindBy(xpath = "")
	WebElement Deltedocuments;

	public WebElement Deltedocuments() {
		return Deltedocuments;
	}
	
	
	
	

	
	
}