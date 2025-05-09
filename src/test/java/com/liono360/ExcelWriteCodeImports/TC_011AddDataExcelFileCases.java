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

public class TC_011AddDataExcelFileCases extends Baseclass{

	@Test
public void TryExcelFileWriteCodeTest() throws FileNotFoundException, IOException, InterruptedException {
	    
	    String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Cases\\Case_Add Imports_With Default Fileds 1.1.xlsx";
	
	    try (FileInputStream inputStream = new FileInputStream(filepath)) {
	    
	        Workbook workbook = new XSSFWorkbook(inputStream);
	 
	        Sheet sheet = workbook.getSheetAt(0);

	     
	        List<String[]> data = new ArrayList<>();
            int Rows=1;
	        while(Rows<=1) {
	        	
		   data.add(new String[]{ "", "Account","IMP Case Account","","","","","","","","","","Case Details No 1"+randomnumber(),"New","4/23/2024","Resolution Comment No 1"+randomnumber(),"All users","Automation Testing"});
		   data.add(new String[]{ "", "Lead","Imp Lead Case","","","","","","","","","","Case Details No 1"+randomnumber(),"New","4/23/2024","Resolution Comment No 1"+randomnumber(),"All users","Automation Testing"});
		   data.add(new String[]{ "", "Organization","LionOBytes Automation Pvt.Ltd","","","","","","","","","","Case Details No 1"+randomnumber(),"New","4/23/2024","Resolution Comment No 1"+randomnumber(),"All users","Automation Testing"});

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
	    @Test
		public  void AddwithcustomFileds() throws FileNotFoundException, IOException, InterruptedException {
		    

		    String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Cases\\Case_Add Imports_With Custom Fileds 1.2.xlsx";
		
		    try (FileInputStream inputStream = new FileInputStream(filepath)) {
		    
		        Workbook workbook = new XSSFWorkbook(inputStream);
		 
		        Sheet sheet = workbook.getSheetAt(0);

		     
		        List<String[]> data = new ArrayList<>();
	            int Rows=1;
		        while(Rows<=1) {
		       
		        	
		        	
		        	
		        	
		                data.add(new String[]{ "", "Account","IMP Case Account","","","","","","","","","","Case Details No 1"+randomnumber(),"New","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul","Check A","7/25/2025","Drop 1","Complete"+randomnumber(),"TRP"+randomnumber(),"Value 10","R10","4","Yes"});
				  		data.add(new String[]{ "", "Lead","Imp Lead Case","","","","","","","","","","Case Details No 1"+randomnumber(),"Assigned","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul","Check D","7/28/2025","Drop 2","Complete"+randomnumber(),"TRP"+randomnumber(),"Value 12","R12","3","Yes"});
				  		data.add(new String[]{ "", "Organization","LionOBytes Automation Pvt.Ltd","","","","","","","","","","Case Details No 1"+randomnumber(),"In-Progress","10/09/2023","Resolution Comment No 1"+randomnumber(),"All users","Akash Mogdul","Check B","7/29/2025","Drop 3","Complete"+randomnumber(),"TRP"+randomnumber(),"Value 13","R11","5","Yes"});	
		        	
		        	
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
	    
	
