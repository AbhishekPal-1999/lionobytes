package ExcelWriteCodeImports;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;

public class TC_003AddAndUpdateDataExcelFileLead extends Baseclass  {


	    @Test
	    public void TryExcelFileWriteCodeTest() throws FileNotFoundException, IOException, InterruptedException {
	    	 String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files\\Lead_AddAndUpdate Imports_With Default Fileds 1.1.xlsx";
	         

	         int[] rowsToUpdate = {1, 2, 3,4,5}; // Rows 
	         int[] columnsToUpdate = {20, 21, 1,24,26,48,49}; //Columns 

	         String[][] newValues = {
	                 {"LD1005", "Imports-Leads", "Imports-Leads","(GMT-09:00) Alaska","HotLead","Billing","Commercial"},
	                 {"LD1006", "Imports-Leads 1", "Imports-Leads 1","(GMT-09:00) Alaska","HotLead","Billing","Commercial"},
	                 {"LD1007", "Imports-Leads 2", "Imports-Leads 2","(GMT-09:00) Alaska","HotLead","Billing","Commercial"},
	                 {"", "", "Automotive 1"+randomnumber(),"(GMT-10:00) Hawaii","HotLead","Billing","Commercial"},
	                 {"", "", "Automotive 2"+randomnumber(),"(GMT-10:00) Hawaii","HotLead","Billing","Commercial"}
	         };

	         try {
	             FileInputStream inputStream = new FileInputStream(filepath);
	             Workbook workbook = new XSSFWorkbook(inputStream);
	             Sheet sheet = workbook.getSheetAt(0); 

	             for (int i = 0; i < rowsToUpdate.length; i++) {
	                 int rowToUpdate = rowsToUpdate[i];
	                 Row row = sheet.getRow(rowToUpdate);
	                 if (row == null) {
	                     row = sheet.createRow(rowToUpdate);
	                 }

	                 for (int j = 0; j < columnsToUpdate.length; j++) {
	                     int columnToUpdate = columnsToUpdate[j];
	                     Cell cell = row.getCell(columnToUpdate);
	                     if (cell == null) {
	                         cell = row.createCell(columnToUpdate);
	                     }

	                     cell.setCellValue(newValues[i][j]);
	                 }
	             }

	             FileOutputStream outputStream = new FileOutputStream(filepath);
	             workbook.write(outputStream);
	             workbook.close();
	             outputStream.close();

	             System.out.println("Multiple rows and columns updated successfully.");
	         } catch (IOException e) {
	             e.printStackTrace();
	         }
	     }
	    @Test
	    public void AddAndUpdateWithCustom() throws FileNotFoundException, IOException, InterruptedException {
	    	 String filepath=System.getProperty("user.dir") + "\\TestData\\TestData\\Excel-Files\\Lead_AddAndUpdate Imports_With Custom Fileds 1.2.xlsx";
	         

	         int[] rowsToUpdate = {1, 2, 3,4,5}; // Rows 
	         int[] columnsToUpdate = {21, 22, 1,25,27,50,51,28,29,30,31,32,57,58,59,60,61,62,63,64,65,66,67}; //Columns 

	         String[][] newValues = {
	                 {"LD1005", "Imports-Leads", "Imports-Leads","(GMT-09:00) Alaska","HotLead","Billing","Commercial","Check 10","02/19/2024","90.8"+randomnumber(),"Drop 10","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 11","90"+randomnumber(),"R10","2","Yes"},
	                 {"LD1006", "Imports-Leads 1", "Imports-Leads 1","(GMT-09:00) Alaska","HotLead","Billing","Commercial","Check 10","02/19/2024","90.8"+randomnumber(),"Drop 10","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 11","75"+randomnumber(),"R10","3","No"},
	                 {"LD1007", "Imports-Leads 2", "Imports-Leads 2","(GMT-09:00) Alaska","HotLead","Billing","Commercial","Check 10","02/19/2024","90.8"+randomnumber(),"Drop 10","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 11","62"+randomnumber(),"R10","4","No"},
	                 {"", "", "Wireless 1"+randomnumber(),"(GMT-10:00) Hawaii","HotLead","Billing","Commercial","Check 10","02/19/2024","90.8"+randomnumber(),"Drop 10","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 11","87"+randomnumber(),"R10","5","Yes"},
	                 {"", "", "Wireless 2"+randomnumber(),"(GMT-10:00) Hawaii","HotLead","Billing","Commercial","Check 10","02/19/2024","90.8"+randomnumber(),"Drop 10","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 11","88"+randomnumber(),"R10","6","Yes"}
	         };

	         try {
	             FileInputStream inputStream = new FileInputStream(filepath);
	             Workbook workbook = new XSSFWorkbook(inputStream);
	             Sheet sheet = workbook.getSheetAt(0); 

	             for (int i = 0; i < rowsToUpdate.length; i++) {
	                 int rowToUpdate = rowsToUpdate[i];
	                 Row row = sheet.getRow(rowToUpdate);
	                 if (row == null) {
	                     row = sheet.createRow(rowToUpdate);
	                 }

	                 for (int j = 0; j < columnsToUpdate.length; j++) {
	                     int columnToUpdate = columnsToUpdate[j];
	                     Cell cell = row.getCell(columnToUpdate);
	                     if (cell == null) {
	                         cell = row.createCell(columnToUpdate);
	                     }

	                     cell.setCellValue(newValues[i][j]);
	                 }
	             }

	             FileOutputStream outputStream = new FileOutputStream(filepath);
	             workbook.write(outputStream);
	             workbook.close();
	             outputStream.close();

	             System.out.println("Multiple rows and columns updated successfully.");
	         } catch (IOException e) {
	             e.printStackTrace();
	         }
	     }
}
