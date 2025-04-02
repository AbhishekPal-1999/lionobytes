package ExcelWriteCodeImports;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class TC_001AddDataExcelFileLead extends Baseclass{

	@Test
	public void TryExcelFileWriteCodeTest() throws FileNotFoundException, IOException, InterruptedException {
	    
	    String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files\\Lead_Add Imports_With Default Fileds 1.1.xlsx";
	
	    try (FileInputStream inputStream = new FileInputStream(filepath)) {
	    
	        Workbook workbook = new XSSFWorkbook(inputStream);
	 
	        Sheet sheet = workbook.getSheetAt(0);

	     
	        List<String[]> data = new ArrayList<>();
            int Rows=1;
	        while(Rows<=5) {
	        data.add(new String[]{ "Mr.", "Kevin"+randomnumber(), "Alexander"+randomnumber() ,"Wright"+randomnumber(),"import"+randomnumber()+"@lionobytes.com","","","","7030205"+randomnumber(),"","","","","","","","","","Customer Service","","","","Hot","25898"+randomnumber(),"(GMT-10:00) Hawaii","Rupees - INR","IMP Lead","DBA1"+randomnumber(),"2550"+randomnumber(),"100-10000","$10M to more","General Partnerships","New","2001","Accounting","lead"+randomnumber()+"@lionobytes.com","9075628"+randomnumber(),"","","","","","20"+randomnumber(),"30"+randomnumber(),"Website","A","Cold","Note Added 1"+randomnumber(),"Billing","Commercial","1 Center Street Central Ward","Sector 5","USA","NJ","Newark","07102","","","","","","","",""});

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
		    

		    String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files\\Lead_Add Imports_With Custom Fileds 1.2.xlsx";
		
		    try (FileInputStream inputStream = new FileInputStream(filepath)) {
		    
		        Workbook workbook = new XSSFWorkbook(inputStream);
		 
		        Sheet sheet = workbook.getSheetAt(0);

		     
		        List<String[]> data = new ArrayList<>();
	            int Rows=1;
		        while(Rows<=5) {
			   data.add(new String[]{ "Mr.", "firstName"+randomnumber(), "MiddleName"+randomnumber() ,"LastName"+randomnumber(),"import"+randomnumber()+"@lionobytes.com","","","","7030205"+randomnumber(),"","","","","","","","","","Customer Service","","","","Hot","25898"+randomnumber(),"(GMT-10:00) Hawaii","Rupees - INR","IMP Lead","DBA"+randomnumber(),"89"+randomnumber(),"100-10000","$10M to more","General Partnerships","New","2001","Accounting","lead"+randomnumber()+"@lionobytes.com","9075628"+randomnumber(),"","","","","","20"+randomnumber(),"30"+randomnumber(),"Website","A","Cold","Note Added 1"+randomnumber(),"Billing","Commercial","1 Center Street Central Ward","Sector 5","USA","NJ","Newark","07102","","Check 10","02/15/2024","10."+randomnumber(),"Drop 10","Auto"+randomnumber(),"AutoFill"+randomnumber(),"Multi 10","89"+randomnumber(),"R10","4","Yes","",""});

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
	    
	
