package com.liono360.utility;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcelSheet {

	

	    public static void main(String[] args) {
	        String filePath = "TestData.xlsx";
	        String sheetName = "Sheet1";  // Specify the name of the sheet you want to read
	        String[] cellAddresses = {"A1", "A3"};  // Specify the cell addresses you want to read

	        try (FileInputStream fileInputStream = new FileInputStream(filePath);
	             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

	            Sheet sheet = workbook.getSheet(sheetName);

	            for (String cellAddress : cellAddresses) {
	                Cell cell = sheet.getRow(getRowNumber(cellAddress)).getCell(getColumnNumber(cellAddress));

	                // Access the cell value based on the data type
	                CellType cellType = cell.getCellType();
	                if (cellType == CellType.STRING) {
	                    System.out.println(cell.getStringCellValue());
	                } else if (cellType == CellType.NUMERIC) {
	                    System.out.println(cell.getNumericCellValue());
	                } else if (cellType == CellType.BOOLEAN) {
	                    System.out.println(cell.getBooleanCellValue());
	                } else {
	                    // Handle other cell types as needed
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static int getRowNumber(String cellAddress) {
	        return Integer.parseInt(cellAddress.replaceAll("[^0-9]", "")) - 1;
	    }

	    private static int getColumnNumber(String cellAddress) {
	        return CellReference.convertColStringToIndex(cellAddress.replaceAll("[^A-Z,a-z]", ""));
	    }
	}



