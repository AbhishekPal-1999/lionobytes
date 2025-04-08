package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	WebDriver ldriver;

	public ContactsPage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Contacts']")
	WebElement ClickContacts;

	public WebElement ClickContacts() {

		return ClickContacts;
	}
	@FindBy(xpath="//span[text()='New']")
	WebElement newbtn;
	
	public WebElement clicknewbtn() {
		return newbtn;
	}
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement emailadress;
	
	public WebElement Email() {
		return emailadress;
		
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder='Select Contact Types ...'])[1]")
	WebElement contacttype;
	
	public WebElement ContactType() {
		return contacttype;
	}
	@FindBy(xpath="//p-dropdown[@placeholder='Contact Association']")
	WebElement contactAssociation;
	
	public WebElement ContactA() {
		return contactAssociation;
}
	

	@FindBy(xpath="(//input[@placeholder='Search Association Name'])[1]")
	WebElement associationname;
	
	public WebElement Associationname() {
		return associationname;
}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Title']")
	WebElement Title;
	
	public WebElement title() {
		return Title;
	
}
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstname;
	
	public WebElement Fname() {
		return firstname;
	
}
	@FindBy(xpath="//input[@name='middleName']")
	WebElement middletname;
	
	public WebElement Mname() {
		return middletname;	
}
	@FindBy(xpath="//input[@name='lastName']")
	WebElement Lastname;
	
	public WebElement Lname() {
		return Lastname;	
}
	
	@FindBy(xpath="(//input[@pattern='[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$'])[2]")
	WebElement Email;
	
	public WebElement Email1() {
		return Email;	
}
	@FindBy(xpath="//input[@id='phone0']")
	WebElement phone;
	
	public WebElement WorkPhone() {
		return phone;	
}
	@FindBy(xpath="//div[@class='p-text-right']//button[@type='button']")
	WebElement showmore;
	
	public WebElement ShowM() {
		return showmore;	
}
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Gender ...\"]")
	WebElement Gender;
	
	public WebElement gender() {
		return Gender;	
	}
	@FindBy(xpath="//input[@id='department']")
	WebElement Department;
	
	public WebElement Dept() {
		return Department;	
}
	@FindBy(xpath="(//input[@placeholder=\"mm/dd/yy\"])[1]")
	WebElement DOB;
	
	public WebElement Dob() {
		return DOB;		
	}	
	@FindBy(xpath="//p-multiselect[@placeholder='Select Language ...']")
	WebElement LangSpoken;
	
	public WebElement LangSp() {
		return LangSpoken;	
}
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yy'])[2]")
	WebElement startdate;
	
	public WebElement StartDate() {
		return startdate;	
}
	@FindBy(xpath="//p-multiselect[@placeholder='Select Job Function ...']")
	WebElement jobfunction;
	
	public WebElement JobF() {
		return jobfunction;	
		
}
	@FindBy(xpath="//p-dropdown[@placeholder='Select Relationship Status ...']")
	WebElement Relationshipsatus;
	
	public WebElement RelationshipS() {
		return Relationshipsatus;	
	}
	@FindBy(xpath="//p-dropdown[@placeholder='Select Marital Status ...']")
	WebElement Maritalsatus;
	
	public WebElement MaritalS() {
		return Maritalsatus;	
}
	@FindBy(xpath="//p-dropdown[@placeholder='Select Source of Contact ...']")
	WebElement sourceofcontact;
	
	public WebElement sourceofcontact() {
		return sourceofcontact;
}
	@FindBy(xpath="//p-dropdown[@placeholder='Select Annual Income ...']")
	WebElement AnnualIncome;
	
	public WebElement AnnualI() {
		return AnnualIncome;
	}	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Degree ...']")
	WebElement degree;
	
	public WebElement Degree() {
		return degree;
}
	@FindBy(xpath="//p-dropdown[@placeholder='Select Field of Study ...']")
	WebElement FieldOfStudy;
	
	public WebElement FieldOfStudy() {
		return FieldOfStudy;
}
	@FindBy(xpath="//input[@id='reportsTo']")
	WebElement seniority;
	
	public WebElement SeniorityS() {
		return seniority;
}
	@FindBy(xpath="/html/body/app-root/app-main/div/div/div/app-contacts/app-add-edit-contact-modal/p-dialog/div/div/div[2]/form/div[2]/div[11]/div[2]/input")
	WebElement ReportsTo;
	
	public WebElement ReportT() {
		return ReportsTo;
}
	@FindBy(xpath="//input[@id='assistantTo']")
	WebElement Assistant;
	
	public WebElement AssistantA() {
		return Assistant;
}
	@FindBy(xpath="//input[@name='assitphone']")
	WebElement Assiphone;
	
	public WebElement AssiP() {
		return Assiphone;
}
	@FindBy(xpath="//textarea[@name='description']")
	WebElement Notes;
	
	public WebElement Notes() {
		return Notes;
}
	
	///..........................Address Details.........................//
	
	
	@FindBy(xpath="//i[@class='pi pi-plus']")
	WebElement AdressIcon;
	
	public WebElement AdressIcon() {
		return AdressIcon;
}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Address Type']")
	WebElement AdressType;
	
	public WebElement AdressType() {
		return AdressType;
}

	@FindBy(xpath="//p-dropdown[@placeholder='Select Address Class']")
	WebElement Adressclass;
	
	public WebElement Adressclass() {
		return Adressclass;
}
	
	@FindBy(xpath="//input[@placeholder='Enter a location']")
	WebElement StreetAdress1;
	
	public WebElement StreetAdress1() {
		return StreetAdress1;
}
	
	@FindBy(xpath="//input[@name='streetAddress2']")
	WebElement StreetAdress2;
	
	public WebElement StreetAdress2() {
		return StreetAdress2;
}
	
	@FindBy(xpath="(//span[text()='Save'])[1]")
	WebElement Save;
	
	public WebElement SaveInf() {
		return Save;
}
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement SaveInfAll;
	
	public WebElement SaveInfAll() {
		return SaveInfAll;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//...........................Contact View................................//
	
	@FindBy(xpath = "//span[text()='Contacts']")
	WebElement Contactbtn;

	public WebElement clickcontact() {
		return Contactbtn;
}
	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[1]")
	WebElement clickbtn;

	public WebElement Clickonbtn() {
		return clickbtn;
	
}
	@FindBy(xpath = "//div[@class='btnBars']//i[@class='pi pi-bars']")
	WebElement clickoptionbtn;

	public WebElement ClickOptionbtn() {
		return clickoptionbtn;
}
	@FindBy(xpath = "//span[text()='View']")
	WebElement viewbtn;

	public WebElement ViewBtn() {
		return viewbtn;
}
	@FindBy(xpath = "//span[text()='View Contact']")
	WebElement viewbtnDis;

	public WebElement ViewBtnDisplayed() {
		return viewbtnDis;
}
	
//......................ContactEdit............................//
	
	@FindBy(xpath = "//span[text()='Contacts']")
	WebElement clickcontactsbutton;

	public WebElement Editcontactbtn() {
		return clickcontactsbutton;
	
}
	@FindBy(xpath = "//div[@class='ng-star-inserted'][normalize-space()='Amol Baji manasa']")
	WebElement Editcontactnameclick;

	public WebElement Editcontactna() {
		return Editcontactnameclick;
}
	@FindBy(xpath = "//div[@class='btnBars']//i[@class='pi pi-bars']")
	WebElement Editclickbtn;

	public WebElement Editclickbtn() {
		return Editclickbtn;
}
	@FindBy(xpath = "//span[text()='Edit']")
	WebElement ClickEditbutton;

	public WebElement ClickEditbutton() {
		return ClickEditbutton;
}

	@FindBy(xpath = "//input[@name='email']")
	WebElement Emailclearedit;

	public WebElement EmailClear() {
		return Emailclearedit;
}
	@FindBy(xpath = "//button[@class='p-element p-button-success p-button p-component']")
	WebElement Savebtn;

	public WebElement SaveChanges() {
		return Savebtn;
}
	
	@FindBy(xpath = "//td[@class='ng-star-inserted'][1]")
	WebElement Listedcontactname;

	public WebElement Listedname() {
		return Listedcontactname;
	}
	
	//....................DeleteContact...............................//
	
	@FindBy(xpath = "//span[text()='Contacts']")
	WebElement deletecontactclick;

	public WebElement DeleteCcontact() {
		return deletecontactclick;
	
}
	@FindBy(xpath = "//div[@class='ng-star-inserted'][normalize-space()='Amol Baji manasa']")
	WebElement deletenameclick;

	public WebElement DeleteNameClick() {
		return deletenameclick;
}
	@FindBy(xpath = "//div[@class='btnBars']//i[@class='pi pi-bars']")
	WebElement deleteiconbutton;

	public WebElement Deleteicon() {
		return deleteiconbutton;
}
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement clickondeletebutton;

	public WebElement ClickOnDeleteButton() {
		return clickondeletebutton;
}
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement Confirmationdelete;

	public WebElement ConfirmDelete() {
		return Confirmationdelete;
}
	@FindBy(xpath = "//td[@class='ng-star-inserted'][1]")
	WebElement Listeddeletecontactname;

	public WebElement ListedDleteContact() {
		return Listeddeletecontactname;
	}
	
//.......................................InactiveContact..........................................................//
	
	@FindBy(xpath = "//span[text()='Contacts']")
	WebElement Inactivecontactclick;

	public WebElement Inactive01() {
		return deletecontactclick;
	
}

	@FindBy(xpath = "//span[text()='Inactive Contact']")
	WebElement Inactiveoptionbtn;

	public WebElement Inactive04() {
		return Inactiveoptionbtn;	
	
	}
	
	@FindBy(xpath = "//p-multiselect[@id='inActivatingReason']")
	WebElement InactiveReason;

	public WebElement Inactive05() {
		return InactiveReason;

}
	@FindBy(xpath = "//textarea[@id='comment']")
	WebElement InactiveComments;

	public WebElement Inactive07() {
		return InactiveComments;
	}
	@FindBy(xpath = "//span[text()='Save']")
	WebElement InactiveSavebtn;

	public WebElement Inactive08() {
		return InactiveSavebtn;
}
	///............Verify Global Search..................///
	
	@FindBy(xpath = "//input[@placeholder='Global Search']")
	WebElement VerifySearchContact;

	public WebElement VerifySearchContact() {
	return VerifySearchContact;
			
      }	
	

	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement btnSearch;

	public WebElement Search() {
		return btnSearch;
		}
	
	
	@FindBy(xpath="//tbody//tr[1]//td[2]")
	WebElement listedContacts;

	public WebElement listedContacts() {
		return listedContacts;
		}
	
	
	@FindBy(xpath = "//span[contains(text(),'View Contact')]")
	WebElement txtViewLeadHeader;

	public WebElement ViewLeadHeader() {
		return txtViewLeadHeader;
	}
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement btnCancel;

	public WebElement clickCancel() {
		return btnCancel;
	}
	
	@FindBy(xpath = "//input[@id=\"email1\"]")
	WebElement txtHomeEmail;

	public WebElement HomeEmail() {
		return txtHomeEmail;
	}
	
	
	
	@FindBy(xpath = "//input[@id=\"email2\"]")
	WebElement txtCE1;

	public WebElement CE1() {
		return txtCE1;
	}
	
	@FindBy(xpath = "//input[@id=\"email3\"]")
	WebElement txtCE2;

	public WebElement CE2() {
		return txtCE2;
	}
	
	
	@FindBy(xpath = "//input[@id=\"phone1\"]")
	WebElement txtMobilePhone;

	public WebElement MobilePhone() {	
		return txtMobilePhone;
	}
	
	@FindBy(xpath = "//input[@id=\"phone2\"]")
	WebElement txtHomePhone;

	public WebElement HomePhone() {	
		return txtHomePhone;
	}
	
	@FindBy(xpath = "//input[@id=\"phone3\"]")
	WebElement txtCp1;

	public WebElement CP1() {	
		return txtCp1;
	}
	@FindBy(xpath = "//input[@id=\"phone4\"]")
	WebElement txtCP2;

	public WebElement CP2() {	
		return txtCP2;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Show More']")
	WebElement btnShowMore;

	public WebElement ShowMore() {	
		return btnShowMore;
	}
	
	@FindBy(xpath = "//p-checkbox//div")
	WebElement clickCheckbox;

	public WebElement clickCheckbox() {	
		return clickCheckbox;
	}
	
	@FindBy(xpath = "//p-inputswitch//div")
	WebElement ActiveAddress;

	public WebElement ActiveAddress() {	
		return ActiveAddress;
	}
  }
