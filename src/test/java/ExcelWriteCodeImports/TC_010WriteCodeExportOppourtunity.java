package ExcelWriteCodeImports;

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

public class TC_010WriteCodeExportOppourtunity extends Baseclass{
	@Test
    public void updateCsvFile() {
       // String inputFile = "D:\\Akash\\Liono360\\TestData\\Account_Export_Csv_To_Import_89.csv"; // Replace with the path to your CSV file
        String inputFile=System.getProperty("user.dir") + "\\TestData\\Account_Export_Csv_To_Import_89.csv"; 
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
            if (nextLine.length > 9 && updatedRows < 5) {
                nextLine[9] = "Gupta8" + randomnumber() + "@check.com";
                nextLine[10] = "8989908" + randomnumber();
                updatedRows++; // Increment the counter for each updated row
            }

            // Add the updated row to the temporary list
            updatedData.add(nextLine);
        }
    }

    // Write the updated data back to the CSV file
    try (CSVWriter writer = new CSVWriter(new FileWriter(inputFile))) {
        writer.writeAll(updatedData);
    }
}

}
