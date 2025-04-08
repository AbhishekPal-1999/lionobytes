package com.liono360.cases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_014AddAllLogsType extends Baseclass{

	
	@Test
	public void TC_014AddAllLogsTypeTest() throws InterruptedException {

		CasesPage cases = new CasesPage(driver);

		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");

		TryClick(cases.addedCase());
		logger.info("Clicked on created Cases");

		TryClick(cases.ActivityTab());
		logger.info("Clicked on Activity Tab");

		TryClick(cases.PlusIcon());
		logger.info("Clicked on Plus Icon");

		// .................Add Email.................................//

		TryClick(cases.EmailBox());
		logger.info("Clicked on Email Box");

		TryClick(cases.TO());
		driver.findElement(By.xpath("(//li[normalize-space()='Akash Baban Mogdul<Akash.m@lionobytes.com>'])[1]"))
				.click();
		logger.info("Select User Email ID");

		Thread.sleep(1000);
		cases.Subject().sendKeys("Complete Survey for Customer Feedback" + randomnumber());
		logger.info("Subject Added");

		Thread.sleep(1000);
		cases.EnterText().sendKeys("Dear AM,"
				+ "I hope this email finds you well. As a valued customer, your feedback is incredibly important to us. We strive to continuously improve our services, and your insights play a significant role in helping us achieve that goal.");
		logger.info("Email Write Succesfully");

		SelectDropdown(cases.Option(), 1);
		logger.info("Select Option Send Now");

		TryClick(cases.Send());
		logger.info("Clicked on Send");

		// .......................Logs...........................................................................//

		Thread.sleep(3000);

		TryClick(cases.PlusIcon());
		logger.info("Clicked on Plus Icon");

		TryClick(cases.logs());
		logger.info("Clicked on logs");

		SelectDropdown(cases.SelectType(), 1);
		logger.info("Selected Log Type Email");

		Thread.sleep(1000);
		cases.LogComment().sendKeys(
				"I look forward to celebrating this milestone with you and the rest of the team. Please let me know a convenient time for us to meet and discuss our next steps."
						+ randomnumber());
		logger.info("log comment Added");

		Thread.sleep(4000);
		String filepath = System.getProperty("user.dir") + "\\TestData\\All Type Documents\\file-docx.docx";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(filepath);
		logger.info("File Upload");

		TryClick(cases.SaveLogbtn());
		logger.info("Clicked on Save");

		// ...................................Filed Visit..................................................................//
		Thread.sleep(3000);

		TryClick(cases.PlusIcon());
		logger.info("Clicked on Plus Icon");

		TryClick(cases.logs());
		logger.info("Clicked on logs");

		SelectDropdown(cases.SelectType(), 2);
		logger.info("Selected Log Type Filed Visit");

		Thread.sleep(1000);
		cases.LogComment().sendKeys(
				"Mentioning any plans for future follow-up, whether it's another meeting, sending information, or providing support."
						+ randomnumber());
		logger.info("log comment Added");

		Thread.sleep(4000);
		String filepath1 = System.getProperty("user.dir") + "\\TestData\\All Type Documents\\file-doc.doc";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(filepath1);
		logger.info("File Upload");

		TryClick(cases.SaveLogbtn());
		logger.info("Clicked on Save");

		// ....................................Mobile Inbounds Call.......................................................................//
		Thread.sleep(3000);

		TryClick(cases.PlusIcon());
		logger.info("Clicked on Plus Icon");

		TryClick(cases.logs());
		logger.info("Clicked on logs");

		SelectDropdown(cases.SelectType(), 3);
		logger.info("Selected Log Type Mobile");

		SelectDropdown(cases.SelectSubType(), 1);
		logger.info("Selected Log sub Type Inbound");

		Thread.sleep(1000);
		cases.LogComment().sendKeys(
				"Caller reported an issue with their mobile app login, reset password and guided through troubleshooting steps successfully."
						+ randomnumber());
		logger.info("log comment Added");

		Thread.sleep(4000);
		String filepath2 = System.getProperty("user.dir") + "\\TestData\\All Type Documents\\xlsx File.xlsx";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(filepath2);
		logger.info("File Upload");

		TryClick(cases.SaveLogbtn());
		logger.info("Clicked on Save");

		// ...................................Mobile Outbounds Call.......................................................................//

		Thread.sleep(3000);

		TryClick(cases.PlusIcon());
		logger.info("Clicked on Plus Icon");

		TryClick(cases.logs());
		logger.info("Clicked on logs");

		SelectDropdown(cases.SelectType(), 3);
		logger.info("Selected Log Type Mobile");

		SelectDropdown(cases.SelectSubType(), 2);
		logger.info("Selected Log sub Type Outbound");

		Thread.sleep(1000);
		cases.LogComment().sendKeys(
				"Contacted client to discuss new product features and benefits, arranged demonstration meeting."
						+ randomnumber());
		logger.info("log comment Added");

		Thread.sleep(4000);
		String filepath3 = System.getProperty("user.dir") + "\\TestData\\All Type Documents\\txt.txt";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(filepath3);
		logger.info("File Upload");

		TryClick(cases.SaveLogbtn());
		logger.info("Clicked on Save");

		// ....................................Note........................................................................//

		Thread.sleep(3000);

		TryClick(cases.PlusIcon());
		logger.info("Clicked on Plus Icon");

		TryClick(cases.logs());
		logger.info("Clicked on logs");

		SelectDropdown(cases.SelectType(), 4);
		logger.info("Selected Log Type Note");

		Thread.sleep(1000);
		cases.LogComment().sendKeys(
				"Attended webinar on industry trends and best practices. Took notes on key insights regarding market analysis and customer behavior. Shared summary with marketing team for strategy alignment."
						+ randomnumber());
		logger.info("log comment Added");

		Thread.sleep(4000);
		String filepath4 = System.getProperty("user.dir") + "\\TestData\\All Type Documents\\pdf File.pdf";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(filepath4);
		logger.info("File Upload");

		TryClick(cases.SaveLogbtn());
		logger.info("Clicked on Save");


		// ..................................Work Inbounds Call.........................................................//
		Thread.sleep(3000);

		TryClick(cases.PlusIcon());
		logger.info("Clicked on Plus Icon");

		TryClick(cases.logs());
		logger.info("Clicked on logs");

		SelectDropdown(cases.SelectType(), 5);
		logger.info("Selected Log Type Work");

		SelectDropdown(cases.SelectSubType(), 1);
		logger.info("Selected Log sub Type Inbound");

		Thread.sleep(1000);
		cases.LogComment().sendKeys(
				"Received inbound email from client requesting a quote for additional services. Acknowledged receipt and forwarded request to sales team for follow-up."
						+ randomnumber());
		logger.info("log comment Added");

		Thread.sleep(4000);
		String filepath6 = System.getProperty("user.dir") + "\\TestData\\All Type Documents\\txt.txt";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(filepath6);
		logger.info("File Upload");

		TryClick(cases.SaveLogbtn());
		logger.info("Clicked on Save");

		// ..................................Work OutBounds Call.........................................................//
		Thread.sleep(3000);

		TryClick(cases.PlusIcon());
		logger.info("Clicked on Plus Icon");

		TryClick(cases.logs());
		logger.info("Clicked on logs");

		SelectDropdown(cases.SelectType(), 5);
		logger.info("Selected Log Type Work");

		SelectDropdown(cases.SelectSubType(), 2);
		logger.info("Selected Log sub Type Outbound");

		Thread.sleep(1000);
		cases.LogComment().sendKeys(
				"Outbound call made to confirm attendance for upcoming training workshop. Updated participant list and sent calendar invitation with event details."
						+ randomnumber());
		logger.info("log comment Added");

		Thread.sleep(4000);
		String filepath7 = System.getProperty("user.dir") + "\\TestData\\All Type Documents\\xlsx File.xlsx";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(filepath7);
		logger.info("File Upload");

		TryClick(cases.SaveLogbtn());
		logger.info("Clicked on Save");

		logger.info("All Logs Added");
		
		
		
		
		
		
		
		
	}

}
