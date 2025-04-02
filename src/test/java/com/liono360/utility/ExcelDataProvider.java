package com.liono360.utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.ClassUtil.Ctor;
import com.github.javafaker.Faker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;
public class ExcelDataProvider {
	static Workbook wb=null; 
	Sheet sheet=null;
	FileInputStream fis;
	public ExcelDataProvider() throws IOException {
    fis=new FileInputStream("TestData\\TestDataProvider.xlsx"); 
		
		//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
		wb=new XSSFWorkbook(fis); 
		 //getting the XSSFSheet object at given index  
		 sheet=wb.getSheetAt(0); 
	}
	
	
	
	public String FirstName() throws IOException {
		Row row=sheet.getRow(MaxRow()); //returns the logical row  
		Cell cell=row.getCell(0); //getting the cell representing the given column  
		String FirstName = cell.getStringCellValue();    //getting cell value  
		System.out.println(FirstName);
		return FirstName;
	}
    
	
	public String MiddleName() throws IOException {
		Row row=sheet.getRow(RowNumber()); //returns the logical row  
		Cell cell=row.getCell(1); //getting the cell representing the given column  
		String Middlename  = cell.getStringCellValue();    //getting cell value  
		return Middlename;
	}
	
	public String LastName() throws IOException {
		Row row=sheet.getRow(MaxRow()); //returns the logical row  
		Cell cell=row.getCell(2); //getting the cell representing the given column  
		String LastName  = cell.getStringCellValue();    //getting cell value  
		return LastName;
	}
	public String StreetAddress() throws IOException {
		Row row=sheet.getRow(RowNumber()); //returns the logical row  
		Cell cell=row.getCell(5); //getting the cell representing the given column  
		String StreetAddress  = cell.getStringCellValue();    //getting cell value  
		return StreetAddress;
	}
	
	public String OrganizationName() throws IOException {
		Row row=sheet.getRow(MaxRow()); //returns the logical row  
		Cell cell=row.getCell(3); //getting the cell representing the given column  
		String AccounName  = cell.getStringCellValue();    //getting cell value  
		return AccounName;
	}
	
	public String PhoneNumber() throws IOException {
		Row row=sheet.getRow(RowNumber()); //returns the logical row  
		Cell cell=row.getCell(11); //getting the cell representing the given column  
		double PhoneNumber = cell.getNumericCellValue(); 
		String phone = Double.toString(PhoneNumber);
		//getting cell value  
		return phone;
	}
	
	public String Websites() throws IOException {
		Row row=sheet.getRow(RowNumber()); //returns the logical row  
		Cell cell=row.getCell(6); //getting the cell representing the given column  
		String websites  = cell.getStringCellValue();    //getting cell value  
		return websites;
	}
	
	
	public String Instagram() throws IOException {
		Row row=sheet.getRow(RowNumber()); //returns the logical row  
		Cell cell=row.getCell(7); //getting the cell representing the given column  
		String Instagram  = cell.getStringCellValue();    //getting cell value  
		return Instagram;
	}
	
	public String Facebook() throws IOException {
		Row row=sheet.getRow(RowNumber()); //returns the logical row  
		Cell cell=row.getCell(8); //getting the cell representing the given column  
		String Facebook  = cell.getStringCellValue();    //getting cell value  
		return Facebook;
	}
	
	public String Linkedin() throws IOException {
		Row row=sheet.getRow(RowNumber()); //returns the logical row  
		Cell cell=row.getCell(9); //getting the cell representing the given column  
		String Linkedin  = cell.getStringCellValue();    //getting cell value  
		return Linkedin;
	}
	
	public String Twitter() throws IOException {
		Row row=sheet.getRow(RowNumber()); //returns the logical row  
		Cell cell=row.getCell(10); //getting the cell representing the given column  
		String Twitter  = cell.getStringCellValue();    //getting cell value  
		return Twitter;
	}
	
	public String Tags() throws IOException {
//		Row row=sheet.getRow(RowNumber()); //returns the logical row  
//		Cell cell=row.getCell(4); //getting the cell representing the given column  
		Faker faker = new Faker();
		String tags  = faker.company().industry();
		String[] words = tags.split(" ");
		String firstWord = words[0];//getting cell value  
		return firstWord;
	}
	
	public String LocationID() throws IOException {
		Row row=sheet.getRow(RowNumber()); //returns the logical row  
		Cell cell=row.getCell(12); //getting the cell representing the given column  
		String locationid  = cell.getStringCellValue();    //getting cell value  
		return locationid;
	}
	
	
	public String LocationName() throws IOException {
		Row row=sheet.getRow(RowNumber()); //returns the logical row  
		Cell cell=row.getCell(13); //getting the cell representing the given column  
		String locationname  = cell.getStringCellValue();    //getting cell value  
		return locationname;
	}
	
	public String Comment() throws IOException {
		Row row=sheet.getRow(RowNumber()); //returns the logical row  
		Cell cell=row.getCell(14); //getting the cell representing the given column  
		String comment  = cell.getStringCellValue();    //getting cell value  
		return comment;
	}
	int RowNumber() {
		 int rownumber = (int)(Math.random() * 50 + 1);
		 return rownumber;
	}
	
	int MaxRow() {
		 int rownumber = (int)(Math.random() * 500 + 1);
		 return rownumber;
	}
}
