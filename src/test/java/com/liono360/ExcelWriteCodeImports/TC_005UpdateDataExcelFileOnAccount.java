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

public class TC_005UpdateDataExcelFileOnAccount extends Baseclass {
	  @Test
	    public void TryExcelFileWriteCodeTest() throws FileNotFoundException, IOException, InterruptedException {


	        String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Accounts\\Account_Update Imports_With Default Fileds 1.1.xlsx";
	        	        

	        int[] rowsToUpdate = {1, 2, 3}; //Rows 
	        int[] columnsToUpdate = {20, 21, 1,25,27,47,48}; //Columns 

	        String[][] newValues = {
	                {"AC1070", "Import Update Data 01", "Import Update Data 01","(GMT-11:00) Midway Island","Import","Shipping","Commercial"},
	                {"AC1071", "Import Update Data 02", "Import Update Data 02","(GMT-09:00) Alaska","Import","Mailing","Commercial"},
	                {"AC1072", "Import Update Data 03", "Import Update Data 03","(GMT-07:00) Mountain Time (US and Canada)","Import","Billing","Commercial"}
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
	    public void UpdateWithCustomFileds() throws FileNotFoundException, IOException, InterruptedException {

	    

		    String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Accounts\\Account_Update Imports_With Custom Fileds 1.2.xlsx";
	        

	        int[] rowsToUpdate = {1, 2, 3}; //Rows 
	        int[] columnsToUpdate = {20, 21, 1,25,27,47,48,57,58,59,60,61,62,63,64,65,66,67}; //Columns 

	        String[][] newValues = {
	                {"AC1074", "Update Custom Data 01", "Update Custom Data 01","(GMT-09:00) Alaska","Banking","Billing","Commercial","Check 13","02/18/2024","89.8"+randomnumber(),"Drop 13","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 13","89"+randomnumber(),"R13","5","Yes"},
	                {"AC1075", "Update Custom Data 02", "Update Custom Data 02","(GMT-09:00) Alaska","Banking","Billing","Commercial","Check 13","02/18/2024","89.8"+randomnumber(),"Drop 13","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 13","89"+randomnumber(),"R13","3","Yes"},
	                {"AC1076", "Update Custom Data 03", "Update Custom Data 03","(GMT-09:00) Alaska","Banking","Billing","Commercial","Check 13","02/18/2024","89.8"+randomnumber(),"Drop 13","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 13","89"+randomnumber(),"R13","4","Yes"}
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

