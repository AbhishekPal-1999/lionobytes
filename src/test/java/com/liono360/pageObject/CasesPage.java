package com.liono360.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Panchanan
 *Lead page elements
 */

public class CasesPage extends com.liono360.loginPage.Baseclass{
	
	WebDriver ldriver;

	public CasesPage(WebDriver rdriver) {
		ldriver = rdriver;
		//DynamicWait(ldriver);
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="(//span[contains(text(),'Cases')])[1]")
	WebElement btnCases;

	public WebElement clickCases() {
		return btnCases;
	}
	
	
	@FindBy(xpath="(//p-dropdown[@placeholder='Choose One'])[1]")
	WebElement CaseChannel;

	public WebElement CaseChannel() {
		return CaseChannel;
	}
	
	@FindBy(xpath="(//p-dropdown[@optionlabel='name'])[2]")
	WebElement AccountChannel;

	public WebElement AccountChannel() {
		return AccountChannel;
	}
	
	
	
	
	
	@FindBy(xpath="(//td[@class='ng-star-inserted'])[1]")
	WebElement RightClick;

	public WebElement RightClick() {
		return RightClick;
	}
	@FindBy(xpath="//tbody//tr[1]")
	WebElement listedCases;

	public WebElement addedCase() {
		return listedCases;
	}
	

	@FindBy(xpath="//span[text()='View']")
	WebElement btnViewCase;
	
	public WebElement clickViewCase()
	{
		return btnViewCase;
	}
	
	@FindBy(xpath="//span[text()='View Case']")
	WebElement txtViewCaseHeader;
	
