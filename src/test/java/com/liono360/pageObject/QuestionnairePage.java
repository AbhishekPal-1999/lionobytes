package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class QuestionnairePage extends Baseclass {
	
	WebDriver ldriver;

	public QuestionnairePage(WebDriver rdriver) {
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	public void WaitUntillPageLoad() throws TimeoutException, InterruptedException {
		int maxWaitingTime = 40;
		Thread.sleep(2000); 
		float time=1;

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		while (time<maxWaitingTime) {
			WebElement LoaderIcon = null;
			try {
				LoaderIcon = driver.findElement(By.xpath("//div[@class=\"splash-loader\"]"));

			} catch (Exception e) {
				System.out.println("page is loaded fully now");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				break; }

			if (LoaderIcon!=null) {

				Thread.sleep(500); 
				time=(float) (time+.5);
				System.out.println("page loader icon is occuring till: "+time +"Seconds");
			} 

		}
		
	  }
	
	@FindBy(xpath="//span[contains(text(),'Configurations')]")
	WebElement btnCongigurations;

	public WebElement Congigurations() {
		return btnCongigurations;
	}
	
	@FindBy(xpath="//span[text()='CRM']//parent::a//span[1]")
	WebElement btnCRM;

	public WebElement CRM() {
		return btnCRM;
	}

	@FindBy(xpath="//span[text()='Questionnaire']")
	WebElement btnQuestionnaire;

	public WebElement Questionnaire() {
		return btnQuestionnaire;
	}
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement btnYes;

	public WebElement clickYesButton() {
		return btnYes;
	}
	
	@FindBy(xpath="(//li[@role=\"presentation\"])[last()]//span[1]")
	WebElement btnhamburger;

	public WebElement clickHamburger() {
		return btnhamburger;
	}
	
	@FindBy(xpath="//span[text()='Channel']//parent::a[@role=\"menuitem\"]")
	WebElement btnChannel;

	public WebElement Channel() {
		return btnChannel;
	}
	
	@FindBy(xpath="//span[text()='Question']")
	WebElement btnQuestion;

	public WebElement Question() {
		return btnQuestion;
	}
	
	@FindBy(xpath="(//span[@ptooltip=\"Delete\"])[1]")
	WebElement btnDelete;

	public WebElement Delete() {
		return btnDelete;
	}
	
	
	@FindBy(xpath="//span[@ptooltip=\"Edit\"][1]")
	WebElement btnEdit;

	public WebElement edit() {
		return btnEdit;
	}
	
	
	@FindBy(xpath="(//p-inputswitch//span)[1]")
	WebElement btntoggle;

	public WebElement toggle() {
		return btntoggle;
	}
	

	@FindBy(xpath="//input[@name=\"channelName\"]")
	WebElement channelname ;

	public WebElement channelName() {
		return channelname;
	}
	
	@FindBy(xpath="//p-dropdown[@name=\"questionnaireGroups\"]")
	WebElement btnactivityType ;

	public WebElement activityType() {
		return btnactivityType;
	}
	
	@FindBy(xpath="//p-treeselect[@placeholder=\"Select Users\"]")
	WebElement selectUsers ;

	public WebElement SelectUsers() {
		return selectUsers;
	}
	
	@FindBy(xpath="(//div[@role=\"treeitem\"]//button)[1]")
	WebElement allUsers ;

	public WebElement allUsers() {
		return allUsers;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Template']//div//div[@aria-label='dropdown trigger']")
	WebElement allTemplateTypes ;

	public WebElement SelectTemplate() {
		return allTemplateTypes;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Associated with']//div//div[@aria-label='dropdown trigger']")
	WebElement DrpModuleType ;

	public WebElement SelectModuleType() {
		return DrpModuleType;
	}
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement btnSave;

	public WebElement Save() {
		return btnSave;
	}
	
	@FindBy(xpath="(//span[text()='Save'])[2]")
	WebElement btnSave2;

	public WebElement Save2() {
		return btnSave2;
	}
	
	@FindBy(xpath="(//span[@ptooltip=\"Edit\"]//ancestor::tr)[1]//td[1]")
	WebElement ListedChannel;

	public WebElement listedChannel() {
		return ListedChannel;
	}
	
	@FindBy(xpath="//th[text()='Question ']//ancestor::thead//following-sibling::tbody//tr[last()]//td[2]")
	WebElement listedLastQuestion;

	public WebElement ListedLastQuestion() {
		return listedLastQuestion;
	}
	
	@FindBy(xpath="(//span[@ptooltip=\"Edit\"])[last()]")
	WebElement btnEditQuestion;

	public WebElement EditQuestion() {
		return btnEditQuestion;
	}
	
	@FindBy(xpath="(//span[@ptooltip=\"Delete\"])[last()]")
	WebElement btndeleteQuestion;

	public WebElement DeleteQuestion() {
		return btndeleteQuestion;
	}

	
	@FindBy(xpath="//p-multiselect[@placeholder=\"Lead types\"]")
	WebElement drpLeadType;

	public WebElement selectLeadType() {
		return drpLeadType;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Employee\"]")
	WebElement drpNumberOfEmployee ;
	
	public WebElement selectNumberOfEmployee() {
		return  drpNumberOfEmployee ;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Revenue\"]")
	WebElement drpRevenue ;
	
	public WebElement selectRevenue() {
		return  drpRevenue ;
	}
	
	@FindBy(xpath="//a[@role=\"tab\"]//span[text()='Questions']")
	WebElement btnquestions;

	public WebElement questionsTab() {
		return btnquestions;
	}
	
	@FindBy(xpath="//input[@name=\"questionName\"]")
	WebElement txtQueName;

	public WebElement setQuestionName() {
		return txtQueName;
	}
	
	@FindBy(xpath="//p-dropdown[@name=\"answerType\"]")
	WebElement drpQueType ;
	
	public WebElement selectAnswerType() {
		return  drpQueType ;
	}
	
	@FindBy(xpath="//button[@icon=\"pi pi-plus\"]")
	WebElement plusIcon ;
	
	public WebElement plusButton() {
		return  plusIcon ;
	}
	
	@FindBy(xpath="//p-button[@icon=\"pi pi-plus\"]//button")
	WebElement btnAddrule ;
	
	public WebElement Addrule() {
		return  btnAddrule ;
	}
	
	@FindBy(xpath="//i[@class=\"pi pi-plus\"]")
	WebElement btnAddFilter ;
	
	public WebElement AddFilter() {
		return  btnAddFilter ;
	}
	
	@FindBy(xpath="(//input[@type='text'])[10]")
	WebElement inputbox1 ;
	
	public WebElement inputBox1() {
		return  inputbox1 ;
	}
	
	@FindBy(xpath="(//input[@type='text'])[11]")
	WebElement inputbox2 ;
	
	public WebElement inputBox2() {
		return  inputbox2 ;
	}
	
	@FindBy(xpath="(//input[@type='text'])[12]")
	WebElement inputbox3 ;
	
	public WebElement inputBox3() {
		return  inputbox3 ;
	}
	
	@FindBy(xpath="(//input[@type=\"text\"])[7]")
	WebElement inputbox4 ;
	
	public WebElement inputBox4() {
		return  inputbox4 ;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Choose Field\"])[1]")
	WebElement drpFilter1 ;
	
	public WebElement selectFilter1() {
		return  drpFilter1 ;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Choose Field\"])[2]")
	WebElement drpFilter2 ;
	
	public WebElement selectFilter2() {
		return  drpFilter2 ;
	}
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Choose Field\"])[3]")
	WebElement drpFilter3 ;
	
	public WebElement selectFilter3() {
		return  drpFilter3 ;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Choose Field\"])[4]")
	WebElement drpFilter4 ;
	
	public WebElement selectFilter4() {
		return  drpFilter4 ;
	}
	
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Choose Value(s)\"])[1]")
	WebElement drpMultipleValue ;
	
	public WebElement chooseMultipleValue() {
		return  drpMultipleValue ;
	}
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Choose Value(s)\"])[2]")
	WebElement drpMultipleValue2 ;
	
	public WebElement chooseMultipleValue2() {
		return  drpMultipleValue2 ;
	}
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Choose Value(s)\"])[3]")
	WebElement drpMultipleValue3 ;
	
	public WebElement chooseMultipleValue3() {
		return  drpMultipleValue3 ;
	}
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Choose Value(s)\"])[4]")
	WebElement drpMultipleValue4 ;
	
	public WebElement chooseMultipleValue4() {
		return  drpMultipleValue4 ;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Choose Value(s)\"])[1]")
	WebElement drpSingleValue ;
	
	public WebElement chooseSingleValue() {
		return  drpSingleValue ;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Choose Value(s)\"])[2]")
	WebElement drpSingleValue2 ;
	
	public WebElement chooseSingleValue2() {
		return  drpSingleValue2 ;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Choose Field\"])[2]//parent::div//following-sibling::div[2]//input")
	WebElement txtSetvalue ;
	
	public WebElement SetValue() {
		return  txtSetvalue ;
	}
	
	@FindBy(xpath="//textarea[@name=\"description\"]")
	WebElement txtNotes ;
	
	public WebElement setNotes() {
		return  txtNotes ;
	}
}
