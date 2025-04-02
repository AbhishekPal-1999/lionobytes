package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class FSMterritoryPage extends Baseclass {

	WebDriver ldriver;

	public FSMterritoryPage(WebDriver rdriver) {
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	public void waitUntilPageLoad() throws InterruptedException {
//		int maxWaitingTime = 40;
//		Thread.sleep(600); 
//		float time=1;
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//	    while (time<maxWaitingTime) {
//			WebElement LoaderIcon = null;
//			try {
//				LoaderIcon = driver.findElement(By.xpath("//div[@class=\"splash-loader\"]"));
//
//			} catch (Exception e) {
//				System.out.println("Now Page loaded fully !....");
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//				break; 
//			}
//
//			if (LoaderIcon!=null) {
//
//				Thread.sleep(500); 
//				time=(float) (time+.5);
//				System.out.println("page loader icon is occuring till: "+time +"Seconds");
//			} 
//			else {
//				break;
//			}
//		    
//		}
		
	  }
	
	@FindBy(xpath="//span[contains(text(),'FSM')]")
	WebElement btnFSM;

	public WebElement clickFSM() {
		return btnFSM;
	}
	
	@FindBy(xpath="//span[contains(text(),'Territory')]")
	WebElement drpTerritory;

	public WebElement selectTerritory() {
		return drpTerritory;
	}
	
	@FindBy(xpath="(//span[@class='p-button-label'])[3]//preceding-sibling::span")
	WebElement btnUSA;

	public WebElement clickUSA() {
		return btnUSA;
		}
	
	@FindBy(xpath="//td[text()=' India ']//button//span")
	WebElement btnIndia ;

	public WebElement clickIndia() {
		return btnIndia;
		}
	
	@FindBy(xpath="(//tr)[4]")
	WebElement territory;

	public WebElement listedTerritory() {
		return territory;
		}
	
	@FindBy(xpath="//span[text()='View']")
	WebElement btnView;

	public WebElement clickView() {
		return btnView;
		}
	
	@FindBy(xpath="//span[text()='View Territory']")
	WebElement header;

	public WebElement ViewHeader() {
		return header;
		}
	
	@FindBy(xpath="//span[text()='Edit']")
	WebElement btnEdit;

	public WebElement clickEdit() {
		return btnEdit;
		}
	
	@FindBy(xpath="//span[text()='No']//parent::button")
	WebElement btnruleNo;

	public WebElement clickNo() {
		return btnruleNo;
		}
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement btnSave;

	public WebElement ClickSave() {
		return btnSave;
		}
	
	@FindBy(xpath="//span[text()='Delete']")
	WebElement btnDelete;

	public WebElement clickDelete() {
		return btnDelete;
		}
	
	@FindBy(xpath="//span[text()='Yes']")
	WebElement btnYes;

	public WebElement clickYes() {
		return btnYes;
		}

	@FindBy(xpath="//td[text()=' India ']//parent::tr//following-sibling::tr[1]//td[1]")
	WebElement territoryName;

	public WebElement getTerritoryName() {
		return territoryName;
		}
	
	@FindBy(xpath="//span[text()='New']")
	WebElement btnNew;

	public WebElement clickNewButton() {
		return btnNew;
		}
	
	@FindBy(xpath="//input[@placeholder=\"Enter Territory\"]")
	WebElement txtTerritoryName;

	public WebElement setTerritoryName() {
		return txtTerritoryName;
		}
	

	@FindBy(xpath="//p-dropdown[@placeholder=\"Select a user\"]")
	WebElement drpTerritoryContact;

	public WebElement selectTerritoryContact() {
		return drpTerritoryContact;
		}
	
	@FindBy(xpath="//p-multiselect[@name='selectedSUsers']")
	WebElement drpselectedUsers;

	public WebElement selectOtherContacts() {
		return drpselectedUsers;
		}
	
	@FindBy(xpath="//p-dropdown[@id='objectTypes']")
	WebElement drpobjectTypes;

	public WebElement selectAssocitedModule() {
		return drpobjectTypes;
		}
	
	@FindBy(xpath="//p-dropdown[@id='allTemplateTypes']")
	WebElement drpallTemplateTypes;

	public WebElement selectTemplate() {
		return drpallTemplateTypes;
		}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Country']")
	WebElement drpCountry;

	public WebElement selectCountry() {
		return drpCountry;
		}
	@FindBy(xpath="//p-dropdown[@placeholder='Select Sub Territory']")
	WebElement drpSubTerritory;

	public WebElement selectParentTerritory() {
		return drpSubTerritory;
		}
	
	@FindBy(xpath="//p-button[@class='p-element ng-star-inserted']//span[1]")
	WebElement btnPlusIcon;

	public WebElement clickPlusIcon() {
		return btnPlusIcon;
		}
	

	@FindBy(xpath="//h5[text()=' Territory Rules ']//div//i")
	WebElement btnPlusIcon2;

	public WebElement clickPlusIcon2() {
		return btnPlusIcon2;
		}
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement txtNotes;

	public WebElement setNotes() {
		return txtNotes;
		}
	
	@FindBy(xpath="//p-dropdown[@id='ruleFilter']")
	WebElement drpruleFilter;

	public WebElement selectMiddleInitial() {
		return drpruleFilter;
		}
	
	@FindBy(xpath="//p-multiselect[@placeholder='Choose Value(s)']")
	WebElement ChooseValue;

	public WebElement selectChooseValue() {
		return ChooseValue;
		}
	
	@FindBy(xpath="(//p-dropdown[@id='ruleFilter'])[2]")
	WebElement drpruleFilter2;

	public WebElement selectMiddleInitial2() {
		return drpruleFilter2;
		}
	
	@FindBy(xpath="(//p-multiselect[@placeholder='Choose Value(s)'])[2]")
	WebElement ChooseValue2;

	public WebElement selectChooseValue2() {
		return ChooseValue2;
		}
	
	@FindBy(xpath="(//p-dropdown[@id='ruleFilter'])[3]")
	WebElement drpruleFilter3;

	public WebElement selectMiddleInitial3() {
		return drpruleFilter3;
		}
	
	@FindBy(xpath="(//p-multiselect[@placeholder='Choose Value(s)'])[3]")
	WebElement ChooseValue3;

	public WebElement selectChooseValue3() {
		return ChooseValue3;
		}
	@FindBy(xpath="(//button[@label='Save'])[2]")
	WebElement BtnSave;

	public WebElement clickSaveRule() {
		return BtnSave;
		}
	
	@FindBy(xpath="(//button[@label='Save'])[1]")
	WebElement bttnSave;

	public WebElement clickSaveTerritory() {
		return bttnSave;
		}

	@FindBy(xpath="(//span[@class='p-inputswitch-slider'])[1]")
	WebElement btnToggle;

	public WebElement clickToggleBtn() {
		return btnToggle;
		}
	
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement btnGlobalSearch;

	public WebElement setGlobalSearch() {
		return btnGlobalSearch;
		}
	
	@FindBy(xpath="//tbody/tr[1]//td[1]")
	WebElement firstListedTerritory;

	public WebElement ListedTerritory() {
		return firstListedTerritory;
		}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select a user']//div//div[@aria-label='dropdown trigger']")
	WebElement TerritoryContact;

	public WebElement TerritoryContact() {
		return TerritoryContact;
		}
	
	
	
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement btnCancel;

	public WebElement clickCancel() {
		return btnCancel;
	}
	

	@FindBy(xpath = "//p-togglebutton")
	WebElement toggle;

	public WebElement ToggleButoon() {
		return toggle;
	}
	
	@FindBy(xpath = "//p-dropdown//span[text()='Is']")
	WebElement drpChhooseOperator;

	public WebElement ChooseOperator() {
		return drpChhooseOperator;
	}
	
	@FindBy(xpath = "(//p-dropdown//span[text()='Is'])[2]")
	WebElement drpChhooseOperator2;

	public WebElement ChooseOperator2() {
		return drpChhooseOperator2;
	}
	
	@FindBy(xpath = "(//p-dropdown//span[text()='Is'])[3]")
	WebElement drpChhooseOperator3;

	public WebElement ChooseOperator3() {
		return drpChhooseOperator3;
	}
	
	@FindBy(xpath = "//span[text()='Manually']")
	WebElement btnMannualy;

	public WebElement ClickbtnMannualy() {
		return btnMannualy;
	}
	
	@FindBy(xpath = "//span[text()='Assign']")
	WebElement btnAssign;

	public WebElement clickAssign() {
		return btnAssign;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Global Search'])[2]")
	WebElement GlobalSearch;

	public WebElement clickGlobalSearchInDataLists() {
		return GlobalSearch;
	}
	
	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[1]")
	WebElement ListedUserName;

	public WebElement listedUserName() {
		return ListedUserName;
	}
	
	@FindBy(xpath = "//button//span[text()='Setting']")
	WebElement btnSetting;

	public WebElement clickSetting() {
		return btnSetting;
	}
	
	@FindBy(xpath = "(//p-button[@label='Save'])")
	WebElement btnSaveSetting;

	public WebElement clickSaveSetting() {
		return btnSaveSetting;
	}
	
	@FindBy(xpath = "//liono-treeselect[@placeholder=\"Select Parent Territory\"]")
	WebElement drpParentTerritory;

	public WebElement SelectParentTerritory() {
		return drpParentTerritory;
	}
	
	@FindBy(xpath = "//p-dropdown//span[text()='AND']")
	WebElement drpLogic;

	public WebElement selectAndOr() {
		return drpLogic;
	}
	
	@FindBy(xpath = "(//p-dropdown//span[text()='AND'])[2]")
	WebElement drpLogic2;

	public WebElement selectAndOr2() {
		return drpLogic2;
	}
	
// TERRITORY NEW CHANGES========================================================================================
	
	@FindBy(xpath = "//span[text()='Root Territory']")
	WebElement btnRootTerritory;

	public WebElement clickRootTerritory() {
		return btnRootTerritory;
	}
	
	@FindBy(xpath = "//p-dropdown[@formcontrolname=\"countryName\"]")
	WebElement drpSelectCountry;

	public WebElement SelectRootCountry() {
		return drpSelectCountry;
	}
	
	
	@FindBy(xpath = "//input[@placeholder=\"Enter Territory\"]")
	WebElement txtsTerritoryName ;

	public WebElement TerritoryName() {
		return txtsTerritoryName;
	}
	
	@FindBy(xpath = "//input[@formcontrolname=\"territoryName\"]")
	WebElement txtsRootTerritoryName ;

	public WebElement RootTerritoryName() {
		return txtsRootTerritoryName;
	}
	
	@FindBy(xpath = "//span[@class=\"p-inputswitch-slider\"]")
	WebElement activeInactiveSlider ;

	public WebElement clickActiveInactiveSlider() {
		return activeInactiveSlider;
	}
	
	@FindBy(xpath = "//span[text()='Expand All']")
	WebElement btnExpandAll;

	public WebElement ClickExpandAll() {
		return btnExpandAll;
	}
	
	@FindBy(xpath = "//span[text()='Collapse All']")
	WebElement btnCollapseAll;

	public WebElement clickCollapseAll() {
		return btnCollapseAll;
	}
	
	@FindBy(xpath = "//tr[2]//td[1]")
	WebElement ListedRootTerritory;

	public WebElement ListedRootTerritory() {
		return ListedRootTerritory;
	}
	
	@FindBy(xpath = "//tr[2]//td[1]")
	WebElement ListedRootTerritory1;

	public WebElement ListedRootTerritory1() {
		return ListedRootTerritory1;
	}
	
	@FindBy(xpath = "//tr[3]//td[1]")
	WebElement ListedRootTerritory3;

	public WebElement ListedRootTerritory3() {
		return ListedRootTerritory3;
	}
	@FindBy(xpath = "//tr[4]//td[1]")
	WebElement ListedRootTerritory2;

	public WebElement ListedRootTerritory2() {
		return ListedRootTerritory2;
	}
	
	@FindBy(xpath = "//tr[2]//span[@ptooltip=\"Add\"]")
	WebElement btnAddNewTerritory;

	public WebElement AddNewTerritory() {
		return btnAddNewTerritory;
	}
	
	@FindBy(xpath = "//tr[3]//span[@ptooltip=\"Edit\"]")
	WebElement btnEditSubTerritory;

	public WebElement EditSubTerritory() {
		return btnEditSubTerritory;
	}
	
	@FindBy(xpath = "//tr[3]//span[@ptooltip=\"Delete\"]")
	WebElement btnDeleteSubTerritory;

	public WebElement DeleteSubTerritory() {
		return btnDeleteSubTerritory;
	}

	@FindBy(xpath = "//input[@id=\"territoryName\"]")
	WebElement txtSubTerritory;

	public WebElement setSubTerritory() {
		return txtSubTerritory;
	}
	
	@FindBy(xpath = "//p-dropdown[@placeholder=\"Associated with\"]")
	WebElement drpModule;

	public WebElement SelectModule() {
		return drpModule;
	}
	
	@FindBy(xpath = "//p-dropdown[@name=\"primaryUser\"]")
	WebElement drpPrimaryUser;

	public WebElement SelectPrimaryUser() {
		return drpPrimaryUser;
	}
	
	
	@FindBy(xpath = "//p-multiselect[@name=\"selectedSUsers\"]")
	WebElement drpOtherUser;

	public WebElement SelectOtherUser() {
		return drpOtherUser;
	}
	
	@FindBy(xpath = "//p-treetabletoggler//i")
	WebElement OpenCompnyMenu;

	public WebElement openCompnyMenu() {
		return OpenCompnyMenu;
	}
	
	@FindBy(xpath = "//tr[3]//td[1]")
	WebElement ListedSubTerritory;

	public WebElement ListedSubTerritory() {
		return ListedSubTerritory;
	}
	
	@FindBy(xpath = "//tr[3]//td[4]")
	WebElement ListedCounts;

	public WebElement ListedCounts() {
		return ListedCounts;
	}
	
	@FindBy(xpath = "(//strong[text()='Counts']//parent::div//following-sibling::span//span)[1]")
	WebElement Counts;

	public WebElement Counts() {
		return Counts;
	}
	
	@FindBy(xpath = "(//span[@class=\"btnBars p-mr-0\"]//i[@class=\"pi pi-pencil\"])[1]")
	WebElement btnEditRule;

	public WebElement EditRule() {
		return btnEditRule;
	}
	
}



	
