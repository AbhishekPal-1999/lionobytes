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

public class TC_006AddAndUpdateDataExcelFileOnAccount extends Baseclass {



    @Test
    public void TryExcelFileWriteCodeTest() throws FileNotFoundException, IOException, InterruptedException {
    	 String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Accounts\\Account_AddAndUpdate Imports_With Default Fileds 1.1.xlsx";
         

         int[] rowsToUpdate = {1, 2, 3,4,5}; // Rows 
         int[] columnsToUpdate = {20, 21, 1,25,27,47,48}; //Columns 

         String[][] newValues = {
                 {"AC1077", "Import 01", "Import 01","(GMT-09:00) Alaska","Publishing","Billing","Commercial"},
                 {"AC1078", "Import 02", "Import 02","(GMT-09:00) Alaska","Publishing","Mailing","Commercial"},
                 {"AC1080", "Import 03", "Import 03","(GMT-09:00) Alaska","Publishing","Shipping","Commercial"},
                 {"", "", "Henry 1","(GMT-10:00) Hawaii","NewOne1","Billing","Commercial"},
                 {"", "", "Henry 2","(GMT-10:00) Hawaii","NewOne2","Billing","Commercial"}
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
    	 String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Accounts\\Account_AddAndUpdate Imports_With Custom Fileds 1.2.xlsx";
         

         int[] rowsToUpdate = {1, 2, 3,4,5}; // Rows 
         int[] columnsToUpdate = {20, 21, 1,25,27,47,48,57,58,59,60,61,62,63,64,65,66,67}; //Columns 

         String[][] newValues = {
                 {"AC1081", "Custom Import 01", "Custom Import 01","(GMT-09:00) Alaska","Public","Billing","Commercial","Check 13","02/18/2024","89.8"+randomnumber(),"Drop 13","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 13","89"+randomnumber(),"R13","2","Yes"},
                 {"AC1082", "Custom Import 02", "Custom Import 02","(GMT-09:00) Alaska","Public","Billing","Commercial","Check 13","02/18/2024","89.8"+randomnumber(),"Drop 13","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 13","89"+randomnumber(),"R13","3","Yes"},
                 {"AC1084", "Custom Import 03", "Custom Import 03","(GMT-09:00) Alaska","Public","Billing","Commercial","Check 13","02/18/2024","89.8"+randomnumber(),"Drop 13","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 13","89"+randomnumber(),"R13","4","Yes"},
                 {"", "", "Smith 1","(GMT-10:00) Hawaii","HotAccount","Billing","Commercial","Check 13","02/18/2024","89.8"+randomnumber(),"Drop 13","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 13","89"+randomnumber(),"R13","5","Yes"},
                 {"", "", "Smith 2","(GMT-10:00) Hawaii","HotAccount","Billing","Commercial","Check 13","02/18/2024","89.8"+randomnumber(),"Drop 13","Automation"+randomnumber(),"LionO"+randomnumber(),"Multi 13","89"+randomnumber(),"R13","5","Yes"}
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
