package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Documents {

	WebDriver ldriver;

	public Documents(WebDriver rdriver) {
		ldriver = rdriver;
		//DynamicWait(ldriver);
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@id='user-display']//img[@alt='main logo']")
	WebElement UserIcon;

	public WebElement UserIcon() {
		return UserIcon;
	}
	
	@FindBy(xpath="(//span[normalize-space()='Profile'])[1]")
	WebElement Profile;

	public WebElement Profile() {
		return Profile;
	}
	
	
	@FindBy(xpath="(//span[normalize-space()='My Documents'])[1]")
	WebElement MyDocuments;

	public WebElement MyDocuments() {
		return MyDocuments;
	}
	
	
	@FindBy(xpath="(//i[@class='pi pi-bars'])[2]")
	WebElement HumbergIcon;

	public WebElement HumbergIcon() {
		return HumbergIcon;
	}
	
	
	@FindBy(xpath="(//span[normalize-space()='Add New Folder'])[1]")
	WebElement AddNewFolder;

	public WebElement AddNewFolder() {
		return AddNewFolder;
	}
	
	
	@FindBy(xpath="//label[@class='ng-star-inserted']//following-sibling::input")
	WebElement FolderName;

	public WebElement FolderName() {
		return FolderName;
	}
	
	
	@FindBy(xpath="//input[@type=\"file\"]")
	WebElement Choose;

	public WebElement Choose() {
		return Choose;
	}
	
	
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement Save;

	public WebElement Save() {
		return Save;
	}
	
	
	@FindBy(xpath="(//p-checkbox[@tooltipposition='top'])[1]")
	WebElement Checkbox1;

	public WebElement Checkbox1() {
		return Checkbox1;
	}
	
	
	@FindBy(xpath="(//p-checkbox[@tooltipposition='top'])[2]")
	WebElement Checkbox2;

	public WebElement Checkbox2() {
		return Checkbox2;
	}
	
	@FindBy(xpath="(//p-checkbox[@tooltipposition='top'])[3]")
	WebElement Checkbox3;

	public WebElement Checkbox3() {
		return Checkbox3;
	}
	
	
	//.........................................Upload Files..........................................................//
	
	
	@FindBy(xpath="(//span[normalize-space()='Upload'])[1]")
	WebElement Upload;

	public WebElement Upload() {
		return Upload;
	}
	
	
	//..........................Share Documents.........................................//	
	
	@FindBy(xpath="(//span[@ptooltip='Share'])[1]")
	WebElement ShareDocuments;

	public WebElement ShareDocuments() {
		return ShareDocuments;
	}
	
	@FindBy(xpath="(//input[@placeholder='Search keyword'])[1]")
	WebElement SearchKeyword;

	public WebElement SearchKeyword() {
		return SearchKeyword;
	}
	
	@FindBy(xpath="//th[normalize-space()='Read']//div[@class='p-checkbox-box']")
	WebElement Read;

	public WebElement Read() {
		return Read;
	}
	
	@FindBy(xpath="//th[normalize-space()='Write']//div[@class='p-checkbox-box']")
	WebElement Write;

	public WebElement Write() {
		return Write;
	}
	
	@FindBy(xpath="//th[normalize-space()='Download']//div[@class='p-checkbox-box']")
	WebElement Download;

	public WebElement Download() {
		return Download;
	}
	
	
	@FindBy(xpath="(//span[normalize-space()='Ok'])[1]")
	WebElement Ok;

	public WebElement Ok() {
		return Ok;
	}
	
	//..........................Download Documents.........................................//
				
	@FindBy(xpath="(//span[@ptooltip='Download'])[1]")
	WebElement DownloadDocuments;

	public WebElement DownloadDocuments() {
		return DownloadDocuments;
	}	
				
	//..........................Edit Document Name.........................................//
				
	@FindBy(xpath="(//span[@ptooltip='Edit'])[1]")
	WebElement EditDocument;

	public WebElement EditDocument() {
		return EditDocument;
	}	
		
	
	
	@FindBy(xpath="//label[normalize-space()='Document Name']//following-sibling::input")
	WebElement RenameDocumentName;

	public WebElement RenameDocumentName() {
		return RenameDocumentName;
	}	
	
	//..........................Delete Document Folder.........................................//	
	
	
	@FindBy(xpath="(//span[@ptooltip='Delete'])[1]")
	WebElement DeleteDocument;

	public WebElement DeleteDocument() {
		return DeleteDocument;
	}
	
	
	@FindBy(xpath="(//span[normalize-space()='Yes'])[1]")
	WebElement YesDelete;

	public WebElement YesDelete() {
		return YesDelete;
	}
	
	
	
	
	
	
	
}
