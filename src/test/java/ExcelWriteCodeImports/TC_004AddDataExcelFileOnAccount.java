package ExcelWriteCodeImports;

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

public class TC_004AddDataExcelFileOnAccount extends Baseclass {

	@Test
	public void TryExcelFileWriteCodeTest() throws FileNotFoundException, IOException, InterruptedException {
	    

	    String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Accounts\\Account_Add Imports_With Default Fileds 1.1.xlsx";
	    try (FileInputStream inputStream = new FileInputStream(filepath)) {
	    
	        Workbook workbook = new XSSFWorkbook(inputStream);
	 
	        Sheet sheet = workbook.getSheetAt(0);

	     
	        List<String[]> data = new ArrayList<>();
            int Rows=1;
	        while(Rows<=5) {
		    data.add(new String[]{ "Mr.", "Kevin"+randomnumber(), "Alexander"+randomnumber() ,"Wright"+randomnumber(),"import"+randomnumber()+"@lionobytes.com","","","","7030205"+randomnumber(),"","","","","","","","","","Customer Service","","","","","Vendor","25898"+randomnumber(),"(GMT-10:00) Hawaii","Rupees - INR","VIP Account","DBA1"+randomnumber(),"2550"+randomnumber(),"100-10000","$10M to more","General Partnerships","Prospect","2001","Accounting","lead"+randomnumber()+"@lionobytes.com","9075628"+randomnumber(),"","","","","","20"+randomnumber(),"30"+randomnumber(),"Website","A","Billing","Commercial","1 Center Street Central Ward","Sector 5","USA","NJ","Newark","07102","","Account Created Successfully"+randomnumber(),"","","","","",""});
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
	public void AddWithCustomAccount() throws FileNotFoundException, IOException, InterruptedException {
	    

	    String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Accounts\\Account_Add Imports_With Custom Fileds 1.2.xlsx";
	    try (FileInputStream inputStream = new FileInputStream(filepath)) {
	    
	        Workbook workbook = new XSSFWorkbook(inputStream);
	 
	        Sheet sheet = workbook.getSheetAt(0);

	     
	        List<String[]> data = new ArrayList<>();
            int Rows=1;
	        while(Rows<=5) {
		   // data.add(new String[]{ "Mr", "William"+randomnumber(), "Robert"+randomnumber() ,"Martinez"+randomnumber(),"import"+randomnumber()+"2@lionobytes.com","","","","7030205"+randomnumber(),"","","","","","","","","","","Customer Service","","","","","","","TEST","","(GMT-10:00) Hawaii","Rupees - INR","A1Account","89"+randomnumber(),"89."+randomnumber(),"Mark 1"+randomnumber(),"T1","Desire 1"+randomnumber(),"","","1001+","$10M to more","Cooperative Societies","Prospect","2001","Accounting","","","","","","","","200","5001","Book","B++","Billing","Commercial","","","India","Assam","","","","Notes Added By Jonny 1"});
			    data.add(new String[]{ "Mr.", "William"+randomnumber(), "Robert"+randomnumber() ,"Martinez"+randomnumber(),"import"+randomnumber()+"@lionobytes.com","","","","7030205"+randomnumber(),"","","","","","","","","","Customer Service","","","","","Vendor","25898"+randomnumber(),"(GMT-10:00) Hawaii","Rupees - INR","VIP Account","DBA1"+randomnumber(),"2550"+randomnumber(),"100-10000","$10M to more","General Partnerships","Prospect","2001","Accounting","lead"+randomnumber()+"@lionobytes.com","9075628"+randomnumber(),"","","","","","20"+randomnumber(),"30"+randomnumber(),"Website","A","Billing","Commercial","1 Center Street Central Ward","Sector 5","USA","NJ","Newark","07102","","Account Created Successfully"+randomnumber(),"Check 10","03/30/2024","10."+randomnumber(),"Drop 10","TYM"+randomnumber(),"WQE"+randomnumber(),"Multi 10","89"+randomnumber(),"R10","4","Yes","","","","","","","","","",""});

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

	
	
	
	


	

	
	
	
	

