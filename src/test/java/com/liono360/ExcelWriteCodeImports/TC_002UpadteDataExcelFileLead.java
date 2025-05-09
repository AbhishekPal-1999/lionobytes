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

public class TC_002UpadteDataExcelFileLead extends Baseclass{

    @Test
    public void TryExcelFileWriteCodeTest() throws FileNotFoundException, IOException, InterruptedException {

    

	    String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files\\Lead_Update Imports_With Default Fileds 1.1.xlsx";
        

        int[] rowsToUpdate = {1, 2, 3}; //Rows 
        int[] columnsToUpdate = {20, 21, 1,24,26,48,49}; //Columns 

        String[][] newValues = {
                {"LD1005", "Imports-Leads", "Imports-Leads","(GMT-09:00) Alaska","HotLead","Mailing","Commercial"},
                {"LD1006", "Imports-Leads 1", "Imports-Leads 1","(GMT-09:00) Alaska","HotLead","Mailing","Residential"},
                {"LD1007", "Imports-Leads 2", "Imports-Leads 2","(GMT-09:00) Alaska","HotLead","Mailing","Commercial"}
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

    

	    String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files\\Lead_Update Imports_With Custom Fileds 1.2.xlsx";
        

        int[] rowsToUpdate = {1, 2, 3}; //Rows 
        int[] columnsToUpdate = {20, 21, 1,24,26,48,49,57,58,59,60,61,62,63,64,65,66,67}; //Columns 

        String[][] newValues = {
                {"LD1005", "Import_Lead 1", "Imports-Leads","(GMT-09:00) Alaska","HotLead","Billing","Residential","Check 13","02/18/2024","89.8"+randomnumber(),"Drop 13","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 13","89"+randomnumber(),"R13","5","Yes"},
                {"LD1006", "Import_Lead 2", "Imports-Leads 1","(GMT-09:00) Alaska","HotLead","Mailing","Residential","Check 13","02/18/2024","89.8"+randomnumber(),"Drop 13","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 13","90"+randomnumber(),"R13","4","Yes"},
                {"LD1007", "Import_Lead 3", "Imports-Leads 2","(GMT-09:00) Alaska","HotLead","Billing","Commercial","Check 13","02/18/2024","89.8"+randomnumber(),"Drop 13","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 13","91"+randomnumber(),"R13","3","No"}
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

