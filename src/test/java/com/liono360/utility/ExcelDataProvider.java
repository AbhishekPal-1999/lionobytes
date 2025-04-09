package com.liono360.utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.github.javafaker.Faker;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataProvider {
    static Workbook wb = null;
    Sheet sheet = null;

    public ExcelDataProvider() throws IOException {
        FileInputStream fis = new FileInputStream("TestData\\TestDataProvider.xlsx");
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheetAt(0); // Get the first sheet
    }

    // ---------- Helper Methods ----------
    private Row getSafeRow(int rowIndex) {
        Row row = sheet.getRow(rowIndex);
        if (row == null) {
            throw new RuntimeException("Row " + rowIndex + " is empty or not found.");
        }
        return row;
    }

    private Cell getSafeCell(Row row, int colIndex) {
        Cell cell = row.getCell(colIndex);
        if (cell == null) {
            throw new RuntimeException("Cell " + colIndex + " in row " + row.getRowNum() + " is empty.");
        }
        return cell;
    }

    private int RowNumber() {
        int totalRows = sheet.getLastRowNum();
        return 1 + (int) (Math.random() * totalRows); // avoid header row
    }

    private int MaxRow() {
        return RowNumber(); // Same as random for now
    }

    // ---------- Data Getters ----------
    public String FirstName() throws IOException {
        Row row = getSafeRow(MaxRow());
        Cell cell = getSafeCell(row, 0);
        return cell.getStringCellValue();
    }

    public String MiddleName() throws IOException {
        Row row = getSafeRow(RowNumber());
        Cell cell = getSafeCell(row, 1);
        return cell.getStringCellValue();
    }

    public String LastName() throws IOException {
        Row row = getSafeRow(MaxRow());
        Cell cell = getSafeCell(row, 2);
        return cell.getStringCellValue();
    }

    public String OrganizationName() throws IOException {
        Row row = getSafeRow(MaxRow());
        Cell cell = getSafeCell(row, 3);
        return cell.getStringCellValue();
    }

    public String Tags() {
        Faker faker = new Faker();
        String tags = faker.company().industry();
        return tags.split(" ")[0]; // first word only
    }

    public String StreetAddress() throws IOException {
        Row row = getSafeRow(RowNumber());
        Cell cell = getSafeCell(row, 5);
        return cell.getStringCellValue();
    }

    public String Websites() throws IOException {
        Row row = getSafeRow(RowNumber());
        Cell cell = getSafeCell(row, 6);
        return cell.getStringCellValue();
    }

    public String Instagram() throws IOException {
        Row row = getSafeRow(RowNumber());
        Cell cell = getSafeCell(row, 7);
        return cell.getStringCellValue();
    }

    public String Facebook() throws IOException {
        Row row = getSafeRow(RowNumber());
        Cell cell = getSafeCell(row, 8);
        return cell.getStringCellValue();
    }

    public String Linkedin() throws IOException {
        Row row = getSafeRow(RowNumber());
        Cell cell = getSafeCell(row, 9);
        return cell.getStringCellValue();
    }

    public String Twitter() throws IOException {
        Row row = getSafeRow(RowNumber());
        Cell cell = getSafeCell(row, 10);
        return cell.getStringCellValue();
    }

    public String PhoneNumber() throws IOException {
        Row row = getSafeRow(RowNumber());
        Cell cell = getSafeCell(row, 11);
        double num = cell.getNumericCellValue();
        return String.valueOf((long) num); // long to remove decimal
    }

    public String LocationID() throws IOException {
        Row row = getSafeRow(RowNumber());
        Cell cell = getSafeCell(row, 12);
        return cell.getStringCellValue();
    }

    public String LocationName() throws IOException {
        Row row = getSafeRow(RowNumber());
        Cell cell = getSafeCell(row, 13);
        return cell.getStringCellValue();
    }

    public String Comment() throws IOException {
        Row row = getSafeRow(RowNumber());
        Cell cell = getSafeCell(row, 14);
        return cell.getStringCellValue();
    }
}
