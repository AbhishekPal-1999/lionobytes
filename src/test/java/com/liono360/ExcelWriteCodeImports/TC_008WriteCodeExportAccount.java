package com.liono360.ExcelWriteCodeImports;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class TC_008WriteCodeExportAccount extends Baseclass{

	 @Test
	    public void updateCsvFile() {

	        String inputFile=System.getProperty("user.dir") + "\\TestData\\Export-Csv Files\\Account-Export With Default Fileds.csv";  
	        
	        
	        try {
	            // Call the updateCSV method to update "Lead Email" and "Lead Phone" columns
	            updateCSV(inputFile);

	            System.out.println("CSV file has been updated successfully!");
	        } catch (CsvValidationException | IOException e) {
	            e.printStackTrace();
	        }
	    }
	public static void updateCSV(String inputFile) throws CsvValidationException, IOException {
	    // Read data from the input CSV file and update the data in the temporary list
	    List<String[]> updatedData = new ArrayList<>();
	    try (CSVReader reader = new CSVReader(new FileReader(inputFile))) {
	        String[] nextLine;
	        boolean firstRow = true;
	        int updatedRows = 0; // Counter to track updated rows
	        while ((nextLine = reader.readNext()) != null) {
	            // Keep the header row unchanged
	            if (firstRow) {
	                updatedData.add(nextLine);
	                firstRow = false;
	                continue;
	            }

	            // Update "Lead Email" and "Lead Phone" columns (columns 9 and 10, 0-based index)
	            if (nextLine.length > 3 && updatedRows < 5) {
	                nextLine[3] = "TEST";
	                nextLine[4] = "23280"+randomnumber();
	                nextLine[5] = "(GMT-09:00) Alaska";
	                nextLine[6] = "Dollars - BMD";
	                nextLine[7] = "HotAccount";
	                nextLine[14] = "Super Admin";
	                nextLine[20] = "1001 or more";
	                nextLine[21] = "$3M to $5M";
	                nextLine[22] = "General Partnerships";
	                nextLine[23] = "Ex-Customer";
	                nextLine[24] = "1998";
	                nextLine[25] = "Accounting";
	                nextLine[30] = "Book";
	                nextLine[31] = "5++";
	                nextLine[34] = "Noida";
	                
	                
	                updatedRows++; 
	            }

	          
	            updatedData.add(nextLine);
	        }
	    }

	
	    try (CSVWriter writer = new CSVWriter(new FileWriter(inputFile))) {
	        writer.writeAll(updatedData);
	    }
	}
	 @Test
	    public void CustomupdateCsvFile() {

	        String inputFile=System.getProperty("user.dir") + "\\TestData\\Export-Csv Files\\Account-Export with Custom Fileds.csv";  
	        
	        
	        try {
	       
	            updateCSV(inputFile);

	            System.out.println("CSV file has been updated successfully!");
	        } catch (CsvValidationException | IOException e) {
	            e.printStackTrace();
	        }
	    }
	public static void CustomupdateCSV(String inputFile) throws CsvValidationException, IOException {
	 
	    List<String[]> updatedData = new ArrayList<>();
	    try (CSVReader reader = new CSVReader(new FileReader(inputFile))) {
	        String[] nextLine;
	        boolean firstRow = true;
	        int updatedRows = 0; 
	        while ((nextLine = reader.readNext()) != null) {
	       
	            if (firstRow) {
	                updatedData.add(nextLine);
	                firstRow = false;
	                continue;
	            }

	      
	            if (nextLine.length > 3 && updatedRows < 5) {
	                nextLine[3] = "TEST";
	                nextLine[4] = "23280"+randomnumber();
	                nextLine[5] = "(GMT-09:00) Alaska";
	                nextLine[6] = "Dollars - BMD";
	                nextLine[7] = "252"+randomnumber();
	                nextLine[8] = "89."+randomnumber();
	                nextLine[9] = "SAM 1"+randomnumber();
	                nextLine[10] = "T2";
	                nextLine[11] = "HotAccount";
	                nextLine[18] = "Super Admin";
	                nextLine[24] = "1001+";
	                nextLine[25] = "$1M to $2M";
	                nextLine[26] = "General Partnerships";
	                nextLine[27] = "Prospect";
	                nextLine[28] = "1998";
	                nextLine[29] = "Accounting";
	                nextLine[34] = "Book";
	                nextLine[35] = "B+";
	                nextLine[38] = "Noida";


	                
	                
	                updatedRows++; 
	            }


	            updatedData.add(nextLine);
	        }
	    }
	    try (CSVWriter writer = new CSVWriter(new FileWriter(inputFile))) {
	        writer.writeAll(updatedData);
	    }
	}
}
