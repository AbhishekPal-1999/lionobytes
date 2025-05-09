package com.liono360.ExcelWriteCodeImports;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;

public class TC_016WriteCodeUpdateLeadscontacts extends Baseclass{

	@Test
public void TryExcelFileWriteCodeTest() throws FileNotFoundException, IOException, InterruptedException {
	    
		String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files\\Lead_UpdateMultipleContacts.xlsx";

	
	    try (FileInputStream inputStream = new FileInputStream(filepath)) {
	    
	        Workbook workbook = new XSSFWorkbook(inputStream);
	 
	        Sheet sheet = workbook.getSheetAt(0);

	     
	        List<String[]> data = new ArrayList<>();
            int Rows=1;
	        while(Rows<=2) {
	      
		        data.add(new String[]{"Mr","James 5"+randomnumber(),"","Wood 4"+randomnumber(),"james"+randomnumber()+"1@gmail.com","","","","8989895"+randomnumber(),"","","","","","","","","","","","","LD21379","AddMultiContacts","","","","","","","","Billing","Commercial"});
	        int lastRowNum = sheet.getLastRowNum();
	        int rowNum = 1;
	        for (String[] rowData : data) {
	            Row row = sheet.createRow(rowNum++);     
	            int colNum = 0;
	            for (String cellData : rowData) {
	                Cell cell = row.createCell(colNum++);
	               
	                cell.setCellValue(cellData);
	            }
	        }
	        Rows=Rows+1;
	    }

	        try (FileOutputStream outputStream = new FileOutputStream(filepath)) {
	            workbook.write(outputStream);
	      
	        }
	
	        }
	    }
	}
	

