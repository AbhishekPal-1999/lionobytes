package com.liono360.ExcelWriteCodeImports;

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

public class TC_013AddAndUpdateDataExcelFileCases extends Baseclass {
    @Test
    public void TryExcelFileWriteCodeTest() throws FileNotFoundException, IOException, InterruptedException {
    	 String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files\\Lead_AddAndUpdate Imports_With Default Fileds 1.1.xlsx";
         

         int[] rowsToUpdate = {1, 2, 3,4,5}; // Rows 
         int[] columnsToUpdate = {0,1, 2, 3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,}; //Columns 

         String[][] newValues = {
        		    { "CN1020", "Account","IMP Case Account","Casename"+randomnumber(),"casesemail"+randomnumber()+"@gmail.com","9075628"+randomnumber(),"Test 2","CRM","CRM Case","Test P 1","Disscussion Part"+randomnumber(),"","Case Details No 1"+randomnumber(),"New","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul"},
	                { "CN1021", "Lead","Imp Lead Case","Casename"+randomnumber(),"casesemail"+randomnumber()+"@gmail.com","9075628"+randomnumber(),"Test 2","CRM","CRM Case","Test P 1","Disscussion Part"+randomnumber(),"","Case Details No 1"+randomnumber(),"New","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul"},
	                { "CN1022", "Organization","LionOBytes Automation Pvt.Ltd","Casename"+randomnumber(),"casesemail"+randomnumber()+"@gmail.com","9075628"+randomnumber(),"Test 2","CRM","CRM Case","Test P 1","Disscussion Part"+randomnumber(),"","Case Details No 1"+randomnumber(),"New","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul"},
	                { "", "Account","IMP Case Account","Casename"+randomnumber(),"casesemail"+randomnumber()+"@gmail.com","9075628"+randomnumber(),"Test 2","CRM","CRM Case","Test P 1","Disscussion Part"+randomnumber(),"","Case Details No 1"+randomnumber(),"New","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul"},
	                { "", "Lead","Imp Lead Case","Casename"+randomnumber(),"casesemail"+randomnumber()+"@gmail.com","9075628"+randomnumber(),"Test 2","CRM","CRM Case","Test P 1","Disscussion Part"+randomnumber(),"","Case Details No 1"+randomnumber(),"New","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul"},
	                { "", "Organization","LionOBytes Automation Pvt.Ltd","Casename"+randomnumber(),"casesemail"+randomnumber()+"@gmail.com","9075628"+randomnumber(),"Test 2","CRM","CRM Case","Test P 1","Disscussion Part"+randomnumber(),"","Case Details No 1"+randomnumber(),"New","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul"}
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
         int[] columnsToUpdate = {0,1, 2, 3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,}; //Columns 

         String[][] newValues = {
	        		{ "CN1017", "Account","IMP Case Account","Casename"+randomnumber(),"casesemail"+randomnumber()+"@gmail.com","9075628"+randomnumber(),"Test 2","CRM","CRM Case","Test P 1","Solve"+randomnumber(),"","Case Details No 1"+randomnumber(),"New","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul","Check A","7/25/2025","Drop 1","Complete"+randomnumber(),"TRP"+randomnumber(),"Value 10","R10","4","Yes"},
			  		{ "CN1018", "Lead","Imp Lead Case","Casename"+randomnumber(),"casesemail"+randomnumber()+"@gmail.com","9075628"+randomnumber(),"Test 2","CRM","CRM Case","Test P 1","Pending"+randomnumber(),"","Case Details No 1"+randomnumber(),"New","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul","Check D","7/28/2025","Drop 2","Complete"+randomnumber(),"TRP"+randomnumber(),"Value 12","R12","3","Yes"},
			  		{ "CN1019", "Organization","LionOBytes Automation Pvt.Ltd","Casename"+randomnumber(),"casesemail"+randomnumber()+"@gmail.com","9075628"+randomnumber(),"Test 2","CRM","CRM Case","Test P 1","Resloved"+randomnumber(),"","Case Details No 1"+randomnumber(),"New","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul","Check B","7/29/2025","Drop 3","Complete"+randomnumber(),"TRP"+randomnumber(),"Value 13","R11","5","Yes"},
	        		{ "", "Account","IMP Case Account","Casename"+randomnumber(),"casesemail"+randomnumber()+"@gmail.com","9075628"+randomnumber(),"Test 2","CRM","CRM Case","Test P 1","Solve"+randomnumber(),"","Case Details No 1"+randomnumber(),"New","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul","Check A","7/25/2025","Drop 1","Complete"+randomnumber(),"TRP"+randomnumber(),"Value 10","R10","4","Yes"},
			  		{ "", "Lead","Imp Lead Case","Casename"+randomnumber(),"casesemail"+randomnumber()+"@gmail.com","9075628"+randomnumber(),"Test 2","CRM","CRM Case","Test P 1","Pending"+randomnumber(),"","Case Details No 1"+randomnumber(),"New","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul","Check D","7/28/2025","Drop 2","Complete"+randomnumber(),"TRP"+randomnumber(),"Value 12","R12","3","Yes"},
			  		{ "", "Organization","LionOBytes Automation Pvt.Ltd","Casename"+randomnumber(),"casesemail"+randomnumber()+"@gmail.com","9075628"+randomnumber(),"Test 2","CRM","CRM Case","Test P 1","Resloved"+randomnumber(),"","Case Details No 1"+randomnumber(),"New","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul","Check B","7/29/2025","Drop 3","Complete"+randomnumber(),"TRP"+randomnumber(),"Value 13","R11","5","Yes"}
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