	public WebElement ViewCaseHeader()
	{
		return txtViewCaseHeader;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	WebElement btnEditCase;

	public WebElement clickEditCase() {
		return btnEditCase;
	}
	
	@FindBy(xpath="//*[@label='Save']")
	WebElement btnSaveCase;

	public WebElement clickSave() {
		return btnSaveCase;
	}
	
	@FindBy(xpath="//span[text()='New']")
	WebElement btnNewCase;

	public WebElement clickAddCase() {
		return btnNewCase;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Case Association']")
	WebElement drpCaseAssociation;
	
	public WebElement selectCaseAssociation() {
		return drpCaseAssociation;
	}
	
	@FindBy(xpath="//input[@placeholder='Search by name']")
	WebElement txtSearchbyname;
	
	public WebElement setAssociationName() {
		return txtSearchbyname;
	}
	
	@FindBy(xpath="(//p-autocomplete[@id='contactNames'])[1]")
	WebElement txtcontactNames;
	
	public WebElement setcontactNames() {
		return txtcontactNames;
	}
	
	@FindBy(xpath="(//input[@aria-autocomplete='list'])[3]")
	WebElement txtEmailAddress;
	
	public WebElement setEmailAddress() {
		return txtEmailAddress;
	}
	
	@FindBy(xpath="(//p-autocomplete[@id='phoneNumberSuggestion'])[1]")
	WebElement txtPhoneNumber;
	
	public WebElement setPhoneNumber() {
		return txtPhoneNumber;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Source']")
	WebElement drpSelectSource;
	
	public WebElement selectSelectSource() {
		return drpSelectSource;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Category']")
	WebElement drpSelectCategory;
	
	public WebElement selectCategory() {
		return drpSelectCategory;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Sub Category']")
	WebElement drpSelectSubCategory;
	
	public WebElement selectSubCategory() {
		return drpSelectSubCategory;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Priority']")
	WebElement drpSelectPriority;
	
	public WebElement SelectPriority() {
		return drpSelectPriority;
	}
	
	
	@FindBy(xpath="//input[@name='subject']")
	WebElement txtSubject;
	
	public WebElement setSubject() {
		return txtSubject;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Choose')]")
	WebElement chooseFile;
	
	public WebElement chooseFile() {
		return chooseFile;
	}
	

	@FindBy(xpath="//textarea[@formcontrolname='ticketDesc']")
	WebElement txtDescription;
	
	public WebElement setCaseDeatils() {
		return txtDescription;
	}
	
	@FindBy(xpath="//p-calendar[@formcontrolname='resolutionDate']")
	WebElement calenderesolutionDate;
	
	public WebElement setResolutionDate() {
		return calenderesolutionDate;
	}
	
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Groups']")
	WebElement drpSelectGroups;
	
	public WebElement SelectGroups() {
		return drpSelectGroups;
	}
	
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Users']")
	WebElement drpSelectUsers;
	
	public WebElement SelectUsers() {
		return drpSelectUsers;
	}
	
	@FindBy(xpath="//*[@label='Save']")
	WebElement btnSaveLead;

	public WebElement clickSubmit() {
		return btnSaveLead;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	WebElement btnDeleteCase;

	public WebElement clickDeleteCase() {
		return btnDeleteCase;
	}
	
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement btnYes;

	public WebElement clickYesButton() {
		return btnYes;
	}
	
	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[1]//p[1]")
	WebElement txtlatestCaseNo;

	public WebElement latestCaseNo() {
		return txtlatestCaseNo;
	}
	
	 
    @FindBy(xpath="//input[@placeholder='Global Search']")
    WebElement txtGloabalSearch;
		
    public WebElement setGloabalSearch() {
		return txtGloabalSearch;
		}	
    
    @FindBy(xpath = "(//span[text()='Pre Assigned'])[2]")
	WebElement btnPreAssigned;

	public WebElement clickPreAssignedbtn() {
		return btnPreAssigned;
	}
	
	@FindBy(xpath = "(//span[text()='Assigned'])[2]")
	WebElement btnAssigned;

	public WebElement clickAssignedBtn() {
		return btnAssigned;
	}
	
	@FindBy(xpath = "(//span[text()='In-Progress'])[2]")
	WebElement btnInProgress;

	public WebElement clickInProgressBtn() {
		return btnInProgress;
	}
	
	@FindBy(xpath = "(//span[text()='Reopen'])[2]")
	WebElement btnReopen;

	public WebElement clickReopenBtn() {
		return btnReopen;
	}
	
	@FindBy(xpath = "(//span[text()='Closed'])[2]")
	WebElement btnClosed;

	public WebElement clickClosedBtn() {
		return btnClosed;
	}
	
	@FindBy(xpath = "//textarea[@id='comment']")
	WebElement txtComments;

	public WebElement setComments() {
		return txtComments;
	}
	
	@FindBy(xpath = "//div[@class='p-checkbox-box']")
	WebElement btnNotifyClient;

	public WebElement clickNotifyClient() {
		return btnNotifyClient;
	}
	
	@FindBy(xpath = "//p-dropdown[@id='recentItems']")
	WebElement drpFilterCase;

	public WebElement selectFilterCase() {
		return drpFilterCase;
	}
	
	@FindBy(xpath = "//span[text()='15']")
	WebElement drpEntries;

	public WebElement selectEntriesLimit() {
		return drpEntries;
	}
	
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
    
    @FindBy(xpath = "//span[text()='List']//parent::a")
    WebElement drpCanabView;

    public WebElement clickCanabView() {
	return drpCanabView;
       }
    

    //.......................................Import....................................//
    
    
    @FindBy(xpath = "//p-dropdown[@placeholder='Select Module']")
    WebElement ModuleName;

    public WebElement ModuleName() {
	return ModuleName;
       }
    
    @FindBy(xpath = "//p-dropdown[@placeholder='Select Channel']")
    WebElement ChannelName;

    public WebElement ChannelName() {
	return ChannelName;
       }
    @FindBy(xpath = "//span[normalize-space()='List']")
    WebElement clickList;

    public WebElement ClickList() {
    	return clickList;
    }
    @FindBy(xpath = "//span[normalize-space()='Select label type ...']")
	WebElement LabelSelect;

	public WebElement LabelSelect() {
		return LabelSelect;
	}
	
	
	
	
	
	@FindBy(xpath = "//span[text()='Upload']")
	WebElement Upload;

	public WebElement Upload() {
		return Upload;
	}
	@FindBy(xpath = "//span[@class='pi pi-refresh']")
	WebElement LoadConfig;

	public WebElement LoadConfig() {
		return LoadConfig;
	}
	@FindBy(xpath = "//span[text()='Back']")
	WebElement Back;

	public WebElement Back() {
		return Back;
	}
	@FindBy(xpath = "//span[text()='A_CustomInput']//parent::*//div[2]")
	WebElement clickCheckbox;

	public WebElement CClickCheckbox() {
		return clickCheckbox;
	}
	@FindBy(xpath = "//span[text()='Load']")
	WebElement Load;

	public WebElement Load() {
		return Load;
	}
	@FindBy(xpath = "(//div[@class='p-radiobutton-box'])[1]")
	WebElement ClickBBox;

	public WebElement Updatecc() {
		return ClickBBox;
	}
	@FindBy(xpath = "(//div[@class='p-radiobutton-box'])[2]")
	WebElement AddUpdatec;

	public WebElement AddUpdatec() {
		return AddUpdatec;
	}
	
    @FindBy(xpath = "//span[text()='Import']")
    WebElement clickImport;

    public WebElement clickImport() {
    	return clickImport;
    }
    @FindBy(xpath = "//span[text()='Next']")
    WebElement Next;

    public WebElement Next() {
    	return Next;
    }
    @FindBy(xpath = "//span[text()='Upload']")
    WebElement clickUpload;

    public WebElement ClickUpload() {
    	return clickUpload;
    }
    @FindBy(xpath="//a[@id='user-display']//img[@alt='main logo']")
    WebElement ProfileClick;

    public WebElement ProfileClick() {
    	return ProfileClick;
    }
    @FindBy(xpath = "//span[text()='Automation_Test']//parent::*//div[2]")
    WebElement BoxAppend;

    public WebElement BoxAppend() {
    	return BoxAppend;
    	
    	
    }
    @FindBy(xpath="//span[text()='Profile']")
    WebElement Cprofile;

    public WebElement Cprofile() {
    	return Cprofile;
    }
    @FindBy(xpath = "//span[normalize-space()='My Documents']")
	WebElement ClickMydocuments;

	public WebElement ClickMydocuments() {
		return ClickMydocuments;
	}
	@FindBy(xpath = "//span[normalize-space()='Downloads']")
	WebElement ClickDownloads;

	public WebElement ClickDownloads() {
		return ClickDownloads;
	}
	
	@FindBy(xpath = "//td[normalize-space()='Lead']")
	WebElement ClickLeadFile;

	public WebElement ClickLeadFile() {
		return ClickLeadFile;
	}
	
	@FindBy(xpath = "(//i[@class='pi pi-download'])[1]")
	WebElement DownloadLeadFile;

	public WebElement DownloadLeadFile() {
		return DownloadLeadFile;
	}
	
	
	
	@FindBy(xpath = "//span[normalize-space()='Import']")
	WebElement Importclick1;

	public WebElement Importclick1() {
		return Importclick1;
	}
	
	
	@FindBy(xpath = "(//span[@class='btnBars p-mr-0 ng-star-inserted'])[1]")
	WebElement plusimportbtn;

	public WebElement plusimportbtn() {
		return plusimportbtn;
	}
	
	@FindBy(xpath = "(//span[text()='Contacts'])[2]")
	WebElement ContactsClick;

	public WebElement ContactsClick() {
		return ContactsClick;
	}
    @FindBy(xpath="//span[text()='Import']")
    WebElement Cimport;

    public WebElement Cimport() {
    	return Cimport;
    }
    @FindBy(xpath="(//span[@ptooltip='Retry'])[1]//parent::span")
    WebElement Replay;

    public WebElement Replay() {
    	return Replay;
    }
    
    @FindBy(xpath="//label[normalize-space()='Download Format File']")
    WebElement DownloadFileformat;

    public WebElement DownloadFileformat() {
    	return DownloadFileformat;
    }
   ////span[text()='B_custom']//parent::*//div[2]
    
    @FindBy(xpath="//span[text()='B_custom']//parent::*//div[2]")
    WebElement Checkboxc;

    public WebElement Checkboxc() {
    	return Checkboxc;
    }
    @FindBy(xpath="//span[normalize-space()='Proceed']")
    WebElement Proceed;

    public WebElement Proceed() {
    	return Proceed;
    }
    @FindBy(xpath="//p-dropdown[@placeholder='Select Category ...']")
    WebElement Catgory;

    public WebElement Catgory() {
    	return Catgory;
    }
    
    
    @FindBy(xpath="//div[text()='Select Sub - Category ...']")
    WebElement SubCatgory;

    public WebElement SubCatgory() {
    	return SubCatgory;
    }
    @FindBy(xpath="//p-dropdown[@placeholder='Select Assigned Group ...']")
    WebElement AssignedGroup;

    public WebElement AssignedGroup() {
    	return AssignedGroup;
    }
    
    @FindBy(xpath="//div[text()='Select Assigned User ...']")
    WebElement AssignedUser;

    public WebElement AssignedUser() {
    	return AssignedUser;
    }
    @FindBy(xpath="//span[normalize-space()='Download']")
    WebElement Download;

    public WebElement Download() {
    	return Download;
    }
    @FindBy(xpath="//span[normalize-space()='Yes']")
    WebElement Yes;

    public WebElement Yes() {
    	return Yes;
    }
    @FindBy(xpath = "(//div[@class='p-radiobutton-box'])[1]")
	WebElement Updatec;

	public WebElement Updatec() {
		return Updatec;
	}
	@FindBy(xpath = "(//div[@class='p-radiobutton-box'])[2]")
	WebElement AddUpdate;

	public WebElement AddUpdate() {
		return AddUpdate;
	}
	

    @FindBy(xpath = "//input[@type='file']")
    WebElement SharedFiles;

    public WebElement attachSharedFiles() {
	return SharedFiles;
       }
    
    @FindBy(xpath = "//span[text()='Cancel']")
    WebElement btnCancel;

    public WebElement clickCancel() {
	return btnCancel;
    }
  ///.............Export................................//

    @FindBy(xpath = "//span[text()='Export']")
    WebElement ExportClick;

    public WebElement ExportClick() {
    	return ExportClick;
    }

    @FindBy(xpath = "(//span[text()='Export'])[2]")
    WebElement ExportClick2;

    public WebElement ExportClick2() {
    	return ExportClick2;
    }
    @FindBy(xpath = "//span[text()='Yes']")
    WebElement Yes1;

    public WebElement Yes1() {
    	return Yes1;
    }


    @FindBy(xpath = "//span[text()='A_CustomInput']//parent::*//div[2]")
    WebElement ClickCustomBox;

    public WebElement ClickCustomBox() {
    	return ClickCustomBox;
    	
    	
    }


    //......................import profile..................................//


    @FindBy(xpath="//tbody/tr[1]/td[8]")
    WebElement ClickImportedFile;

    public WebElement ClickImportedFile() {
    	return ClickImportedFile;
    }
    
    
 //.................Cases Asseration........................//
    
    
    @FindBy(xpath = "//input[@formcontrolname='sequenceNumber']")
    WebElement CaseId;

    public WebElement caseId() {
	return CaseId;
    }
    
    
  //.......................Activity Time line  Logs................................................//
    
    
    @FindBy(xpath = "")
    WebElement ActivityTimelineTab;

    public WebElement ActivityTimelineTab() {
	return ActivityTimelineTab;
    }
    
    @FindBy(xpath = "(//span[normalize-space()='Activity'])[1]")
	WebElement ActivityTab;

	public WebElement ActivityTab() {
		return ActivityTab;
	}

	@FindBy(xpath = "(//i[@class='pi pi-plus'])[1]")
	WebElement PlusIcon;

	public WebElement PlusIcon() {
		return PlusIcon;
	}

	@FindBy(xpath = "(//span[normalize-space()='Email'])[1]")
	WebElement EmailBox;

	public WebElement EmailBox() {
		return EmailBox;
	}
	
	//................Email....................//
	
	@FindBy(xpath = "(//p-autocomplete[@id='toRecips'])[1]")
	WebElement TO;

	public WebElement TO() {
		return TO;
	}
	
	@FindBy(xpath = "(//input[@id='subject'])[1]")
	WebElement Subject;

	public WebElement Subject() {
		return Subject;
	}
	
	@FindBy(xpath = "(//div[@class='ql-editor ql-blank'])[1]")
	WebElement EnterText;

	public WebElement EnterText() {
		return EnterText;
	}
	
	
	@FindBy(xpath = "//span[text()='Send now']")
	WebElement Option;

	public WebElement Option() {
		return Option;
	}
	
	
	@FindBy(xpath = "(//span[normalize-space()='Send'])[1]")
	WebElement Send;

	public WebElement Send() {
		return Send;
	}
	
	//...............................Logs...................................//
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Logs'])[1]")
	WebElement logs;

	public WebElement logs() {
		return logs;
	}

	@FindBy(xpath = "(//p-dropdown[@id='logType'])[1]")
	WebElement SelectType;

	public WebElement SelectType() {
		return SelectType;
	}
	
	
	@FindBy(xpath = "(//textarea[@placeholder='Enter Comment'])[1]")
	WebElement Comment;

	public WebElement LogComment() {
		return Comment;
	}
	
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveLogbtn;

	public WebElement SaveLogbtn() {
		return SaveLogbtn;
	}
	
	
	@FindBy(xpath = "(//p-dropdown[@id='subLogType'])[1]")
	WebElement SelectSubType;

	public WebElement SelectSubType() {
		return SelectSubType;
	}
	
	
	//.................................Edit Logs ........................................................//
	
	
	@FindBy(xpath = "(//div[@class='p-d-flex cursor-pointer'])[1]")
	WebElement FirstLog;

	public WebElement FirstLog() {
		return FirstLog;
	}
	
	
	
	@FindBy(xpath = "(//div[@class='p-d-flex cursor-pointer'])[2]")
	WebElement SecondLog;

	public WebElement SecondLog() {
		return SecondLog;
	}
	
	
	@FindBy(xpath = "(//div[@class='p-d-flex cursor-pointer'])[3]")
	WebElement ThirdLog;

	public WebElement ThirdLog() {
		return ThirdLog;
	}
	
	@FindBy(xpath = "(//i[@class='pi pi-pencil'])[1]")
	WebElement EditLog;

	public WebElement EditLog() {
		return EditLog;
	}

	
	@FindBy(xpath = "(//textarea[@name='description'])[1]")
	WebElement Description;

	public WebElement Description1() {
		return Description;
	}
	
	@FindBy(xpath = "(//textarea[@name='description'])[2]")
	WebElement Description2;

	public WebElement Description2() {
		return Description2;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement SaveEditLog;

	public WebElement SaveEditLog() {
		return SaveEditLog;
	}
	
//.................................Delete Log...................................................//	
	
	
	
	@FindBy(xpath = "(//i[@class='pi pi-trash'])[1]")
	WebElement DeleteLog1;

	public WebElement DeleteLog1() {
		return DeleteLog1;
	}
	
	
	@FindBy(xpath = "(//i[@class='pi pi-trash'])[2]")
	WebElement DeleteLog2;

	public WebElement DeleteLog2() {
		return DeleteLog2;
	}
	
	@FindBy(xpath = "(//i[@class='pi pi-trash'])[3]")
	WebElement DeleteLog3;

	public WebElement DeleteLog3() {
		return DeleteLog3;
	}
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Yes'])[1]")
	WebElement DeleteYes;

	public WebElement DeleteYes() {
		return DeleteYes;
	}
	

	//............................. stage Changed ..............................................//
	
	
	@FindBy(xpath = "(//div[@class='step handPointer ng-star-inserted'])[1]")
	WebElement FirstStage;

	public WebElement FirstStage() {
		return FirstStage;
	}
	
	
	
	@FindBy(xpath = "(//div[@class='step handPointer ng-star-inserted'])[2]")
	WebElement SecondStage;

	public WebElement SecondStage() {
		return SecondStage;
	}
	

	
	@FindBy(xpath = "(//div[@class='step handPointer ng-star-inserted'])[3]")
	WebElement CustomStage;

	public WebElement CustomStage() {
		return CustomStage;
	}
	
	@FindBy(xpath = "(//div[@class='step handPointer ng-star-inserted'])[4]")
	WebElement ClosedStage;

	public WebElement ClosedStage() {
		return ClosedStage;
	}
	
	
	
	@FindBy(xpath = "(//p-dropdown[@id='resolvedUnresolvedStage'])[1]")
	WebElement ClosedStageReason;

	public WebElement ClosedStageReason() {
		return ClosedStageReason;
	}
	
	
	@FindBy(xpath = "(//p-multiselect[@id='closeWonQualifiedReasons'])[1]")
	WebElement WonReason;

	public WebElement CloseWonReason() {
		return WonReason;
	}
	
	
	@FindBy(xpath = "(//input[@placeholder='mm/dd/yyyy'])[1]")
	WebElement ClosedWonDate;

	public WebElement ClosedWonDate() {
		return ClosedWonDate;
	}
	
	@FindBy(xpath = "//textarea[@name=\"comment\"]")
	WebElement commentBox;

	public WebElement setComment() {
		return commentBox;
	}
	
	
    
    //....................Click On Icons & Add Favorite .................................................//
    
	
	@FindBy(xpath = "(//i[contains(@class,'pi pi-star ng-star-inserted')])[1]")
	WebElement Favorite;

	public WebElement Favorite1() {
		return Favorite;
	}
	
	
	@FindBy(xpath = "(//i[contains(@class,'pi pi-star ng-star-inserted')])[2]")
	WebElement Favorite2;

	public WebElement Favorite2() {
		return Favorite2;
	}
	
	

	@FindBy(xpath = "(//i[contains(@class,'pi pi-star ng-star-inserted')])[3]")
	WebElement Favorite3;

	public WebElement Favorite3() {
		return Favorite3;
	}
	
	
    
	@FindBy(xpath = "(//span[contains(@class,'pi pi-envelope ng-star-inserted')])[1]")
	WebElement LogIcon1;

	public WebElement LogIcon1() {
		return LogIcon1;
	}
	
	@FindBy(xpath = "(//span[contains(@class,'pi pi-envelope ng-star-inserted')])[2]")
	WebElement LogIcon2;

	public WebElement LogIcon2() {
		return LogIcon2;
	}
	
	@FindBy(xpath = "//span[contains(@class, 'pi-map-marker')]")
	WebElement LogIcon3;

	public WebElement LogIcon3() {
		return LogIcon3;
	}
	
	@FindBy(xpath = "(//img[@class='ng-star-inserted'])[1]")
	WebElement LogIcon4;

	public WebElement LogIcon4() {
		return LogIcon4;
	} 
	
	
	@FindBy(xpath = "(//img[@class='ng-star-inserted'])[2]")
	WebElement LogIcon5;

	public WebElement LogIcon5() {
		return LogIcon5;
	} 
	
	
	@FindBy(xpath = "(//span[contains(@class, 'pi-user-edit')])[1]")
	WebElement LogIcon6;

	public WebElement LogIcon6() {
		return LogIcon6;
	} 
	
	//.....................All Activity List................................................//
	
	
		@FindBy(xpath = "//span[@ptooltip='All Activity List']")
		WebElement AllActivityList;

		public WebElement AllActivityList() {
			return AllActivityList;
		}
		
		
		
		@FindBy(xpath = "(//p-dropdown[@placeholder='Select Activity'])[1]")
		WebElement SelectActivityFilter;

		public WebElement SelectActivityFilter() {
			return SelectActivityFilter;
		}
		
		
		//............................All Activity List Filter.......................................................//
		
		
		@FindBy(xpath = "(//span[@class='p-button-icon pi pi-filter'])[1]")
		WebElement FilterClick;

		public WebElement FilterClick() {
			return FilterClick;
		}
		
		
		
		

		@FindBy(xpath = "(//p-dropdown[@placeholder='Select Field'])[1]")
		WebElement Filter;

		public WebElement Filter() {
			return Filter;
		}
		

		@FindBy(xpath = "(//p-dropdown[@placeholder='Select Operator'])[1]")
		WebElement Operator;

		public WebElement Operator() {
			return Operator;
		}
		

		@FindBy(xpath = "(//input[@placeholder='Enter Value'])[1]")
		WebElement Value;

		public WebElement Value() {
			return Value;
		}
		
		@FindBy(xpath = "(//p-multiselect[@placeholder='Select Items'])[1]")
		WebElement Value2;

		public WebElement Value2() {
			return Value2;
		}
		
		@FindBy(xpath = "//span[text()='Add Filter']")
		WebElement AddFilter;

		public WebElement AddFilter() {
			return AddFilter;
		}
		
		@FindBy(xpath = "(//span[normalize-space()='Apply'])[1]")
		WebElement Apply;

		public WebElement Apply() {
			return Apply;
		}
		
		@FindBy(xpath = "(//span[normalize-space()='Reset'])[1]")
		WebElement Reset;

		public WebElement Reset() {
			return Reset;
		}
		
		//............................All Activity List Group By.......................................................//
		
		
		@FindBy(xpath = "//button[@ptooltip='Group by']")
		WebElement GroupBybtnClick;

		public WebElement GroupBybtnClick() {
			return GroupBybtnClick;
		}


		
		@FindBy(xpath = "(//p-dropdown[@placeholder='Select Field'])[1]")
		WebElement GroupBy;

		public WebElement GroupBy() {
			return GroupBy;
		}
		
		
		//......................................Tab Filter.......................................................//
		
		@FindBy(xpath = "//span[@ptooltip='Filter']")
		WebElement TabFilter;

		public WebElement TabFilter() {
			return TabFilter;
		}
		
		@FindBy(xpath = "(//span[normalize-space()='All Activity'])[1]")
		WebElement AllActivity;

		public WebElement AllActivity() {
			return AllActivity;
		}
		
		
		@FindBy(xpath = "(//span[normalize-space()='User Activity'])[1]")
		WebElement UserActivity;

		public WebElement UserActivity() {
			return UserActivity;
		}
		
		@FindBy(xpath = "(//span[normalize-space()='System Activity'])[1]")
		WebElement SystemActivity;

		public WebElement SystemActivity() {
			return SystemActivity;
		}
		
		
		@FindBy(xpath = "(//span[normalize-space()='Favorite'])[1]")
		WebElement Fav;

		public WebElement Fav() {
			return Fav;
		}
		
	//.............................Column Setting.....................................................//
		
		@FindBy(xpath = "(//span[normalize-space()='Settings'])[1]")
		WebElement Setting;

		public WebElement Setting() {
			return Setting;
		}	
		
		
		
		@FindBy(xpath = "(//input[@placeholder='Search for fields'])[1]")
		WebElement SearchFeilds;

		public WebElement SearchFeilds() {
			return SearchFeilds;
		}

		
		
		@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
		WebElement SaveColumnSetting;

		public WebElement SaveColumnSetting() {
			return SaveColumnSetting;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    
}
