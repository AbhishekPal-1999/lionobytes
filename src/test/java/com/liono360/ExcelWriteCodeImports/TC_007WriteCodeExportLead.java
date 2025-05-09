package com.liono360.ExcelWriteCodeImports;


import com.liono360.loginPage.Baseclass;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class TC_007WriteCodeExportLead extends Baseclass {


	 @Test
	    public void updateCsvFile() {

	        
	        String inputFile=System.getProperty("user.dir") + "\\TestData\\Export-Csv Files\\Lead-Export With Default Fileds.csv";
	        
	        
	        try {
	            updateCSV(inputFile);

	            System.out.println("CSV file has been updated successfully!");
	        } catch (CsvValidationException | IOException e) {
	            e.printStackTrace();
	        }
	    }
	public static void updateCSV(String inputFile) throws CsvValidationException, IOException {
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
	                nextLine[3] = "1021"+randomnumber();
	                nextLine[4] = "(GMT-09:00) Alaska";
	                nextLine[5] = "Rupees - PKR";
	                nextLine[6] = "Hot Lead";
	                nextLine[13] = "Super Admin";
	                nextLine[17] = "1001 or more";
	                nextLine[18] = "$1M to $2M";
	                nextLine[19] = "Cooperative Societies";
	                nextLine[20] = "Assigned";
	                nextLine[21] = "1998";
	                nextLine[22] = "Accounting";
	                nextLine[25] = "ATT Website";
	                nextLine[26] = "5++";
	                nextLine[27] = "Cold";
	             
	              
	                
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
	    public void CustomAddupdateCsvFile() {

	        
	        String inputFile=System.getProperty("user.dir") + "\\TestData\\Export-Csv Files\\Lead-Export with Custom Fileds.csv";
	        
	        
	        try {
	            updateCSV(inputFile);

	            System.out.println("CSV file has been updated successfully!");
	        } catch (CsvValidationException | IOException e) {
	            e.printStackTrace();
	        }
	    }
	public static void CustomAddupdateCSV(String inputFile) throws CsvValidationException, IOException {
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
	                nextLine[3] = "0248"+randomnumber();
	                nextLine[4] = "(GMT-09:00) Alaska";
	                nextLine[5] = "Baht - THB";
	                nextLine[6] = "201"+randomnumber();
	                nextLine[7] = "89."+randomnumber();
	                nextLine[8] = "MSA 2"+randomnumber();
	                nextLine[9] = "T1";
	                nextLine[10] = "Hot Lead";
	                nextLine[17] = "Super Admin";
	                nextLine[21] = "201-500";
	                nextLine[22] = "$3M to $5M";
	                nextLine[23] = "Private";
	                nextLine[24] = "Assigned";
	                nextLine[25] = "1998";
	                nextLine[26] = "Accounting";
	                nextLine[31] = "Book";
	                nextLine[32] = "AAA1";
	                nextLine[33] = "Cold";
	          

	                
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
