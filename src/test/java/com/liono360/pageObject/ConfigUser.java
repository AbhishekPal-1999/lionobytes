package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigUser {

	WebDriver ldriver;

	public ConfigUser(WebDriver rdriver) {
		ldriver = rdriver;
		//DynamicWait(ldriver);
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[text()='Configurations']")
	WebElement Clickconfig;

	public WebElement Clickconfig() {
		return Clickconfig;
	}
	
	@FindBy(xpath="//span[text()='User']")
	WebElement User1;

	public WebElement User1() {
		return User1;
	}
	

	@FindBy(xpath="(//span[text()='User'])[2]")
	WebElement User2;

	public WebElement User2() {
		return User2;
	}
	
	@FindBy(xpath="(//span[@class='btnBars p-mr-0 ng-star-inserted']//parent::*)[2]")
	WebElement Humbergicon;

	public WebElement Humbergicon() {
		return Humbergicon;
	}
	
	
	
	@FindBy(xpath="(//span[text()='User'])[3]")
	WebElement AddUser;

	public WebElement AddUser() {
		return AddUser;
	}
	
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement Firstname1;

	public WebElement Firstname1() {
		return Firstname1;
	}
	
	
	@FindBy(xpath="//input[@name='middleName']")
	WebElement middlename;

	public WebElement middlename() {
		return middlename;
	}
	
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement Lastname;

	public WebElement Lastname() {
		return Lastname;
	}
	
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement Phone1;

	public WebElement Phone1() {
		return Phone1;
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Role Hierarchy']")
	WebElement ClickRolehirechy;

	public WebElement ClickRolehirechy() {
		return ClickRolehirechy;
	}
	
	
	@FindBy(xpath="//i[@class='pi pi-fw pi-chevron-right']")
	WebElement Clickexpandall;

	public WebElement Clickexpandall() {
		return Clickexpandall;
	}
	
	
	@FindBy(xpath="//td[normalize-space()='3']")
	WebElement ClickOnAssociatedUser;

	public WebElement ClickOnAssociatedUser() {
		return ClickOnAssociatedUser;
	}
	
	
	
	
	@FindBy(xpath="//input[@name='email']")
	WebElement Emailadress;

	public WebElement Emailadress() {
		return Emailadress;
	}
	
	@FindBy(xpath="//div[text()=' Select Role ']")
	WebElement Role;

	public WebElement Role() {
		return Role;
	}
	
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement Firstname;

	public WebElement Firstname() {
		return Firstname;
	}
	
	@FindBy(xpath="//input[@name='middleName']")
	WebElement MiddleName;

	public WebElement MiddleName() {
		return MiddleName;
	}
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement LastName;

	public WebElement LastName() {
		return LastName;
	}
	@FindBy(xpath="//span[text()='Show More']")
	WebElement Showmore;

	public WebElement Showmore() {
		return Showmore;
	}
	
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement Phone;

	public WebElement Phone() {
		return Phone;
	}
	
	@FindBy(xpath="//input[@name='selectedSocialProfile']")
	WebElement SocialProfile;

	public WebElement SocialProfile() {
		return SocialProfile;
	}
	
	@FindBy(xpath="//span[text()='Select Gender']")
	WebElement Gender;

	public WebElement Gender() {
		return Gender;
	}
	
	@FindBy(xpath="//span[text()='Select a job type']")
	WebElement Jobtype;

	public WebElement Jobtype() {
		return Jobtype;
	}
	
	@FindBy(xpath="//span[text()='Select a job type']")
	WebElement Profile;

	public WebElement JobTypeS() {
		return Profile;
	}
	
	@FindBy(xpath="//span[text()='select location']")
	WebElement WorkingLocation;

	public WebElement WorkingLocation() {
		return WorkingLocation;
	}
	
	@FindBy(xpath="//span[text()='Select Department']")
	WebElement Department;

	public WebElement Department() {
		return Department;
	}
	
	
	@FindBy(xpath="//input[@name='dob']")
	WebElement DOB;

	public WebElement DOB() {
		return DOB;
	}
	
	
	@FindBy(xpath="//div[text()='Select Languages']")
	WebElement SpoekanLanug;

	public WebElement SpoekanLanug() {
		return SpoekanLanug;
	}
	

	@FindBy(xpath="//div[text()='Afrikaans 1, Albanian, Arabic']")
	WebElement Onlyclick;

	public WebElement Onlyclick() {
		return Onlyclick;
	}
	
	@FindBy(xpath="(//p-calendar[@name='joiningDate'])[1]")
	WebElement StartDate;

	public WebElement StartDate() {
		return StartDate;
	}
	
	
	@FindBy(xpath="//input[@name='skills']")
	WebElement JobFun;

	public WebElement JobFun() {
		return JobFun;
	}
	
	
	@FindBy(xpath="//span[text()='Select Maritial Status']")
	WebElement MaritalStatus;

	public WebElement MaritalStatus() {
		return MaritalStatus;
	}
	
	
	@FindBy(xpath="//span[text()='Select Degree']")
	WebElement Degree;

	public WebElement Degree() {
		return Degree;
	}
	
	
	
	@FindBy(xpath="//span[text()='Select Annual Income']")
	WebElement AnnualIncome;

	public WebElement AnnualIncome() {
		return AnnualIncome;
	}
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//span[text()='Select Field Of Study']")
	WebElement FiledOfStudy;

	public WebElement FiledOfStudy() {
		return FiledOfStudy;
	}
	
	
	@FindBy(xpath="//input[@name='seniority']")
	WebElement Seniority;

	public WebElement Seniority() {
		return Seniority;
	}
	
	@FindBy(xpath="//div[text()='Select Report To']")
	WebElement Reportinguser;

	public WebElement Reportinguser() {
		return Reportinguser;
	}
	@FindBy(xpath="//div[text()='Mark Zuckerberg']")
	WebElement ClickM;

	public WebElement ClickM() {
		return ClickM;
	}
	//.....................Address Information................................//
	
	@FindBy(xpath="(//input[@placeholder='Enter a location'])[1]")
	WebElement StreetAddress1;

	public WebElement StreetAddress1() {
		return StreetAddress1;
	}
	
	
	@FindBy(xpath="(//input[@name='mstreat_address2'])[1]")
	WebElement StreetAddress2;

	public WebElement StreetAddress2() {
		return StreetAddress2;
	}
	
	@FindBy(xpath="(//span[text()='Select Country'])[1]")
	WebElement Country;

	public WebElement Country() {
		return Country;
	}
	
	@FindBy(xpath="(//span[text()='Select State'])[1]")
	WebElement State;

	public WebElement State() {
		return State;
	}
	
	@FindBy(xpath="(//span[text()='Select City'])[1]")
	WebElement City;

	public WebElement City() {
		return City;
	}	
	@FindBy(xpath="//input[@name='selectedMZipcode']")
	WebElement Zipcode;
	
	public WebElement Zipcode() {
		return Zipcode;
	}	
	//........................Permission...................................//
	
	
	@FindBy(xpath="//span[text()='Permission']")
	WebElement ClickPermission;
	
	public WebElement ClickPermission() {
		return ClickPermission;
	}	
	
	
	
	@FindBy(xpath="(//p-button[@class='p-element'])[1]//child::span[1]")
	WebElement Plusicon;
	
	public WebElement Plusicon() {
		return Plusicon;
	}	
	
	
	
	
	
	@FindBy(xpath="(//p-dropdown[@placeholder='Choose Channel'])[1]")
	WebElement ChannelName;
	
	public WebElement ChannelName() {
		return ChannelName;
	}	
	
	
	
	@FindBy(xpath="(//p-dropdown[@placeholder='Select a profile'])[1]")
	WebElement ProfileName;
	
	public WebElement ProfileName() {
		return ProfileName;
	}	
	
	
	
	//.......................Other Information..............................//
	
	
	@FindBy(xpath="//span[text()='Other']")
	WebElement Other;
	
	public WebElement Other() {
		return Other;
	}	
	
	
	
	
	
	@FindBy(xpath="(//p-dropdown[@name='timeZone'])[1]")
	WebElement TimeZone;
	
	public WebElement TimeZone() {
		return TimeZone;
	}	
	
	

	@FindBy(xpath="(//p-calendar[@name='trackingStartTime'])[1]")
	WebElement WorkingHstarttime;
	
	public WebElement WorkingHstarttime() {
		return WorkingHstarttime;
	}	
	
	

	@FindBy(xpath="(//p-calendar[@name='trackingEndTime'])[1]")
	WebElement WorkingHEndtime;
	
	public WebElement WorkingHEndtime() {
		return WorkingHEndtime;
	}	
	
	
	
	
	
	
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement Save;
	
	public WebElement Save() {
		return Save;
	}	
	
	//............Edit User..............................//
	
	@FindBy(xpath="(//span[@ptooltip='Edit'])[1]")
	WebElement ClickP;
	
	public WebElement ClickP() {
		return ClickP;
	}	
	
	
	//.............Delete User...................//
	
	
	@FindBy(xpath="(//span[@ptooltip='Delete'])[1]")
	WebElement ClickD;
	
	public WebElement ClickD() {
		return ClickD;
	}	
	
	@FindBy(xpath="//span[normalize-space()='Yes']")
	WebElement Yesb;
	
	public WebElement Yesb() {
		return Yesb;
	}	
	
	//.................Craeate Profile....................//
	
	
	
	@FindBy(xpath="(//span[text()='Profile'])[2]")
	WebElement ClickProfile;
	
	public WebElement ClickProfile() {
		return ClickProfile;
	}	
	
	@FindBy(xpath="(//span[text()='Profile'])[4]")
	WebElement ClickProfile2;
	
	public WebElement ClickProfile2() {
		return ClickProfile2;
	}	
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	WebElement Profilename;
	
	public WebElement Profilename() {
		return Profilename;
	}	
	
	
	
	
	
	@FindBy(xpath="//span[text()='Select a profile']")
	WebElement ProfileDrp;
	
	public WebElement ProfileDrp() {
		return ProfileDrp;
	}	
	
	
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement Description;
	
	public WebElement Description() {
		return Description;
	}	
	
	@FindBy(xpath="(//span[@ptooltip='Copy'])[1]")
	WebElement CopyProfile;
	
	public WebElement CopyProfile() {
		return CopyProfile;
	}	
	
	
	@FindBy(xpath="(//span[@ptooltip='Permission'])[1]")
	WebElement ProfilePremission;
	
	public WebElement ProfilePremission() {
		return ProfilePremission;
	}	
	
	
	@FindBy(xpath="(//span[@ptooltip='Permission'])[1]")
	WebElement CRMpremission;
	
	public WebElement ClickProfilePermission() {
		return CRMpremission;
	}	
	
	@FindBy(xpath="(//p-treetabletoggler[@class='p-element'])[1]")
	WebElement ClickCRMIcon;
	
	public WebElement CRMExpand() {
		return ClickCRMIcon;
	}	
	
	
	
	
	
	@FindBy(xpath="(//p-checkbox[@binary='true'])[1]")
	WebElement Viewpremission;
	
	public WebElement ClickViewCheckbox() {
		return Viewpremission;
	}	
	
	@FindBy(xpath="(//p-checkbox[@binary='true'])[3]")
	WebElement Editpremission;
	
	public WebElement ClickEditCheckbox() {
		return Editpremission;
	}
	
	@FindBy(xpath="(//p-checkbox[@binary='true'])[2]")
	WebElement Createpremission;
	
	public WebElement CreatePremission() {
		return Createpremission;
	}	
	
	
	@FindBy(xpath="//span[contains(text(),'Reports - (Profile -')]")
	WebElement ProfileReports;
	
	public WebElement ProfileReports() {
		return ProfileReports;
	}
	
	@FindBy(xpath="//td[normalize-space()='Account Report']//button[@type='button']")
	WebElement ClickAccountReport;
	
	public WebElement ClickAccountReport() {
		return ClickAccountReport;
	}
	
	
	
	@FindBy(xpath="(//td[normalize-space()='Account Report']//parent::*//div[1])[1]")
	WebElement ClickViewReport;
	
	public WebElement ClickViewReport() {
		return ClickViewReport;
	}
	
	

	@FindBy(xpath="//span[text()='Select a profile']")
	WebElement ProfileSTransfer;
	
	public WebElement ProfileSTransfer() {
		return ProfileSTransfer;
	}
	
	//.................Role Hirechay.................................//
	
	
	
	@FindBy(xpath="//span[text()='Role Hierarchy']")
	WebElement RoleHc;
	
	public WebElement RoleHc() {
		return RoleHc;
	}	
	
	@FindBy(xpath="(//span[text()='Role Hierarchy'])[2]")
	WebElement RoleHc1;
	
	public WebElement RoleHc1() {
		return RoleHc1;
	}	
	
	@FindBy(xpath="//input[@formcontrolname='roleName']")
	WebElement RoleName;
	
	public WebElement RoleName() {
		return RoleName;
	}	
	@FindBy(xpath="(//span[text()='CEO'])[1]")
	WebElement Roleselect;
	
	public WebElement Roleselect() {
		return Roleselect;
	}	
	@FindBy(xpath="//div[text()=' Select new role ']")
	WebElement SnewRole;
	
	public WebElement SnewRole() {
		return SnewRole;
	}
	
	//......................CreateOneJobTypeFromUserGroup.........................//
	
	@FindBy(xpath="//span[text()='Groups']")
	WebElement GroupClick;
	
	public WebElement GroupClick() {
		return GroupClick;
	}	
	
	@FindBy(xpath="//input[@name='name']")
	WebElement GroupName;
	
	public WebElement GroupName() {
		return GroupName;
	}	
	
	
	@FindBy(xpath="//div[text()='Select Users']")
	WebElement UserSelect;
	
	public WebElement UserSelect() {
		return UserSelect;
	}	
	
	
	@FindBy(xpath="//div[text()='Select Group Owner']")
	WebElement GroupOwner;
	
	public WebElement GroupOwner() {
		return GroupOwner;
	}	
	
	@FindBy(xpath="//span[text()='Select Parent Group']")
	WebElement ParentGroup;
	
	public WebElement ParentGroup() {
		return ParentGroup;
	}	
	
	@FindBy(xpath="//a[@id='user-display']//img[@alt='main logo']")
	WebElement Log1;
	
	public WebElement Log1() {
		return Log1;
	}	
	
	@FindBy(xpath="//span[normalize-space()='Logout']")
	WebElement Log2;
	
	public WebElement Log2() {
		return Log2;
	}	
	
	
	@FindBy(xpath="//input[@type='text']")
	WebElement Username;
	
	public WebElement Username() {
		return Username;
	}	
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Pass;
	
	public WebElement Pass() {
		return Pass;
	}	
	@FindBy(xpath="//span[text()='Sign In']")
	WebElement SignIn;
	
	public WebElement SignIn() {
		return SignIn;
	}	
	
	
	@FindBy(xpath="//span[text()='Groups']")
	WebElement Groupclick;
	
	public WebElement Groupclick() {
		return Groupclick;
	}	
	
	@FindBy(xpath="//input[@type='email']")
	WebElement EmailL;
	
	public WebElement EmailL() {
		return EmailL;
	}	
	
	
	//....................User Visibility..................................//
	
	
	@FindBy(xpath="//span[text()='User Visibility']")
	WebElement ClickUV;
	
	public WebElement ClickUV() {
		return ClickUV;
	}	
	
	
	
	@FindBy(xpath="//span[text()='Add Group']")
	WebElement AddGroupUV;
	
	public WebElement AddGroupUV() {
		return AddGroupUV;
	}	
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	WebElement NameUV;
	
	public WebElement NameUV() {
		return NameUV;
	}	
	
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement DescUV;
	
	public WebElement DescUV() {
		return DescUV;
	}	
	

	@FindBy(xpath="(//button[@type='button'])[6]")
	WebElement CEOexpand;
	
	public WebElement CEOexpand() {
		return CEOexpand;
	}	
	
	
	@FindBy(xpath="(//button[@type='button'])[last()]")
	WebElement TestUserClick;
	
	public WebElement TestUserClick() {
		return TestUserClick;
	}	
	
	
	@FindBy(xpath="(//span[@ptooltip='Add'])[2]")
	WebElement LeadTestUserClick;
	
	public WebElement LeadTestUserClick() {
		return LeadTestUserClick;
	}	
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement CNext;
	
	public WebElement CNext() {
		return CNext;
	}	
	
	
	@FindBy(xpath="(//td[@class='ng-star-inserted'])[1]")
	WebElement SelectUser;
	
	public WebElement SelectUser() {
		return SelectUser;
	}	
	
	
	@FindBy(xpath="(//span[@ptooltip='View'])[3]")
	WebElement HumbergLead;
	
	public WebElement HumbergLead() {
		return HumbergLead;
	}	
	@FindBy(xpath="//tbody/tr[1]/td[4]/span[1]")
	WebElement DeleteRoleUser;
	
	public WebElement DeleteRoleUser() {
		return DeleteRoleUser;
	}	
	//............check user profile permission..................//
	
	
	
	
	
	@FindBy(xpath="(//span[@ptooltip='Permission'])[2]")
	WebElement Cpermission;
	
	public WebElement Cpermission() {
		return Cpermission;
	}	
	
	
	
	//...........Delete Profile..................//
	
	@FindBy(xpath="(//span[@ptooltip='Delete'])[1]")
	WebElement DeletePro;
	
	public WebElement DeletePro() {
		return DeletePro;
	}	
	
	@FindBy(xpath="//span[text()='Yes']")
	WebElement YesPro;
	
	public WebElement YesPro() {
		return YesPro;
	}	
	
	@FindBy(xpath="//span[text()='Select a profile']")
	WebElement SelectPro;
	
	public WebElement SelectPro() {
		return SelectPro;
	}	
	
	@FindBy(xpath="//span[text()='Transfer and Delete']")
	WebElement TransferAndDelete;
	
	public WebElement TransferAndDelete() {
		return TransferAndDelete;
	}	
	
	
	
	@FindBy(xpath=" //div[text()='Transfer and deleted successfully...']")
	WebElement DeleteAsseration;
	
	public WebElement DeleteAsseration() {
		return DeleteAsseration;
	}	
	
	
	
	//...........Copy Profile........................//
	
	
	@FindBy(xpath="(//span[@ptooltip='Copy'])[1]")
	WebElement CopyPro;
	
	public WebElement CopyPro() {
		return CopyPro;
	}	
	
	
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	WebElement ClearProfilename;
	
	public WebElement ClearProfilename() {
		return ClearProfilename;
	}	
	
	
	@FindBy(xpath="//tbody/tr[1]/td[5]")
	WebElement AdduserClick;
	
	public WebElement AdduserClick() {
		return AdduserClick;
	}	
	@FindBy(xpath="//tbody/tr[@class='ng-star-inserted']/td[4]/span[1]")
	WebElement Duser;
	
	public WebElement Duser() {
		return Duser;
	}	
	@FindBy(xpath="//span[@class='btnBars']")
	WebElement PlusClick;
	
	public WebElement PlusClick() {
		return PlusClick;
	}	
	@FindBy(xpath="//span[text()='Select a user']")
	WebElement AddSUser;
	
	public WebElement AddSUser() {
		return AddSUser;
	}	
	
	
	@FindBy(xpath="(//span[@ptooltip='Add'])[2]")
	WebElement AddRoleU;
	
	public WebElement AddRoleU() {
		return AddRoleU;
	}	
	
	@FindBy(xpath="//input[@formcontrolname='roleName']")
	WebElement NewRoleName;
	
	public WebElement NewRoleName() {
		return NewRoleName;
	}	
	
	@FindBy(xpath="//button[@class='p-ripple p-element p-treetable-toggler p-link']")
	WebElement Kiwitechc;
	
	public WebElement Kiwitechc() {
		return Kiwitechc;
	}	
	@FindBy(xpath="(//button[@type='button'])[5]")
	WebElement ClicksalesRep;
	
	public WebElement ClicksalesRep() {
		return ClicksalesRep;
	}	
	
	@FindBy(xpath="//td[text()='Automation Testing']//parent::tr//following-sibling::tr[1]//td[4]")
	WebElement ClickAuser;
	
	public WebElement ClickAuser() {
		return ClickAuser;
	}	
	@FindBy(xpath="//span[@class='btnBars']")
	WebElement PlusA;
	
	public WebElement PlusA() {
		return PlusA;
	}	
	@FindBy(xpath="//span[text()='Close']")
	WebElement Close;
	
	public WebElement Close() {
		return Close;
	}	
	
	@FindBy(xpath="(//td[text()='Automation Testing']//parent::tr//following-sibling::tr[1]//td[5]/span[3])[3]")
	WebElement DeleteRole;
	
	public WebElement DeleteRole() {
		return DeleteRole;
	}	
	
	@FindBy(xpath="//p-treeselect[@placeholder='Select new role']")
	WebElement Snewrole;
	
	public WebElement Snewrole() {
		return Snewrole;
	}	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement CRMClick;
	
	public WebElement CRMClick() {
		return CRMClick;
	}	
	
	@FindBy(xpath="(//button[@type='button'])[9]")
	WebElement FSMClick;
	
	public WebElement FSMClick() {
		return FSMClick;
	}	
	
	@FindBy(xpath="(//div[@class='p-checkbox-box'])[1]")
	WebElement ExportClick;
	
	public WebElement ExportClick() {
		return ExportClick;
	}	
	
	@FindBy(xpath="(//span[@ptooltip='Edit'])[1]")
	WebElement EP;
	
	public WebElement EP() {
		return EP;
	}	
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	WebElement CEP;
	
	public WebElement CEP() {
		return CEP;
	}	
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement PD;
	
	public WebElement PD() {
		return PD;
	}	
	
	@FindBy(xpath="//span[text()='Collapse All']")
	WebElement Collapseall;
	
	public WebElement Collapseall() {
		return Collapseall;
	}	
	@FindBy(xpath="(//span[@ptooltip='Edit'])[2]")
	WebElement ER;
	
	public WebElement ER() {
		return ER;
	}	
	
	@FindBy(xpath="//p-treeselect[@placeholder='Select Item']")
	WebElement ReportedTo;
	
	public WebElement ReportedTo() {
		return ReportedTo;
	}	
	
	@FindBy(xpath="//input[@formcontrolname='roleName']")
	WebElement RoleName1;
	
	public WebElement RoleName1() {
		return RoleName1;
	}	
	
	@FindBy(xpath="(//span[@ptooltip='View'])[1]")
	WebElement ViewUser;
	
	public WebElement ViewUser() {
		return ViewUser;
	}	
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement Cancel1;
	
	public WebElement Cancel1() {
		return Cancel1;
	}	
	
	@FindBy(xpath="//span[text()='Fields']")
	WebElement Filedsc;
	
	public WebElement Filedsc() {
		return Filedsc;
	}	
	
	
	@FindBy(xpath="//span[text()=' Job Type ']//parent::*//span[1]")
	WebElement Clickjobtype;
	
	public WebElement Clickjobtype() {
		return Clickjobtype;
	}	
	
	@FindBy(xpath="//td[text()='User Type']//parent::*//td[2]")
	WebElement Cjobuser;
	
	public WebElement Cjobuser() {
		return Cjobuser;
	}	
	
	@FindBy(xpath="//p-inputswitch[@name='isActive']//span[@class='p-inputswitch-slider']")
	WebElement Toggleopen;
	
	public WebElement Toggleopen() {
		return Toggleopen;
	}	
	@FindBy(xpath="(//span[@ptooltip='Copy'])[1]")
	WebElement copyuser;
	
	public WebElement Copyuser() {
		return copyuser;
	}	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement copyuserName;
	
	public WebElement CopyuserName() {
		return copyuserName;
	}	
	
	@FindBy(xpath="//input[@name='email']")
	WebElement copyuserEmail;
	
	public WebElement copyuserEmail() {
		return copyuserEmail;
	}	
	
	@FindBy(xpath="//span[@class='btnBars']")
	WebElement Fadduser;
	
	public WebElement Fadduser() {
		return Fadduser;
	}	
	
	@FindBy(xpath="//span[text()='Select a user']")
	WebElement FSelectUser;
	
	public WebElement FSelectUser() {
		return FSelectUser;
	}	
	@FindBy(xpath="//span[text()='Select a job type']")
	WebElement SelectJType;
	
	public WebElement SelectJType() {
		return SelectJType;
	}	
	@FindBy(xpath="//span[text()='Field Data']")
	WebElement FiledData;
	
	public WebElement FiledData() {
		return FiledData;
	}
	@FindBy(xpath="//span[text()='Select Field Type']")
	WebElement SelectFiledType;
	
	public WebElement SelectFiledType() {
		return SelectFiledType;
	}
	
	@FindBy(xpath="(//div[@class='p-col-12']//child::input)[1]")
	WebElement JobTypeName;
	
	public WebElement JobTypeName() {
		return JobTypeName;
	}
	
	@FindBy(xpath="//tbody/tr[7]/td[3]/span[1]")
	WebElement EditJtype;
	
	public WebElement EditJtype() {
		return EditJtype;
	}
	
	
	@FindBy(xpath="//tbody/tr[7]/td[3]/span[2]")
	WebElement DeleteJtype;
	
	public WebElement DeleteJtype() {
		return DeleteJtype;
	}
	@FindBy(xpath="(//td[normalize-space()='0'])[1]")
	WebElement ClickAU;
	
	public WebElement ClickAU() {
		return ClickAU;
	}
	@FindBy(xpath="(//span[@class='p-inputswitch-slider'])[1]")
	WebElement Vtoggle;
	
	public WebElement Vtoggle() {
		return Vtoggle;
	}
	
	@FindBy(xpath="//tbody/tr[4]/td[6]/span[1]")
	WebElement AddPlusGroup;
	
	public WebElement AddPlusGroup() {
		return AddPlusGroup;
	}
	
	@FindBy(xpath="(//span[@ptooltip='Add'])[1]")
	WebElement SelectG1;
	
	public WebElement Plus1() {
		return SelectG1;
	}
	
	@FindBy(xpath="(//span[@ptooltip='Add User'])[1]")
	WebElement AddUserinjobtype;
	
	public WebElement AddUserinjobtype() {
		return AddUserinjobtype;
	}
	
	
	
	
	
	@FindBy(xpath="(//span[@ptooltip='Add User'])[2]")
	WebElement SelectG2;
	
	public WebElement Plus2() {
		return SelectG2;
	}
	@FindBy(xpath="")
	WebElement SelectG3;
	
	public WebElement Plus3() {
		return SelectG3;
	}
	
	@FindBy(xpath="(//i[@class='pi pi-list'])[1]")
	WebElement View1;
	
	public WebElement View1() {
		return View1;
	}
	
	@FindBy(xpath="(//i[@class='pi pi-list'])[2]")
	WebElement View2;
	
	public WebElement View2() {
		return View2;
	}
	
	@FindBy(xpath="(//i[@class='pi pi-list'])[3]")
	WebElement View3;
	
	public WebElement View3() {
		return View3;
	}
	@FindBy(xpath="//div[@class='p-checkbox-box']")
	WebElement SelectAllUsers;
	
	public WebElement SelectAllUsers() {
		return SelectAllUsers;
	}
	
	@FindBy(xpath="(//tr[@class='p-element p-selectable-row ng-star-inserted'])[1]")
	WebElement S1;
	
	public WebElement S1() {
		return S1;
	}
	
	@FindBy(xpath="(//tr[@class='p-element p-selectable-row ng-star-inserted'])[2]")
	WebElement S2;
	
	public WebElement S2() {
		return S2;
	}
	@FindBy(xpath="(//span[text()='Save'])[2]")
	WebElement Save2;
	
	public WebElement Save2() {
		return Save2;
	}
	
	@FindBy(xpath="//div[@class='p-checkbox-box']")
	WebElement SelectAllLeads;
	
	public WebElement SelectAllLeads() {
		return SelectAllLeads;
	}
	
	
	@FindBy(xpath="//p-dropdown[@id='allChannels']")
	WebElement ChannelSelect;
	
	public WebElement ChannelSelect() {
		return ChannelSelect;
	}
	
	
	@FindBy(xpath="(//tr[@class='p-element p-selectable-row ng-star-inserted'])[1]")
	WebElement L1;
	
	public WebElement L1() {
		return L1;
	}
	
	@FindBy(xpath="(//tr[@class='p-element p-selectable-row ng-star-inserted'])[2]")
	WebElement L2;
	
	public WebElement L2() {
		return L2;
	}
	
	@FindBy(xpath="//span[@class='p-checkbox-icon pi pi-check']")
	WebElement UnselectAllLeads;
	
	public WebElement UnselectAllLeads() {
		return UnselectAllLeads;
	}

	@FindBy(xpath="(//span[@ptooltip='Add'])[3]")
	WebElement AddAccount;
	
	public WebElement AddAccount() {
		return AddAccount;
	}

	@FindBy(xpath="//div[@class='p-checkbox-box']")
	WebElement SelectAllAccounts;
	
	public WebElement SelectAllAccounts() {
		return SelectAllAccounts;
	}
	

	@FindBy(xpath="(//span[@ptooltip='Edit'])[last()]")
	WebElement Edit2user;
	
	public WebElement Edit2user() {
		return Edit2user;
	}
	
	
	
	@FindBy(xpath="(//span[@ptooltip='Delete'])[last()]")
	WebElement Delete2user;
	
	public WebElement Delete2user() {
		return Delete2user;
	}
	@FindBy(xpath="//input[@formcontrolname='name']")
	WebElement RemoveName;
	
	public WebElement RemoveName() {
		return RemoveName;
	}
	
	@FindBy(xpath="//td[text()='Automation Testing']//parent::tr//following-sibling::tr[1]//td[4]")
	WebElement ClickA4;
	
	public WebElement ClickA4() {
		return ClickA4;
	}
	@FindBy(xpath="//span[text()='Permission']")
	WebElement ChannelPermission;
	
	public WebElement ChannelPermission() {
		return ChannelPermission;
	}
	@FindBy(xpath="//p-button[@class='p-element']")
	WebElement PPlusC;
	
	public WebElement PPlusC() {
		return PPlusC;
	}
	@FindBy(xpath="//p-dropdown[@placeholder='Choose Channel']")
	WebElement ChannelDrp;
	
	public WebElement ChannelDrp() {
		return ChannelDrp;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select a profile']")
	WebElement DrpProfile;
	
	public WebElement DrpProfile() {
		return DrpProfile;
	}
	@FindBy(xpath="//td[normalize-space()='No']//p-radiobutton[@name='radioButtonGroup']")
	WebElement Active2permissions;
	
	public WebElement Active2permissions() {
		return Active2permissions;
	}
	@FindBy(xpath="(//td[text()='Automation']//parent::tr//i)[1]")
	WebElement Editper;
	
	public WebElement Editper() {
		return Editper;
	}
	
	@FindBy(xpath="(//td[text()='Automation']//parent::tr//i)[2]")
	WebElement DeletePer;
	
	public WebElement DeletePer() {
		return DeletePer;
	}
	
	@FindBy(xpath="//td[text()='User Type']")
	WebElement ScrollUsertype;
	
	public WebElement ScrollUsertype() {
		return ScrollUsertype;
	}
	
	@FindBy(xpath="//td[text()='Admin']")
	WebElement ScrollDownAdmin;
	
	public WebElement ScrollDownAdmin() {
		return ScrollDownAdmin;
	}
	
	@FindBy(xpath="(//td[text()='Admin']//parent::tr//i)[4]")
	WebElement AdminPer;
	
	public WebElement AdminPer() {
		return AdminPer;
	}
	@FindBy(xpath="(//p-checkbox[@binary='true'])[1]")
	WebElement Mark1;
	
	public WebElement Mark1() {
		return Mark1;
	}
	
	@FindBy(xpath="(//p-checkbox[@binary='true'])[2]")
	WebElement Mark2;
	
	public WebElement Mark2() {
		return Mark2;
	}
	
	
	@FindBy(xpath="(//p-checkbox[@binary='true'])[3]")
	WebElement Mark3;
	
	public WebElement Mark3() {
		return Mark3;
	}
	
	@FindBy(xpath="//a[@id='user-display']//img[@alt='main logo']")
	WebElement GoToProfile;
	
	public WebElement GoToProfile() {
		return GoToProfile;
	}
	@FindBy(xpath="//span[normalize-space()='Logout']")
	WebElement GoToLogout;
	
	public WebElement GoToLogout() {
		return GoToLogout;
	}
	
	
	@FindBy(xpath="//input[@formcontrolname='username']")
	WebElement UsernameMarkzu;
	
	public WebElement UsernameMarkzu() {
		return UsernameMarkzu;
	}
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	WebElement PassMarkzu;
	
	public WebElement PassMarkzu() {
		return PassMarkzu;
	}
	
	@FindBy(xpath="//span[text()='Sign In']")
	WebElement SignInMarkzu;
	
	public WebElement SignInMarkzu() {
		return SignInMarkzu;
	}
	
	@FindBy(xpath="//span[text()='Leads']")
	WebElement LeadC;
	
	public WebElement LeadC() {
		return LeadC;
	}
	
	@FindBy(xpath="(//td[@class='ng-star-inserted'])[1]")
	WebElement RightClick;
	
	public WebElement RightClick() {
		return RightClick;
	}
	
	
	
	
	@FindBy(xpath="//span[text()='Accounts']")
	WebElement AccountC;
	
	public WebElement AccountC() {
		return AccountC;
	}
	
	
	@FindBy(xpath="(//td[@class='ng-star-inserted'])[1]")
	WebElement RightClick1;
	
	public WebElement RightClick1() {
		return RightClick1;
	}
	@FindBy(xpath="//td[text()='Finance']")
	WebElement ScrollFiance;
	
	public WebElement ScrollFiance() {
		return ScrollFiance;
	}
	
	@FindBy(xpath="(//span[@class='p-button-icon p-button-icon-left pi pi-chevron-right'])[1]")
	WebElement QA1;
	
	public WebElement QA1() {
		return QA1;
	}
	
	@FindBy(xpath="(//span[@ptooltip='Add'])[1]")
	WebElement Add1;
	
	public WebElement Add1() {
		return Add1;
	}
	@FindBy(xpath="(//span[@ptooltip='Add User'])[1]")
	WebElement AddUser1;
	
	public WebElement AddUser1() {
		return AddUser1;
	}
	
	@FindBy(xpath="(//span[@class='p-element btnBars p-mr-0'])[8]")
	WebElement clickp1;
	
	public WebElement clickp1() {
		return clickp1;
	}
	
	
	@FindBy(xpath="(//span[@class='p-element btnBars p-mr-0'])[4]")
	WebElement clickp2;
	
	public WebElement clickp2() {
		return clickp2;
	}
	
	
	
	
}
