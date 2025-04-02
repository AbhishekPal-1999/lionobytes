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

public class TC_018AppendUpdateExcelcodeOnLeads extends Baseclass {


	@Test
public void TryExcelFileWriteCodeTest() throws FileNotFoundException, IOException, InterruptedException {
	    
		String filepath=System.getProperty("user.dir") + "\\TestData\\Lead_Custom_Append.xlsx";

	
	    try (FileInputStream inputStream = new FileInputStream(filepath)) {
	    
	        Workbook workbook = new XSSFWorkbook(inputStream);
	 
	        Sheet sheet = workbook.getSheetAt(0);

	     
	        List<String[]> data = new ArrayList<>();
            int Rows=1;
	        while(Rows<=1) {
	      
	        data.add(new String[]{"","","","","","","","","","","","","","","","","","","","","","LD1409","Append Leads","","","","","","","","","","",""});
	        //data.add(new String[]{"Mr","Automation89","","","workemail"+randomnumber()+"1@gmail.com","homeemail"+randomnumber()+"1@gmail.com","","","7030205"+randomnumber(),"8788526"+randomnumber(),"8275601"+randomnumber(),"","","","","","","","","","","AC7449","Automation89 Account","","","","","","","","","","",""});
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
	


	
	
	
	
	

